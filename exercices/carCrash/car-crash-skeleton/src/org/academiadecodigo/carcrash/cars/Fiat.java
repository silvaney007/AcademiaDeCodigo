package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Fiat extends Car{

    public Fiat(Position position){
        super();
        setPosition(position);
        setCrashed(false);
        setSpeed(1);
    }

    @Override
    public String toString() {
        return "F";
    }
}
