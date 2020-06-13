package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Ambulance extends Car{

    public Ambulance(Position position) {
        super();
        setPos(position);
        setCrashed(false);
        setSpeed(1);
    }

    @Override
    public String toString() {
        return "+";
    }
}