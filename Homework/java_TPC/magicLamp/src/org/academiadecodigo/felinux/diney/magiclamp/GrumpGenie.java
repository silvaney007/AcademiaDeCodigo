package org.academiadecodigo.felinux.diney.magiclamp;

public class GrumpGenie extends Genie {
    private  boolean stopWish;

    public GrumpGenie (int maxWishes){
        super(maxWishes);
        this.stopWish = false;
    }

    @Override
    public int grantWish(){
        if(!stopWish){
            stopWish = true;
            return 1;
        }
        return -1;
    }
}
