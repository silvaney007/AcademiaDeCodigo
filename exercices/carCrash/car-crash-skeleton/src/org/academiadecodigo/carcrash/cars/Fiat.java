package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Fiat extends Car{

    public Fiat(Position position){
        super();
        setPos(position);
        setCrashed(false);
    }

    @Override
    public String toString() {
        return "F";
    }
}
