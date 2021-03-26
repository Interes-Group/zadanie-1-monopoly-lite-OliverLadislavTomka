package sk.stuba.fei.uim.oop.tiles;


import sk.stuba.fei.uim.oop.player.Player;
import sk.stuba.fei.uim.oop.game.Initialization;

import java.util.ArrayList;

public class TileBasicField extends Tile{
    int owner;
    int price;
    int fine;

    public TileBasicField(int numberOfTile) {
        super(numberOfTile);
        this.owner = 0;
        this.price = 5000;
        this.fine = 500;
        this.name = "Basic Field";
    }

    public int getFine() {
        return fine;
    }

    public int getPrice() {
        return price;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }


}
