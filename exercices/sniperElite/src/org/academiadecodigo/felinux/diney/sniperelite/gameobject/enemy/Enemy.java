package org.academiadecodigo.felinux.diney.sniperelite.gameobject.enemy;

import org.academiadecodigo.felinux.diney.sniperelite.gameobject.GameObject;

public abstract class Enemy extends GameObject {

    private int health = 10;
    private boolean isDead = false;

    public void hit(int hit){
        health -= hit;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
