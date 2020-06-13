package org.academiadecodigo.felinux.diney.felinuxfarm;

public class Cat extends Felinux {

    public Cat(int id) {
        super(id);
    }

    @Override
    public void roars(){
        System.out.println("Miiaaauuu");
    }
}
