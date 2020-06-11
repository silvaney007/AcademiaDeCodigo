package org.academiadecodigo.felinux.diney.magiclamp;

public class Genie {
    private int maxWishes;
    private int count;

    public Genie (int maxWishes){
        this.maxWishes = maxWishes;
        this.count = 0;
    }

    public int grantWish(){
        if(count < maxWishes){
            count++;
            return 1;
        }
        return -1;
    }

    public int getMaxWishes() {
        return maxWishes;
    }
}
