package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Tank extends Car {

    public Tank() {
        super();
        setPosition(new Position());
        setSpeed(1);
    }

    @Override
    public boolean isCrashed() {
        return false;
    }

    @Override
    public String toString() {
        return "T";
    }
}