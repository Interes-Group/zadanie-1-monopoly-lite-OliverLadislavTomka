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
            int dice = diceRoll();
            int curPos = aktivniHraci.get(i).getPozicia();
            System.out.println(vypisMena + "'s turn!");
            System.out.println("Current position is " + curPos);
            System.out.println("Name of the tile is " + hraciePole.get(curPos).getName());


            if (aktivniHraci.get(i).isVezenie()) {

            }




            System.out.println("The dice number is " + dice);



            i++;
            if (i == aktivniHraci.size()) i = 0;
        }
    }


    public ArrayList<Player> vytvorHracov(){
        playerCount = KeyboardInput.readInt("Enter number of players");
        ArrayList<Player> aktivniHraci = new ArrayList<>();
        for (int i = 0; i < playerCount; i++) {
            Player newPlayer = new Player(KeyboardInput.readString("Zadajte meno hraca"), 30000,  false, 0, i+1);
            aktivniHraci.add(newPlayer);
        }
        return aktivniHraci;
    }

    public void vypisHracov(ArrayList<Player> cukrik){
        for (Player hrac : cukrik) {
            System.out.println(hrac.getId() + ".player's name is " + hrac.getMeno());
        }
    }

    public ArrayList<Tile> vytvorHraciePole(){
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
    public int diceRoll(){
        Random rand = new Random();
        int number = rand.nextInt((6-1)+1)+1;
        return number;
    }

}