package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.Randomizer;
import org.academiadecodigo.carcrash.field.Position;

abstract  public class Car {
    /**
     * The position of the car on the grid
     */
    private Position pos;
    private boolean crashed;

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return crashed;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public void setCrashed(boolean crashed) {
        this.crashed = crashed;
    }

    public void movePosition() {
        boolean success = false;
        while (!success) {
            switch (Randomizer.random(3)) {
                case 0: success = pos.backCol();
                    break;
                case 1: success = pos.frontCol();
                    break;
                case 2: success = pos.downRow();
                    break;
                case 3: success = pos.UpRow();
                    break;
                default:break;
            }
        }
    }
}
