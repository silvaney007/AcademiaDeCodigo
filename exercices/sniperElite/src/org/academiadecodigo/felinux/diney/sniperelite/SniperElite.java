package org.academiadecodigo.felinux.diney.sniperelite;

import org.academiadecodigo.felinux.diney.sniperelite.gameobject.enemy.Enemy;

public class SniperElite {
    private int bulletDamage;

    public SniperElite(int bulletDamage){
        this.bulletDamage = bulletDamage;
    }

    public void shoot(Enemy enemy){
        if(enemy.getHealth() <= 0){
            enemy.setDead(true);
            return;
        }
        int prob = Randomizer.random(10);
        if(prob > 8){
            return;
        }
        enemy.hit(bulletDamage);
    }
}
