package org.academiadecodigo.felinux.diney.sniperelite;

import org.academiadecodigo.felinux.diney.sniperelite.gameobject.GameObject;
import org.academiadecodigo.felinux.diney.sniperelite.gameobject.Tree;
import org.academiadecodigo.felinux.diney.sniperelite.gameobject.enemy.ArmouredEnemy;
import org.academiadecodigo.felinux.diney.sniperelite.gameobject.enemy.Enemy;
import org.academiadecodigo.felinux.diney.sniperelite.gameobject.enemy.SoldierEnemy;

public class Game {
    private GameObject[] gameObjects;
    private SniperElite sniperElite;
    private int shotsFired;

    public Game(SniperElite sniperElite){
        this.sniperElite = sniperElite;
        this.shotsFired = 0;
    }

    public void start(){

        for (int index = 0; index < gameObjects.length; index++){
            if(gameObjects[index] instanceof Tree){
                Tree tree =  (Tree) gameObjects[index];
                System.out.println(tree.getMessage());
                continue;
            }else {
                Enemy enemy = (Enemy) gameObjects[index];
                System.out.println(enemy.getMessage());
                while (!enemy.isDead()) {
                    sniperElite.shoot(enemy);
                    shotsFired++;
                }
            System.out.println("Target is dead, was fired " + shotsFired + " Shots");
            shotsFired = 0;
            }
        }
    }

    public GameObject [] createObjects(int size){
        gameObjects = new GameObject[size];

        for (int i = 0; i < gameObjects.length; i++){
            int prob = Randomizer.random(10);
                if(prob >= 7 ) {
                    gameObjects[i] = new ArmouredEnemy();
                }else if ( prob >= 3 && prob < 7) {
                    gameObjects[i] = new SoldierEnemy();
                }else {
                    gameObjects [i] = new Tree();
        }
    }
        return gameObjects;
    }
}
