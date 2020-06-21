package org.academiadecodigo.felinux.diney.sniperelite;

import com.sun.source.tree.BreakTree;
import org.academiadecodigo.felinux.diney.sniperelite.gameobject.GameObject;
import org.academiadecodigo.felinux.diney.sniperelite.gameobject.Tree;
import org.academiadecodigo.felinux.diney.sniperelite.gameobject.destroyable.Destroyable;
import org.academiadecodigo.felinux.diney.sniperelite.gameobject.destroyable.barrel.Barrel;
import org.academiadecodigo.felinux.diney.sniperelite.gameobject.destroyable.enemy.ArmouredEnemy;
import org.academiadecodigo.felinux.diney.sniperelite.gameobject.destroyable.enemy.SoldierEnemy;
import org.academiadecodigo.felinux.diney.sniperelite.weapon.SniperElite;

public class Game {
    public static final int ARMOUREDENEMY_PROB = 6;
    public static final int TREE_PROB = 2;
    private GameObject[] gameObjects;
    private SniperElite sniperElite;
    private int shotsFired;

    public Game(int size){
        gameObjects = new GameObject[size];
        this.sniperElite =  new SniperElite(10);
        this.shotsFired = 0;
    }

    public void start(){

        for (int index = 0; index < gameObjects.length; index++){

            System.out.print("\n" + gameObjects[index].getMessage());

            if(!(gameObjects[index] instanceof Destroyable)){
                Tree tree =  (Tree) gameObjects[index];
            }else {
                System.out.print(", is my new target\n");
                Destroyable target = (Destroyable) gameObjects[index];
                while (!target.isDestroyed()) {
                    sniperElite.shoot(target);
                    shotsFired++;
                }
            }
            System.out.println("Target is down");
        }
        System.out.println("\n--------------------------------------------------------\n");
        System.out.println(" All target is dead, " + shotsFired + " was Shots");
    }

    public GameObject [] createObjects(){

        for (int i = 0; i < gameObjects.length; i++){
              if ((int) (Math.random()*10) < TREE_PROB){
                  gameObjects [i] = new Tree();
              }else{
                    gameObjects[i] = creatDestroyable() ;
                }
        }
        return gameObjects;
    }

    private GameObject creatDestroyable(){

        switch ((int) (Math.random()*10)){
            case 0: case 1: case 2: return new Barrel();
            default:
                if ((int) (Math.random() * 10) < ARMOUREDENEMY_PROB) {
                  return  new ArmouredEnemy();
                } else {
                  return  new SoldierEnemy();
                }
        }
    }
}
