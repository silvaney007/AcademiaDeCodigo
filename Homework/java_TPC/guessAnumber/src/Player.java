public class Player {

    private int playerID;
    private int gameNumber;

    Player(int playerID){
        this.playerID = playerID;
    }

    public int pickANumber(int max, int min){
    gameNumber = Randomizer.randomBetween(max,min);
    return gameNumber;
    }

    public int getPlayerID() {
        return playerID;
    }

    public int getMyNumber() {
        return gameNumber;
    }
}
