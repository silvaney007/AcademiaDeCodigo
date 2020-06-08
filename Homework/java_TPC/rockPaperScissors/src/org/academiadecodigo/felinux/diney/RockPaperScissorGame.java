package org.academiadecodigo.felinux.diney;

public class RockPaperScissorGame {
   private Player playerOne;
   private Player playerTwo;
   private int rounds;

   public RockPaperScissorGame (Player playerOne, Player playerTwo, int rounds){
       this.playerOne = playerOne;
       this.playerTwo = playerTwo;
       this.rounds = rounds;
   }

   public void startGame(){
       boolean winner = false;
       int round = 1;
       while(!winner){

           HandType playerOneHand = playerOne.pickAHand();
           HandType playerTwoHand = playerTwo.pickAHand();

           if(playerOneHand == HandType.ROCK){
               if(playerTwoHand == HandType.ROCK){
                   System.out.println(playerOneHand + " VS " + playerTwoHand + " : Draw");
               }else if (playerTwoHand == HandType.SCISSOR){
                   System.out.println(playerOneHand + " VS " + playerTwoHand
                           + " || " + playerOne.getName() + " is the Winner");
                   winner = true;
               }else {
                   System.out.println(playerOneHand + " VS " + playerTwoHand
                           + " || " + playerTwo.getName() + " is the Winner");
                   winner = true;
               }
           }else if(playerOneHand == HandType.SCISSOR){
               if(playerTwoHand == HandType.ROCK){
                   System.out.println(playerOneHand + " VS " + playerTwoHand
                           + " || "+ playerOne.getName() + " is the Winner");
                   winner = true;
               }else if (playerTwoHand == HandType.SCISSOR){
                   System.out.println(playerOneHand + " VS " + playerTwoHand + ": Draw");
               }else {
                   System.out.println(playerOneHand + " VS " + playerTwoHand
                           + " || " + playerTwo.getName() + " is the Winner");
                   winner = true;
               }
           }else if(playerOneHand == HandType.PAPER){
               if(playerTwoHand == HandType.ROCK){
                   System.out.println(playerOneHand + " VS " + playerTwoHand
                           + " || " + playerOne.getName() + " is the Winner");
                   winner = true;
               }else if (playerTwoHand == HandType.SCISSOR){
                   System.out.println(playerOneHand + " VS " + playerTwoHand
                           + " || " + playerTwo.getName() + " is the Winner");
                   winner = true;
               }else {
                   System.out.println(playerOneHand + " VS " + playerTwoHand + ": Draw");
               }
           }
            round++;
           if(round  > rounds && !winner){
               System.out.println("No Winner");
               break;
           }
       }
   }
}

