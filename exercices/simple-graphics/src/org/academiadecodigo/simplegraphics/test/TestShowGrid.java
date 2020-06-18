package org.academiadecodigo.simplegraphics.test;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class TestShowGrid {
    public static void main(String[] args){

        int cols = 10;
        int rows = 10;
        int size = 50;
        int padding = 10;
        int space = 20;
        int y = 0;
        int color =25;

        Rectangle[][] squares = new Rectangle[cols][rows];

        for (int i = 0; i < cols; i++) {
            int x = 0;
            for (int j = 0; j < rows; j++) {
                squares[i][j] = new Rectangle(padding, padding, size, size);
                squares[i][j].setColor(new Color(255-color,90,205));
                squares[i][j].fill();
                squares[i][j].translate(x, y);
                x += size + space;
            }
            y += size + space;
        }
    }
}
