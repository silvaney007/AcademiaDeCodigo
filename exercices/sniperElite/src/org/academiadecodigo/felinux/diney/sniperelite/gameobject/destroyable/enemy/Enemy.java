package org.academiadecodigo.felinux.diney.sniperelite.gameobject.destroyable.enemy;

import org.academiadecodigo.felinux.diney.sniperelite.gameobject.destroyable.Destroyable;
import org.academiadecodigo.felinux.diney.sniperelite.gameobject.GameObject;

public abstract class Enemy extends GameObject implements Destroyable {

    private int health = 100;
    private boolean destroyed =false;


    @Override
    public void hit(int hit){
        if (health <= 0){
            destroyed = true;
            return;
        }
        health -= hit;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

}
