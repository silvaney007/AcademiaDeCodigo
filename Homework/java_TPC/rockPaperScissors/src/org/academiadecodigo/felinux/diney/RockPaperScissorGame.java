package org.academiadecodigo.felinux.diney;

import org.academiadecodigo.felinux.diney.players.HandType;
import org.academiadecodigo.felinux.diney.players.Player;

public class RockPaperScissorGame {
    private int maxRounds;
    private int rounds = 0;

    private Player player1;
    private Player player2;

    public RockPaperScissorGame(int maxRounds, Player player1, Player player2) {
        this.maxRounds = maxRounds;
        this.player1 = player1;
        this.player2 = player2;
    }

    /**
     * Starts the game
     */
    public void start() {

        while(rounds < maxRounds) {
            playRound();
        }

        displayResults();
    }

    /**
     * Plays a round of the game
     */
    private void playRound() {

        HandType p1Hand = player1.pickAHand();
        HandType p2Hand = player2.pickAHand();

        System.out.println(player1.getName() + " has " + player1.getVictory()+ " victories, now chooses " + p1Hand);
        System.out.println(player2.getName() + " has " + player2.getVictory()+ " victories, now chooses " + p2Hand);


        // It's a tie, let' play another round
        if (p1Hand == p2Hand) {
            playRound();
            return;
        }

        rounds++;

        Player winner = player1;

        switch (p1Hand) {

            case PAPER:

                if (p2Hand == HandType.SCISSOR) {
                    winner = player2;
                }
                break;

            case ROCK:
                if (p2Hand == HandType.PAPER) {
                    winner = player2;
                }
                break;

            case SCISSOR:
                if (p2Hand == HandType.ROCK) {
                    winner = player2;
                }
                break;
        }

        winner.win();

    }


    private void displayResults() {

        System.out.println("=== GAME END ===");
        System.out.println(player1.getName() + " has " + player1.getVictory() + " victories");
        System.out.println(player2.getName() + " has " + player2.getVictory() + " victories");

        System.out.println("WINNER IS : " + (player1.getVictory() > player2.getVictory() ? player1.getName() : player2.getName()));

    }

}

