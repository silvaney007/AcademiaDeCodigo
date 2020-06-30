package org.academiadecodigo.felinux.diney.magiclamp.genie;

public class GrumpGenie extends Genie {
    private  boolean noWish;

    public GrumpGenie (int maxWishes){
        super(maxWishes);
    }

    @Override
    public void grantWish(){
            noWish = true;
    }
}

