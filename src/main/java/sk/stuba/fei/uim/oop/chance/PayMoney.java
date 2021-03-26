package sk.stuba.fei.uim.oop.chance;

import sk.stuba.fei.uim.oop.player.Player;

public class PayMoney extends Chance{

    public PayMoney() {
    }

    @Override
    public void funkcia(Player hrac, int posunutie, int peniaze) {
        int x = hrac.getPeniaze();
        x = x - peniaze;
        hrac.setPeniaze(x);
        System.out.println("You bought new car for " + peniaze + "$!");
    }
}
