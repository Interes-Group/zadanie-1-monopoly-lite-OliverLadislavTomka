package sk.stuba.fei.uim.oop.tiles;


public class TileBasicField extends Tile{
    private int owner;
    private int price;
    private int fine;
    private boolean isOwned;

    public TileBasicField(int numberOfTile) {
        super(numberOfTile);
        this.owner = 50;
        this.price = 5000;
        this.fine = 500;
        this.name = "Basic Field";
        this.isOwned = false;
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

    public boolean isOwned() {
        return isOwned;
    }

    public void setOwned(boolean owned) {
        isOwned = owned;
    }
}
