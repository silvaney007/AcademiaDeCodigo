package org.academiadecodigo.felinux.mapeditor.grid;


import org.academiadecodigo.simplegraphics.graphics.Color;

public class Grid{

    public static final int PADDINGX = 20;
    public static final int PADDINGY = 60;
    public static final int CELLSIZE = 2;
    private Cell[][] cells;
    private int cols;
    private int rows;
    private Color gridColor;


    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        this.gridColor = Color.DARK_GRAY;
        cells = new Cell[cols][rows];
        buildGrind();
    }

    public void buildGrind() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(i, j, gridColor);
            }
        }
    }

    public void clearCells() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (!cells[i][j].isPainted()) {
                    continue;
                }
                cells[i][j].originColor();
            }
        }
    }

    public void fileToGrid(String file) {

        int index = 0;

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                Cell cell = cells[i][j];
                if (file.charAt(index) == 'x') {
                    cell.originColor();
                } else {
                    cell.paint(String.valueOf(file.charAt(index)));
                }
                index++;
            }
            index++;
        }
    }


    public Cell getCell(int col, int row) {
        return cells[col][row];
    }

    public void setCell(int col, int row, Cell cell) {
        cells[col][row] = cell;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                result.append(cells[i][j]);
            }
            result.append("\n");
        }
        return result.toString();
    }

}
