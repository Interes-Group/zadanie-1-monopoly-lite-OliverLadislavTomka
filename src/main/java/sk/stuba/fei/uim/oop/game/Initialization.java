package sk.stuba.fei.uim.oop.game;

import sk.stuba.fei.uim.oop.player.Player;
import sk.stuba.fei.uim.oop.tiles.*;
import sk.stuba.fei.uim.oop.tools.KeyboardInput;

import java.util.*;

public class Initialization {

    ArrayList<Player> aktivniHraci = vytvorHracov();
    ArrayList<Tile> hraciePole = vytvorHraciePole();
    int playerCount;





    //((TileChance)aktivniHraci.get(i)).

    public void hra(){
        int i = 0;
        while (aktivniHraci.size()>1){
            String vypisMena = aktivniHraci.get(i).getMeno();
            int curPos = aktivniHraci.get(i).getPozicia();
            System.out.println(vypisMena + "'s turn!");
            System.out.println("Current position is " + curPos);
            System.out.println("Name of the tile is " + hraciePole.get(curPos).getName());
            System.out.println("Money: " + aktivniHraci.get(i).getPeniaze());


            if (aktivniHraci.get(i).isVezenie()) {
                aktivniHraci.get(i).setVezenieCount(aktivniHraci.get(i).getVezenieCount()-1);
                if (aktivniHraci.get(i).getVezenieCount() == 0){
                    System.out.println("This is your last day in prison, next turn you can continue!");
                    aktivniHraci.get(i).setVezenie(false);
                }
                else {
                    System.out.println("Remaining turns in prison: " + aktivniHraci.get(i).getVezenieCount());
                }
            }
            else {
                int dice = diceRoll();
                System.out.println("You threw dice with number: " + dice);
                int newPos=aktivniHraci.get(i).getPozicia()+dice;
                if (newPos > 23) {
                    newPos = newPos % 24;
                    aktivniHraci.get(i).setPeniaze(aktivniHraci.get(i).getPeniaze()+3000);
                    System.out.println("Round bonus money is assigned to the player!");
                }
                aktivniHraci.get(i).setPozicia(newPos);
                System.out.println("New position is: " + newPos);
                System.out.println("Name of the tile is " + hraciePole.get(newPos).getName());


                if (hraciePole.get(newPos) instanceof TileBasicField){
                    if (((TileBasicField) hraciePole.get(newPos)).isOwned()){
                        aktivniHraci.get(i).setPeniaze(aktivniHraci.get(i).getPeniaze()-((TileBasicField) hraciePole.get(newPos)).getFine());
                        aktivniHraci.get(((TileBasicField) hraciePole.get(newPos)).getOwner()).setPeniaze(aktivniHraci.get(((TileBasicField) hraciePole.get(newPos)).getOwner()).getPeniaze()+ ((TileBasicField) hraciePole.get(newPos)).getFine());
                        System.out.println("You paid the fee for stepping on someone else Tile");
                    }
                    else {
                        System.out.print("Do you want to buy this Tile?");
                        boolean buyOrNot=KeyboardInput.readBoolean();
                        if (buyOrNot){
                            aktivniHraci.get(i).setPeniaze(aktivniHraci.get(i).getPeniaze()
                                    - ((TileBasicField) hraciePole.get(newPos)).getPrice());
                            ((TileBasicField) hraciePole.get(newPos)).setOwner(aktivniHraci.get(i).getId());
                            ((TileBasicField) hraciePole.get(newPos)).setOwned(true);
                        }
                    }
                }
                else if (hraciePole.get(newPos) instanceof TileChance){
                    System.out.println("YOU TOOK THE CHANCE CARD!");
                }
                else if (hraciePole.get(newPos) instanceof TileChill){
                    System.out.println("You are now in Chill and Relax zone.");
                }
                else if (hraciePole.get(newPos) instanceof TilePolice){
                    System.out.println("You visited POLICE and were moved to jail for 3 turns!");
                    aktivniHraci.get(i).setVezenie(true);
                    aktivniHraci.get(i).setVezenieCount(3);
                    aktivniHraci.get(i).setPozicia(6);
                }
                else if (hraciePole.get(newPos) instanceof TilePrison){
                    System.out.println("You visited your friend in prison!");
                }
                else if (hraciePole.get(newPos) instanceof TileStart){
                    System.out.println("You stepped on START! Your round bonus is doubled!");
                    aktivniHraci.get(i).setPeniaze(aktivniHraci.get(i).getPeniaze()+3000);
                }
                else if (hraciePole.get(newPos) instanceof TileSuperTax){
                    System.out.println("Oh no! You have to play superTax!");
                    aktivniHraci.get(i).setPeniaze(aktivniHraci.get(i).getPeniaze()- ((TileSuperTax) hraciePole.get(newPos)).getFine());
                }
                else if (hraciePole.get(newPos) instanceof TileTax){
                    System.out.println("Oh no! You have to play Tax!");
                    aktivniHraci.get(i).setPeniaze(aktivniHraci.get(i).getPeniaze()- ((TileTax) hraciePole.get(newPos)).getFine());
                }
            }


            System.out.print("\n\n--------------------------------------------\n\n");
            i++;
            if (aktivniHraci.get(i).getPeniaze() < 0){
                aktivniHraci.remove(i);
                i--;
            }
            if (i == aktivniHraci.size()) i = 0;
        }
    }


    private ArrayList<Player> vytvorHracov(){
        playerCount = KeyboardInput.readInt("Enter number of players");
        ArrayList<Player> aktivniHraci = new ArrayList<>();
        for (int i = 0; i < playerCount; i++) {
            Player newPlayer = new Player(KeyboardInput.readString("Zadajte meno hraca"), 30000,  false, 0, i+1);
            aktivniHraci.add(newPlayer);
        }
        return aktivniHraci;
    }


    private ArrayList<Tile> vytvorHraciePole(){
        ArrayList<Tile> hraciePole = new ArrayList<>();

        for (int i = 0; i < 24; i++) {
            switch (i){
                case 0:
                    var newStart = new TileStart(i);
                    hraciePole.add(newStart);
                    break;
                case 3:
                case 15:
                    var newChance = new TileChance(i);
                    hraciePole.add(newChance);
                    break;
                case 6:
                    var newPrison = new TilePrison(i);
                    hraciePole.add(newPrison);
                    break;
                case 9:
                    var newTax = new TileTax(i);
                    hraciePole.add(newTax);
                    break;
                case 12:
                    var newChill = new TileChill(i);
                    hraciePole.add(newChill);
                    break;
                case 18:
                    var newPolice = new TilePolice(i);
                    hraciePole.add(newPolice);
                    break;
                case 21:
                    var newSuperTax = new TileSuperTax(i);
                    hraciePole.add(newSuperTax);
                    break;
                default:
                    var newBasicField = new TileBasicField(i);
                    hraciePole.add(newBasicField);
                    break;
            }

        }
        return hraciePole;
    }
    private int diceRoll(){
        Random rand = new Random();
        int number = rand.nextInt((6-1)+1)+1;
        return number;
    }

}