package org.academiadecodigo.felinux.diney.magiclamp.genie;

public class Genie {
    private int maxWishes;
    private int count;

    public Genie (int maxWishes){
        this.maxWishes = maxWishes;
        this.count = 0;
    }

    public void grantWish(){
        if(count < maxWishes){
            count++;
        }
    }

    public int getMaxWishes() {
        return maxWishes;
    }

    @Override
    public String toString() {
        return "Genie{" +
                "maxWishes=" + maxWishes +
                ", count=" + count +
                '}';
    }
}

