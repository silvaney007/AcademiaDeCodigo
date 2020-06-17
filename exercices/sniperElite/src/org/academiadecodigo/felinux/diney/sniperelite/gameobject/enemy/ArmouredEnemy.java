package org.academiadecodigo.felinux.diney.sniperelite.gameobject.enemy;

public class ArmouredEnemy extends Enemy{
    private int armour;

    public ArmouredEnemy(){
        super();
        armour = 5;
    }

    @Override
    public void hit(int hit){
        if(armour > 0){
            armour -= hit;
            return;
        }
        setHealth(getHealth() - hit);
    }

    @Override
    public String getMessage(){
        return "I'm the Armoured, the Strong One ";
    }
}
