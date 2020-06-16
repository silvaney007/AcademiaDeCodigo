package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Mustang extends Car{

    public Mustang(Position position){
        super();
        setPosition(position);
        setCrashed(false);
        setSpeed(2);
    }

    @Override
    public String toString() {
        return "M";
    }
}
