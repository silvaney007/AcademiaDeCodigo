package org.academiadecodigo.felinux.diney.sniperelite.gameobject.destroyable.barrel;

import org.academiadecodigo.felinux.diney.sniperelite.gameobject.GameObject;
import org.academiadecodigo.felinux.diney.sniperelite.gameobject.destroyable.Destroyable;

public class Barrel extends GameObject implements Destroyable {

    private BarrelType barrelType;
    private int currentDamage;
    private boolean destroyed;

    public Barrel(){
        BarrelType [] barrelTypes = BarrelType.values();
        this.barrelType = barrelTypes[(int)(Math.random()*barrelTypes.length)];
        currentDamage = 0;
        destroyed = false;
    }


    @Override
    public void hit(int hit) {
        if(currentDamage >= barrelType.getMaxDamage()){
            destroyed = true;
            return;
        }
        currentDamage += hit;
    }

    @Override
    public boolean isDestroyed() {
        return destroyed;
    }

    @Override
    public String getMessage() {
        return "Barrel";
    }
}
