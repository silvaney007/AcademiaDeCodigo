package org.academiadecodigo.felinux.diney;

public class Randomizer {

        public static int getRandom(int max, int min){
            int range = max - min + 1;
            return (int) (Math.random()*range) + min;
        }
    }
