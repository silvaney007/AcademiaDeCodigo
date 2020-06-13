package org.academiadecodigo.carcrash.field;

public class Position {
    private int col;
    private int row;
    private int speed;
    private TrackType trackType;

    public Position(int col, int row) {
        this.col = col;
        this.row = row;
        this.speed = 1;
        this.trackType = TrackType.START;

    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public boolean backCol() {
        if((col - speed) >= 0 && !trackType.equals(TrackType.FRONT)){
            col -= speed;
            trackType = TrackType.BACK;
            return true;
        }
        return false;
    }

    public boolean frontCol() {
        if((col + speed) <= Field.getWidth() && !trackType.equals(TrackType.BACK)){
            col += speed;
            trackType = TrackType.FRONT;
            return true;
        }
        return false;
    }

    public boolean downRow() {
        if( (row - speed) >= 0 && !trackType.equals(TrackType.UP)){
            row -= speed;
            trackType = TrackType.DOWN;
            return true;
        }
        return false;
    }

    public boolean UpRow() {
        if((row + speed) <= Field.getHeight() && !trackType.equals(TrackType.DOWN)){
            row += speed;
            trackType = TrackType.UP;
            return true;
        }
        return false;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}