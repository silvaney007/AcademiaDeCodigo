package org.academiadecodigo.felinux.diney;

public class Player {
    private String name;

    public Player(String name){
        this.name = name;
    }

    public HandType pickAHand(){
        return HandType.values()[Randomizer.getRandom(2,0)];
    }

    public String getName() {
        return name;
    }
}
