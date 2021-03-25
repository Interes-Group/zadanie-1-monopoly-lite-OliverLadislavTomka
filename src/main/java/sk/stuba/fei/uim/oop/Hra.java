package sk.stuba.fei.uim.oop;

import java.util.*;

public class Hra {

    
    public ArrayList<Hrac> vytvorHracov(){
        int a = KeyboardInput.readInt("Zadajte pocet hracov");
        ArrayList<Hrac> aktivniHraci = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            Hrac cukrik = new Hrac(KeyboardInput.readString("Zadajte meno hraca"), 30000,  false, 0, i+1);
            aktivniHraci.add(cukrik);
        }
        vypisHracov(aktivniHraci);
        return aktivniHraci;
    }

    public void vypisHracov(ArrayList<Hrac> cukrik){
        for (Hrac hrac : cukrik) {
            System.out.print(hrac.getMeno());
        }
    }



}