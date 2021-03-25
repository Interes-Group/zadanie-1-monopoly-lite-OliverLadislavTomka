package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class Hrac {
    String meno;
    int peniaze;
    int vezenieCount=0;
    boolean vezenie=false;
    int pozicia;
    int id;

    public Hrac(String meno, int peniaze, boolean vezenie, int pozicia,int id) {
        this.meno = meno;
        this.peniaze = peniaze;
        this.vezenie = vezenie;
        this.pozicia = pozicia;
        this.id = id;
    }

    public String getMeno() {
        return meno;
    }
}
