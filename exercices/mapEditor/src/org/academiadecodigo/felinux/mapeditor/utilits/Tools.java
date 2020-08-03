package org.academiadecodigo.felinux.mapeditor.utilits;

import org.academiadecodigo.felinux.mapeditor.MapEditor;
import org.academiadecodigo.felinux.mapeditor.grid.Cursor;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;


public class Tools implements MouseHandler {

    private Mouse mouse;
    private Rectangle[][] gridTools;
    private Cursor cursor;
    private int CELLSIZE = 20;
    private int PADDINGX = 20;
    private int PADDINGY = 35;
    private Text text1;
    private Text text2;
    private static final String PRINT1 = "[ArrowKeys]-Move  [S]-Save  [L]-Load  [R]-RandomColor";
    private static final String PRINT2 = "[SpaceBar]-PaintCell  [U]-ClearCell -  [C]-clearAll  [Mouse]-setColor";

    public Tools(Cursor cursor) {
        gridTools = new Rectangle[10][1];
        this.cursor = cursor;
        mouse = new Mouse(this);
        this.text1 = new Text(20, 5, PRINT1);
        this.text2 = new Text(20, 18, PRINT2);

    }

    public void init() {

        for (int i = 0; i < gridTools.length; i++) {
            gridTools[i][0] = new Rectangle(PADDINGX + CELLSIZE * i, PADDINGY, CELLSIZE, CELLSIZE);
        }

        gridTools[0][0].setColor(Color.MAGENTA);
        gridTools[1][0].setColor(Color.BLACK);
        gridTools[2][0].setColor(Color.WHITE);
        gridTools[3][0].setColor(Color.GREEN);
        gridTools[4][0].setColor(Color.YELLOW);
        gridTools[5][0].setColor(Color.RED);
        gridTools[6][0].setColor(Color.BLUE);
        gridTools[7][0].setColor(Color.ORANGE);
        gridTools[8][0].setColor(Color.PINK);
        gridTools[9][0].setColor(Color.LIGHT_GRAY);

        for (int i = 0; i < gridTools.length; i++) {
            gridTools[i][0].fill();
        }

        text1.setColor(Color.BLACK);
        text2.setColor(Color.BLACK);
        text1.draw();
        text2.draw();

        mapMouse();

    }

    private void mapMouse() {
        mouse.addEventListener(new MouseEvent(0,0,MouseEventType.MOUSE_CLICKED).getEventType());
    }


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

        if (mouseEvent.getY() < (CELLSIZE + 35) && mouseEvent.getY() > (CELLSIZE + 55)) {
            return;
        }

        if (mouseEvent.getX() >= CELLSIZE && mouseEvent.getX() < CELLSIZE * 2) {
            cursor.setPaintColor(Color.MAGENTA);
        }
        if (mouseEvent.getX() >= CELLSIZE * 2 && mouseEvent.getX() < CELLSIZE * 3) {
            cursor.setPaintColor(Color.BLACK);
        }
        if (mouseEvent.getX() >= CELLSIZE * 3 && mouseEvent.getX() < CELLSIZE * 4) {
            cursor.setPaintColor(Color.WHITE);
        }
        if (mouseEvent.getX() >= CELLSIZE * 4 && mouseEvent.getX() < CELLSIZE * 5) {
            cursor.setPaintColor(Color.GREEN);
        }
        if (mouseEvent.getX() >= CELLSIZE * 5 && mouseEvent.getX() < CELLSIZE * 6) {
            cursor.setPaintColor(Color.YELLOW);
        }
        if (mouseEvent.getX() >= CELLSIZE * 6 && mouseEvent.getX() < CELLSIZE * 7) {
            cursor.setPaintColor(Color.RED);
        }
        if (mouseEvent.getX() >= CELLSIZE * 7 && mouseEvent.getX() < CELLSIZE * 8) {
            cursor.setPaintColor(Color.BLUE);
        }
        if (mouseEvent.getX() >= CELLSIZE * 8 && mouseEvent.getX() < CELLSIZE * 9) {
            MapEditor.curso().setPaintColor(Color.ORANGE);
        }
        if (mouseEvent.getX() >= CELLSIZE * 9 && mouseEvent.getX() < CELLSIZE * 10) {
            MapEditor.curso().setPaintColor(Color.PINK);
        }
        if (mouseEvent.getX() >= CELLSIZE * 10 && mouseEvent.getX() < CELLSIZE * 11) {
            cursor.setPaintColor(Color.LIGHT_GRAY);
        }
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
    }

}
