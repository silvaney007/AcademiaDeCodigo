package org.academiadecodigo.simplegraphics.test;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        //FIRST testing
        Rectangle r1 = new Rectangle(0,10,40,40);
        r1.setColor(new Color(123,40,30));

        //fill method and the draw() method make the shape appear
        r1.fill();

        while(r1.getX()<=1000){
            Thread.sleep(50);
            r1.translate(1,0);
        }

        showRow();
        showGrid();

        //SECOND generate JAVADOC to discover the wonders <3
        // javadoc -d ./doc -sourcepath ./src -subpacages org


        //HOMEWORK
        //showRow(); // 10 squares, padding 10 px, space 20 px, size 50 px
        //showGrid(); // 10x10

        //LAST BUILD the jar file to distribute to use this library in other projects
        // ant
        // don't forget to import the jar in the project that needs the library

    }

    private static void showRow() throws InterruptedException {

        int cols = 10;
        int size = 50;
        int padding = 10;
        int space = 20;


    }

    private static void showGrid() throws InterruptedException {

        int cols = 10;
        int rows = 10;
        int size = 50;
        int padding = 10;
        int space = 20;

    }

}
