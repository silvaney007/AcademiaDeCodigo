package org.academiadecodigo.carcrash;

public class Randomizer {

    public static int randomBetween(int max, int min){
        int range = max - min + 1;
        return (int) (Math.random()*range) + min;
    }

    public static int random(int num){
        return  randomBetween(num,0);
    }
}
