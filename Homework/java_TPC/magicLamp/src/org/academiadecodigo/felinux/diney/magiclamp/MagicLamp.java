package org.academiadecodigo.felinux.diney.magiclamp;

import org.academiadecodigo.felinux.diney.magiclamp.genie.DemonGenie;
import org.academiadecodigo.felinux.diney.magiclamp.genie.GeniesType;

public class MagicLamp {

    private int lampCapacity;
    private int remainingGenies;
    private int totalRecharge;

    public MagicLamp(int lampCapacity){
        this.lampCapacity = lampCapacity;
        this.remainingGenies = 0;
        this.totalRecharge = 0;
    }

    public void rechargeLamp(DemonGenie demonGenie){
        if(demonGenie.isRecycled()) {
            remainingGenies = 0;
            totalRecharge++;
        }
    }
    public GeniesType rubLamp(){
        if(remainingGenies < lampCapacity){
            if(remainingGenies % 2 == 0){
                remainingGenies++;
                return GeniesType.FRIENDLY;
            }else {
                remainingGenies++;
                return GeniesType.GRUMP;
            }
        }
        return GeniesType.DEMON;
    }

    public void toCompare() {
        System.out.println(("MagicLamp{" +
                "lampCapacity=" + lampCapacity +
                ", remainingNumber=" + remainingGenies +
                ", totalRecharge=" + totalRecharge +
                '}'));
    }

    public int getLampCapacity() {
        return lampCapacity;
    }
}
