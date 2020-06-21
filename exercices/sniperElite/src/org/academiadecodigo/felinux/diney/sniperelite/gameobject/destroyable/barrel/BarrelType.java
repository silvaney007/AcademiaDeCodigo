package org.academiadecodigo.felinux.diney.sniperelite.gameobject.destroyable.barrel;

public enum BarrelType {

    PLASTIC(10),
    WOOD(20),
    METAL(30);

    private int maxDamage;

    BarrelType(int maxDamage){
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
}
