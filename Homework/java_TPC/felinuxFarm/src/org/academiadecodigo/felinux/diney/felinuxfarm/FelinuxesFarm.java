package org.academiadecodigo.felinux.diney.felinuxfarm;

import org.academiadecodigo.felinux.diney.felinuxfarm.felinux.Cat;
import org.academiadecodigo.felinux.diney.felinuxfarm.felinux.Felinux;
import org.academiadecodigo.felinux.diney.felinuxfarm.felinux.Tiger;

public class FelinuxesFarm {

    private boolean noTiger;

    public Felinux sell() {
        double catProbability = noTiger ? 1 : 0.99;
        return Math.random() < catProbability ? new Cat() : new Tiger();
    }


    public void sellState(Felinux felinux){
            if(felinux instanceof Tiger){
                noTiger = true;
                System.out.println("You are lucky, got a Tiger, but we can't sell more for today");
                return;
            }
        System.out.println("Sell cats is our shit");
    }
}



