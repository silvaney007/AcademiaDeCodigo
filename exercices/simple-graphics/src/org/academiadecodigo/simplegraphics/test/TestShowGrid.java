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
        int position = size + space;

        Rectangle[][] squares = new Rectangle[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                squares[i][j] = new Rectangle(padding + position*i ,padding+position*j, size, size);
                squares[i][j].setColor(new Color(0,(i+j)*padding,255));
                squares[i][j].fill();
            }
        }
    }
}
