package sk.stuba.fei.uim.oop.tiles;

public class TileSuperTax extends TileTax{
    private final int fine;
    public TileSuperTax(int numberOfTile) {
        super(numberOfTile);
        this.name = "SUPER TAX";
        this.fine = 2000;
    }

    public int getFine() {
        return fine;
    }
}
