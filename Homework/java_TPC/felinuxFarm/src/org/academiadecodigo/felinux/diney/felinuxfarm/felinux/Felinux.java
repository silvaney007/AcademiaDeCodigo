package org.academiadecodigo.felinux.diney.felinuxfarm.felinux;

public class Felinux {

    private static int id = 0;

    public Felinux() {
        this.id++;
    }

    public void roars(){
        System.out.println("Rooooaarrrs");
    }

    public int getId() {
        return id;
    }

}
