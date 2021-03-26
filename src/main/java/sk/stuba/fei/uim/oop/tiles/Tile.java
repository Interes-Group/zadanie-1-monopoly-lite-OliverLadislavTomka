package sk.stuba.fei.uim.oop.tiles;

public abstract class Tile {
    private int numberOfTile;
    private boolean isBuyable;
    public String name;


    public Tile(int numberOfTile) {
        this.numberOfTile = numberOfTile;
        this.isBuyable = false;
    }

    public String getName() {
        return name;
    }
}
