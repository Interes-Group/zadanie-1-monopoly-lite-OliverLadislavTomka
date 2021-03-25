package sk.stuba.fei.uim.oop.tiles;

public class TileBasicField extends Tile{
    int owner;
    int price;
    int fine;

    public TileBasicField(int numberOfTile) {
        super(numberOfTile);
        this.owner = 0;
        this.price = 5000;
        this.fine = 500;
    }
}
