package org.academiadecodigo.felinux.diney;

import org.academiadecodigo.felinux.diney.players.Player;

public class RockPaperScissorDemo {
    public static void main(String[] args) {
        Player playerOne = new Player("Jones");
        Player playerTwo = new Player("Anna");
        RockPaperScissorGame game = new RockPaperScissorGame(5, playerOne,playerTwo);
        System.out.println("Players: " + playerOne.getName() + " VS " + playerTwo.getName());
        game.start();


    }
}
