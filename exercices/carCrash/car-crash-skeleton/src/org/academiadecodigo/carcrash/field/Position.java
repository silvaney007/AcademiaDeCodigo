package org.academiadecodigo.carcrash.field;

import org.academiadecodigo.carcrash.Randomizer;

public class Position {

    private int col;
    private int row;
    private TrackType trackType;

    public Position() {
        this.col = Randomizer.random(Field.getWidth());
        this.row = Randomizer.random(Field.getHeight());
        this.trackType = TrackType.START;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public boolean backCol() {
        if((col - 1) > 0 && !trackType.equals(TrackType.FRONT)){
            col -= 1;
            trackType = TrackType.BACK;
            return true;
        }
        return false;
    }

    public boolean frontCol() {
        if((col + 1) < Field.getWidth() && !trackType.equals(TrackType.BACK)){
            col += 1;
            trackType = TrackType.FRONT;
            return true;
        }
        return false;
    }

    public boolean downRow() {
        if( (row - 1) > 0 && !trackType.equals(TrackType.UP)){
            row -= 1;
            trackType = TrackType.DOWN;
            return true;
        }
        return false;
    }

    public boolean UpRow() {
        if((row + 1) < Field.getHeight() && !trackType.equals(TrackType.DOWN)){
            row += 1;
            trackType = TrackType.UP;
            return true;
        }
        return false;
    }
}