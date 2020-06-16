package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.Randomizer;
import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

public class CarFactory {

    private static Position position;

    public static Car getNewCar() {
        CarType[] carTypes = CarType.values();
        int randomCar = Randomizer.random(carTypes.length-1);
        position = new Position(Randomizer.random(Field.getWidth()), Randomizer.random(Field.getHeight()));

        switch (carTypes[randomCar]){
            case FIAT: return new Fiat(position);
            case MUSTANG: return new Mustang(position);
            case AMBULANCE: return new Ambulance(position);
            case TANK: return new Tank(position);
            default:break;
        }
        return null;
    }
}
