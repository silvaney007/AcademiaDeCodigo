package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Ambulance extends Car{
    public Ambulance(Position position) {
        setPos(position);
        setCrashed(false);
        getPos().setSpeed(1);
    }
    @Override
    public String toString() {
        return "A";
    }
}