package sk.stuba.fei.uim.oop.tiles;

public abstract class Tile {
    protected int numberOfTile;
    boolean isBuyable;
    String name;


    public Tile(int numberOfTile) {
        this.numberOfTile = numberOfTile;
        this.isBuyable = false;
    }

    public boolean isBuyable() {
        return isBuyable;
    }

    public int getNumberOfTile() {
        return numberOfTile;
    }

    public String getName() {
        return name;
    }
}
