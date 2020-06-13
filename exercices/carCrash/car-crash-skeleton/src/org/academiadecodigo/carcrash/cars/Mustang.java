package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Mustang extends Car{

    public Mustang(Position position){
        super();
        setPos(position);
        setCrashed(false);
        getPos().setSpeed(2);
    }

    @Override
    public String toString() {
        return "M";
    }
}
