package org.academiadecodigo.felinux.diney.sniperelite;

public class main {
    public static void main(String[] args) {
        SniperElite sniperElite = new SniperElite(1);
        Game game = new Game(sniperElite);
        game.createObjects(10);
        game.start();
    }
}
