package org.academiadecodigo.felinux.diney;

public class RockPaperScissorDemo {
    public static void main(String[] args) {
        Player playerOne = new Player("Jones");
        Player playerTwo = new Player("Anna");
        RockPaperScissorGame theGame = new RockPaperScissorGame(playerOne,playerTwo,2);
        theGame.startGame();


    }
}
