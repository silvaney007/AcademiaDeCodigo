package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Ambulance extends Car{

    public Ambulance() {
        super();
        setPosition(new Position());
        setSpeed(1);
    }

    @Override
    public String toString() {
        return "+";
    }
}