package org.academiadecodigo.felinux.mapeditor.utilits;

public class Randomizer {

    public static int random(int max, int min) {
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }

    public static int random(int max) {
        return random(max, 0);
    }
}

