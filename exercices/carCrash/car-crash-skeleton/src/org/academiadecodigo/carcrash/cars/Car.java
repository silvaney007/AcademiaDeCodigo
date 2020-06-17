package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.Randomizer;
import org.academiadecodigo.carcrash.field.Position;

abstract  public class Car {
    /**
     * The position of the car on the grid
     */
    private Position position;
    private boolean crashed = false;
    private int speed;


    public Position getPosition() {
        return position;
    }

    public boolean isCrashed() {
        return crashed;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setCrashed(boolean crashed) {
        this.crashed = crashed;
    }


    public void movePosition() {
        boolean success = false;
        while (!success) {
            switch (Randomizer.random(3)) {
                case 0: success = position.backCol();
                    break;
                case 1: success = position.frontCol();
                    break;
                case 2: success = position.downRow();
                    break;
                case 3: success = position.UpRow();
                    break;
                default:break;
            }
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
