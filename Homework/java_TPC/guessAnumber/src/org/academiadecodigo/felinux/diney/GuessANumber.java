package org.academiadecodigo.felinux.diney;

public class GuessANumber {
    private static Player [] players;
    private static Player winner;
    private static int min;
    private static int max;
    private static int numberToGuess;

    public GuessANumber(Player[] players,int min, int max) {
        this.players = players;
        this.min = min;
        this.max = max;
        numberToGuess = Randomizer.randomBetween(max,min);
    }

    private boolean findWinner(){
        for(Player player : players){
            if(player.pickANumber(max,min)==numberToGuess) {
                winner = player;
                return true;
            }
        }
        return false;
    }

    public void startGame(){
        int round =0;
        boolean findWinner = false;
        System.out.println("***** Let the Game Begin *****");
        do{
            System.out.println("Round: " + round);
            findWinner = findWinner();
            if(findWinner == true){
                System.out.println("Congratulations, the player with ID: "
                        + winner.getPlayerID() + " is The Winner, guessed the number " + winner.getMyGuessNumber());
            }else{
                System.out.println("No winner, try again");
            }
            round++;
        }while(findWinner == false);
    }

    public static int getMin() {
        return min;
    }

    public static int getMax() {
        return max;
    }
}