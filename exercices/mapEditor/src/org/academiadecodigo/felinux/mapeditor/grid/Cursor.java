package org.academiadecodigo.felinux.mapeditor.grid;

import static org.academiadecodigo.felinux.mapeditor.grid.Grid.CELLSIZE;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Cursor extends Cell {

    public enum Direction {
        UP,
        DOWN,
        RIGHT,
        LEFT,
    }

    private Grid grid;
    private Color paintColor;

    public Cursor(Grid grid){
        super(0, 0, Color.GRAY);
        this.grid = grid;
        this.paintColor = Color.BLACK;
    }

    public void moveLeft(){
        if (col == 0) {
            return;
        }
        col--;
        cell.translate(-CELLSIZE, 0);
    }

    public void moveRight() {
        if (col == grid.getCols() - 1) {
            return;
        }
        col++;
        cell.translate(CELLSIZE, 0);
    }

    public void moveUp() {
        if (row == 0) {
            return;
        }
        row--;
        cell.translate(0, -CELLSIZE);
    }

    public void moveDown() {
        if (row == grid.getRows() - 1) {
            return;
        }
        row++;
        cell.translate(0, CELLSIZE);
    }

    public Color getPaintColor(){
        return paintColor;
    }

    public void setPaintColor(Color paintColor) {
        this.paintColor = paintColor;
    }
}


