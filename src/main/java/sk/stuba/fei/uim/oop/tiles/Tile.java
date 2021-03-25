package sk.stuba.fei.uim.oop.tiles;

public abstract class Tile {
    protected int numberOfTile;
    int owner;
    boolean isBuyable;
    int price;
    int fine;


    public Tile(int numberOfTile, int owner, boolean isBuyable, int price, int fine) {
        this.numberOfTile = numberOfTile;
        this.owner = owner;
        this.isBuyable = isBuyable;
        this.price = price;
        this.fine = fine;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public int getFine() {
        return fine;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfTile() {
        return numberOfTile;
    }

}
