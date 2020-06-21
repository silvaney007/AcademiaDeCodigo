package org.academiadecodigo.felinux.diney.sniperelite.gameobject.enemy;

import org.academiadecodigo.felinux.diney.sniperelite.gameobject.destroyable.Destroyable;
import org.academiadecodigo.felinux.diney.sniperelite.gameobject.GameObject;

public abstract class Enemy extends GameObject implements Destroyable {

    private int health = 100;
    private boolean destroyed;


    @Override
    public void hit(int hit){
        health -= hit;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

}
