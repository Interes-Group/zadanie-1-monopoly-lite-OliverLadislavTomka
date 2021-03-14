package sk.stuba.fei.uim.oop;

public class Assignment1 {
    public static void main(String[] args) {
        int a = KeyboardInput.readInt(1,"Nezadali ste platny vstup! Program bude ukonceny");
        Hrac[] hrac = new Hrac[a];
        for (int i = 0 ; (i+1) <= a ; i++){
            hrac[i] = new Hrac(KeyboardInput.readString("Zadajte meno hraca"), 30000, true, false, 0);
        }
    }
}
