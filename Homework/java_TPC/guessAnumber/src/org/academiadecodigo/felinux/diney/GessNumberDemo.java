package org.academiadecodigo.felinux.diney;

public class GessNumberDemo {
    public static void main(String[] args) {

        Player[] players = new Player[5];
        theGame(players ,0 ,20, GameModeType.EASY, 4);
    }

    public static void theGame(Player[] players, int max, int min, GameModeType gameMode, int maxRound){

        for(int i=0; i<players.length;i++){
            players[i] = new Player(i+1);
        }
        GuessANumber game = new GuessANumber (players, max, min, gameMode, maxRound);
        System.out.println("--- " + players.length +
                " PLAYERS WILL TRY GUESS A NUMBER BETWEEN " +
                min + " AND " + max + " ---");
        game.startGame();
    }
}
