package org.academiadecodigo.felinux.diney.sniperelite.gameobject.enemy;

public class ArmouredEnemy extends Enemy{
    private int armour;

    public ArmouredEnemy(){
        super();
        armour = 20;
    }

    @Override
    public void hit(int hit){
        if(armour > 0){
            armour -= hit;
            return;
        }
        super.hit(hit);
    }

    @Override
    public String getMessage(){
        return "I'm the Armoured, the Strong One ";
    }
}
