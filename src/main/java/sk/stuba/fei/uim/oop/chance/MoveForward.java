package sk.stuba.fei.uim.oop.chance;


import sk.stuba.fei.uim.oop.player.Player;

public class MoveForward extends Chance{
    public MoveForward(){}

    @Override
    public void funkcia(Player hrac,int posunutie,int move) {
        int x = hrac.getPozicia()+move;
        x = x % 24;
        hrac.setPozicia(x);
        System.out.println("Player was teleported " + move + "tiles backwards");
    }
}
