package org.academiadecodigo.felinux.diney.felinuxfarm;

public class Main {

    public static void main(String[] args) {

        int felinuxNumber = 100;
        int percentage = (int) Math.random()*felinuxNumber;
        FelinuxFarm felinuxFarm = new FelinuxFarm(felinuxNumber);
        Felinux[] felinux = new Felinux[felinuxNumber];

        for (int index = 0; index < felinux.length; index++) {
            if (index == percentage){
                felinux[index] = new Tiger(index);
                continue;
            }
            felinux[index] = new Cat(index);
        }


    }
}
