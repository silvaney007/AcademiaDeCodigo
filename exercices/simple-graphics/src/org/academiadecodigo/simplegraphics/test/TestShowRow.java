package org.academiadecodigo.simplegraphics.test;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class TestShowRow {
    public static void main(String[] args) {

        int cols = 10;
        int size = 50;
        int padding = 10;
        int space = 20;
        Rectangle[] squares = new Rectangle[cols];

        for (int i = 0; i < cols; i++) {
            squares[i] = new Rectangle(padding + (size+space)*i, 10, size, size);
            squares[i].setColor(Color.GREEN);
            squares[i].fill();
        }
    }
}