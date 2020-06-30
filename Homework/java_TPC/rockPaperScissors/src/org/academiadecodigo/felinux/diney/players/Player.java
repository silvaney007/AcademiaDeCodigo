package org.academiadecodigo.felinux.diney.players;

import org.academiadecodigo.felinux.diney.Randomizer;

public class Player {
    private String name;
    private int victory = 0;

    public Player(String name){
        this.name = name;
    }

    public HandType pickAHand(){
        return HandType.values()[Randomizer.getRandom(2,0)];
    }

    public String getName() {
        return name;
    }

    public int getVictory(){
        return victory;
    }

    public void win() {
        victory++;
    }
}
