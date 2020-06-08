package org.academiadecodigo.felinux.diney;

public class GuessANumber {
    private Player [] players;
    private int min;
    private int max;
    private GameModeType gameMode;
    private int numberToGuess;
    private int maxRound;

    public GuessANumber(Player[] players,int min, int max, GameModeType gameMode, int maxRound) {
        this.players = players;
        this.min = min;
        this.max = max;
        this.gameMode = gameMode;
        this.maxRound = maxRound;
        numberToGuess = Randomizer.randomBetween(max,min);
    }

    private boolean findWinnerEasyMode(){
        for(Player player : players){
            if(player.pickANumber(max,min)==numberToGuess) return true;
        }
        return false;
    }

    private boolean findWinnerHardMode() {
        int[] numbersTryed = new int[(max - min) + 1];
        int i = 0;
        while (i < numbersTryed.length){
            for (Player player : players) {
                int playerGuess = player.pickANumber(max,min);
                if (i == 0) {
                    numbersTryed[i] = playerGuess;
                } else {
                    for (int j = 0; j <= i; j++) {
                        if (playerGuess == numbersTryed[j]) {
                            do {
                               playerGuess = player.pickANumber(max, min);
                            } while (playerGuess == numbersTryed[j]);
                            numbersTryed[j] = playerGuess;
                        }
                    }
                }
                if (playerGuess == numberToGuess) return true;
                i++;
                if(i == numbersTryed.length) return false;
            }
        }
        return false;
    }

    public void startGame(){
        int round = 1;
        boolean winner = false;
        System.out.println("***** Let the Game Begin *****");
        while(!winner){
            System.out.println("Round: " + round);
            if (gameMode == GameModeType.EASY) winner = findWinnerEasyMode();
            if (gameMode == GameModeType.HARD) winner = findWinnerHardMode();
            if(winner == true){
                System.out.println("The Winner, guessed the number " + numberToGuess);
            }else{
                System.out.println("No winner, try again");
            }
            round++;
            if(round > maxRound & !winner){
                System.out.println("The game End without winner");
                break;
            }
        }
    }
}