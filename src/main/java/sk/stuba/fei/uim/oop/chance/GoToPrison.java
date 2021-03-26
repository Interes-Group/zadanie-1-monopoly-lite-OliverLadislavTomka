package sk.stuba.fei.uim.oop.chance;

import sk.stuba.fei.uim.oop.player.Player;

public class GoToPrison extends Chance{
    public GoToPrison() {
    }

    @Override
    public void funkcia(Player hrac, int posunutie, int peniaze) {
        hrac.setPozicia(6);
        hrac.setVezenie(true);
        hrac.setVezenieCount(1);
        System.out.println("You were moved to PRISON for 1 turn!");
    }
}
