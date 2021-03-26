package sk.stuba.fei.uim.oop.player;

public class Player {
    String meno;
    int peniaze;
    int vezenieCount=0;
    boolean vezenie=false;
    int pozicia;
    int id;

    public Player(String meno, int peniaze, boolean vezenie, int pozicia, int id) {
        this.meno = meno;
        this.peniaze = peniaze;
        this.vezenie = vezenie;
        this.pozicia = pozicia;
        this.id = id;
    }

    public String getMeno() {
        return meno;
    }

    public int getId() { return id; }

    public int getPozicia() {
        return pozicia;
    }

    public void setPozicia(int pozicia) {
        this.pozicia = pozicia;
    }

    public int getPeniaze() {
        return peniaze;
    }

    public void setPeniaze(int peniaze) {
        this.peniaze = peniaze;
    }

    public int getVezenieCount() {
        return vezenieCount;
    }

    public void setVezenieCount(int vezenieCount) {
        this.vezenieCount = vezenieCount;
    }

    public boolean isVezenie() {
        return vezenie;
    }

    public void setVezenie(boolean vezenie) {
        this.vezenie = vezenie;
    }

}
