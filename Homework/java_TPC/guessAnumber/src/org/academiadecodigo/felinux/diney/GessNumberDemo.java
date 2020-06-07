package org.academiadecodigo.felinux.diney;

public class GessNumberDemo {
    public static void main(String[] args) {

        Player[] players = new Player[5];
        gameMode(players ,0 ,20);
    }

    public static void gameMode(Player[] players, int max, int min){

        for(int i=0; i<players.length;i++){
            players[i] = new Player(i+1);
        }
        GuessANumber theGame = new GuessANumber (players,max,min);
        System.out.println("--- " + players.length +
                " PLAYERS WILL TRY GUESS A NUMBER BETWEEN " +
                theGame.getMin()+ " AND " + theGame.getMax() + " ---");
        theGame.startGame();
    }
}
