package org.academiadecodigo.felinux.diney.sniperelite;

import org.academiadecodigo.felinux.diney.sniperelite.gameobject.destroyable.Destroyable;

public class SniperElite {
    private int bulletDamage;

    public SniperElite(int bulletDamage){
        this.bulletDamage = bulletDamage;
    }

    public void shoot(Destroyable target){
        if(target.isDestroyed()){
            return;
        }
        target.hit(bulletDamage);
    }
}
