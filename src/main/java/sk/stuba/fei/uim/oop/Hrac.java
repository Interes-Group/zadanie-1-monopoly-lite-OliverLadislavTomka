package sk.stuba.fei.uim.oop;

public class Hrac {
    String meno;
    int peniaze;
    boolean zivot;
    boolean vezenie;
    int pozicia;

    public Hrac(String meno, int peniaze, boolean zivot, boolean vezenie, int pozicia) {
        this.meno = KeyboardInput.readString("Zadajte meno hraca: ");
        this.peniaze = 50000;
        this.zivot = true;
        this.vezenie = false;
        this.pozicia = 0;
    }
}
