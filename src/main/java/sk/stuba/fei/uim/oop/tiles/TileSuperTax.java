package sk.stuba.fei.uim.oop.tiles;

public class TileSuperTax extends TileTax{
    public TileSuperTax(int numberOfTile, int owner, boolean isBuyable, int price, int fine) {
        super(numberOfTile, 0, false, 0, 2000);
    }
}
