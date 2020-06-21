package org.academiadecodigo.felinux.diney.felinuxfarm;

import org.academiadecodigo.felinux.diney.felinuxfarm.felinux.Felinux;

public class Main {

    public static void main(String[] args) {


        System.out.println("\n ---- Welcome to our farm ---- ");
        FelinuxesFarm felinuxesFarm = new FelinuxesFarm();
        Felinux[] felinuxes = new Felinux[100];
        int count = 0;

        System.out.println("--- You want ---" + felinuxes.length + "--- Felinux ---" );
        for (int i = 0; i < felinuxes.length; i++) {
            System.out.println("\nNumber: " + ++count);
            felinuxes[i] = felinuxesFarm.sell();
            felinuxes[i].roars();
            felinuxesFarm.sellState(felinuxes[i]);

        }
        System.out.println("\nThank you for the choose");
    }
}
