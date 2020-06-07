public class Player {

    private int playerID;
    private int myGuessNumber;

    Player(int playerID){
        this.playerID = playerID;
    }

    public int pickANumber(int max, int min){
    myGuessNumber = Randomizer.randomBetween(max,min);
    return myGuessNumber;
    }

    public int getPlayerID() {
        return playerID;
    }

    public int getMyGuessNumber() {
        return myGuessNumber;
    }
}
