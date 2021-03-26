package sk.stuba.fei.uim.oop.tiles;

public class TileTax extends Tile{
    int fine;
    public TileTax(int numberOfTile) {
        super(numberOfTile);
        this.name = "TAX";
        this.fine = 1000;
    }

    public int getFine() {
        return fine;
    }
}
