package sk.stuba.fei.uim.oop.game;

import sk.stuba.fei.uim.oop.player.Player;
import sk.stuba.fei.uim.oop.tiles.*;
import sk.stuba.fei.uim.oop.tools.KeyboardInput;

import java.util.*;

public class Initialization {

    ArrayList<Player> aktivniHraci = vytvorHracov();
    ArrayList<Tile> hraciePole;
    
    public ArrayList<Player> vytvorHracov(){
        int a = KeyboardInput.readInt("Enter number of players");
        ArrayList<Player> aktivniHraci = new ArrayList<>();
        for (int i = 0; i < a; i++) {
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
                    var newStart = new TileStart(i,0,false,0,0);
                    hraciePole.add(newStart);
                    break;
                case 3:
                case 15:
                    var newChance = new TileChance(i,0,false,0,0);
                    hraciePole.add(newChance);
                    break;
                case 6:
                    var newPrison = new TilePrison(i,0,false,0,0);
                    hraciePole.add(newPrison);
                    break;
                case 9:
                    var newTax = new TileTax(i,0,false,0,1000);
                    hraciePole.add(newTax);
                    break;
                case 12:
                    var newChill = new TileChill(i,0,false,0,0);
                    hraciePole.add(newChill);
                    break;
                case 18:
                    var newPolice = new TilePolice(i,0,false,0,0);
                    hraciePole.add(newPolice);
                    break;
                case 21:
                    var newSuperTax = new TileSuperTax(i,0,false,0,1000);
                    hraciePole.add(newSuperTax);
                    break;
                default:
                    var newBasicField = new TileBasicField(i,0,false,0,1000);
                    hraciePole.add(newBasicField);
                    break;
            }

        }
        return hraciePole;
    }
}