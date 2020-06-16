package org.academiadecodigo.carcrash;

import org.academiadecodigo.carcrash.cars.Ambulance;
import org.academiadecodigo.carcrash.cars.Car;
import org.academiadecodigo.carcrash.cars.CarFactory;
import org.academiadecodigo.carcrash.cars.Tank;
import org.academiadecodigo.carcrash.field.Field;

public class Game {

    public static final int MANUFACTURED_CARS = 25;

    /**
     * Container of Cars
     */
    private Car[] cars;

    /**
     * Animation delay
     */
    private int delay;

    public Game(int cols, int rows, int delay) {

        Field.init(cols, rows);
        this.delay = delay;

    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        cars = new Car[MANUFACTURED_CARS];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarFactory.getNewCar();
        }

        Field.draw(cars);

    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            // Move all cars
            moveAllCars();

            // Update screen
            Field.draw(cars);

        }
    }

    private void moveAllCars() {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].isCrashed()) {
                continue;
            }
            cars[i].movePosition();
            for (int j = 0; j < cars.length; j++) {
                if (i == j) {
                    continue;
                }
                if (cars[i].getPosition().getCol() == cars[j].getPosition().getCol()
                        && cars[i].getPosition().getRow() == cars[j].getPosition().getRow())
                {
                    if (cars[i] instanceof Ambulance) {
                        cars[j].setCrashed(false);
                    }else{
                        if (!(cars[i] instanceof Tank) && cars[j] instanceof Ambulance){
                            continue;
                        } else {
                            cars[i].setCrashed(true);
                            cars[j].setCrashed(true);
                        }
                    }
                }
            }
        }
    }
}
