package org.academiadecodigo.felinux.diney;

public class Player {

    private int playerID;

    Player(int playerID){
        this.playerID = playerID;
    }

    public int pickANumber(int max, int min){
    return Randomizer.randomBetween(max,min);
    }

    public int getPlayerID() {
        return playerID;
    }
}
