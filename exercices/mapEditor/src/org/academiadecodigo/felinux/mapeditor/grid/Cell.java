package org.academiadecodigo.felinux.mapeditor.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import static org.academiadecodigo.felinux.mapeditor.grid.Grid.CELLSIZE;
import static org.academiadecodigo.felinux.mapeditor.grid.Grid.PADDINGX;
import static org.academiadecodigo.felinux.mapeditor.grid.Grid.PADDINGY;


public class Cell {

    protected Rectangle cell;
    protected int col;
    protected int row;
    private boolean painted;
    private  Color originColor;
    private Color paintColor;

    public Cell(int col, int row, Color originColor){
        this.col = col;
        this.row = row;
        this.originColor = originColor;
        cell = new Rectangle(PADDINGX + CELLSIZE*col, PADDINGY + CELLSIZE*row, CELLSIZE, CELLSIZE);
        cell.setColor(originColor);
        cell.fill();
    }

    public void paint(String colorCode){
        painted = true;
        paintColor = ColorType.getColor(colorCode);
        cell.setColor(paintColor);
        cell.fill();
    }

    public void originColor(){
        painted = false;
        cell.setColor(originColor);
        cell.fill();
    }

    public boolean isPainted() {
        return painted;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    @Override
    public String toString() {
        return isPainted()? ColorType.colorCode(paintColor) : "x";
    }

}
