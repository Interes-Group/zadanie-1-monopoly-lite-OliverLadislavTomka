package sk.stuba.fei.uim.oop.chance;

import sk.stuba.fei.uim.oop.player.Player;

public class GetMoney extends Chance{
    public GetMoney(){

    }

    @Override
    public void funkcia(Player hrac, int posunutie, int peniaze) {
        int x = hrac.getPeniaze();
        x = x + peniaze;
        hrac.setPeniaze(x);
        System.out.println("You were awarded " + peniaze + "$!");
    }
}
