package org.academiadecodigo.felinux.diney.sniperelite.weapon;

import org.academiadecodigo.felinux.diney.sniperelite.gameobject.destroyable.Destroyable;

public class SniperElite {
    private int bulletDamage;
    public static final int HIT_PROB = 8;

    public SniperElite(int bulletDamage){
        this.bulletDamage = bulletDamage;
    }

    public void shoot(Destroyable target){
        if(target.isDestroyed()){
            return;
        }
        if((int)(Math.random()*10) < HIT_PROB){
            target.hit(bulletDamage);
            switch ((int)(Math.random()*10)){
                case 0: case 1: case 2: case 3:
                case 4: case 5:
                    System.out.println("Pan");
                default:
                    System.out.println("Pun");
            }
        }else {
            System.out.println("Shit i failed");
        }
    }
}
