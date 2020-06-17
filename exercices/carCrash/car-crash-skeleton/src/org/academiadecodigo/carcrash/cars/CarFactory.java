package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.Randomizer;
import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

public class CarFactory {

    public static Car getNewCar() {
        CarType[] carTypes = CarType.values();
        int randomCar = Randomizer.random(carTypes.length-1);

        switch (carTypes[randomCar]){
            case FIAT: return new Fiat();
            case MUSTANG: return new Mustang();
            case AMBULANCE: return new Ambulance();
            case TANK: return new Tank();
            default:return new Fiat();
        }
    }
}
