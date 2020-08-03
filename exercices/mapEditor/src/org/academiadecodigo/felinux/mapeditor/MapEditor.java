package org.academiadecodigo.felinux.mapeditor;

import org.academiadecodigo.felinux.mapeditor.grid.ColorType;
import org.academiadecodigo.felinux.mapeditor.utilits.FileManager;
import org.academiadecodigo.felinux.mapeditor.utilits.Randomizer;
import org.academiadecodigo.felinux.mapeditor.grid.Cell;
import org.academiadecodigo.felinux.mapeditor.grid.Cursor;
import org.academiadecodigo.felinux.mapeditor.grid.Grid;
import org.academiadecodigo.felinux.mapeditor.utilits.Tools;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class MapEditor implements KeyboardHandler {

    private static Cursor cursor;
    private Grid grid;
    private Keyboard keyboard;
    private Cell cell;
    private Tools tools;
    private boolean painting;
    private boolean cleaning;

    public MapEditor(int cols, int rows) {
        this.grid =  new Grid(cols, rows);
        this.cursor = new Cursor(this.grid);
        this.tools = new Tools(cursor);
        keyboard = new Keyboard(this);
    }

    public void init() {
        tools.init();
        myKeyboard();
    }


    private void moveCursor(Cursor.Direction direction) {

        switch (direction) {
            case UP:
                cursor.moveUp();
                break;
            case DOWN:
                cursor.moveDown();
                break;
            case LEFT:
                cursor.moveLeft();
                break;
            case RIGHT:
                cursor.moveRight();
                break;
        }
        if (painting) {
            paintCell();
        }
        if (cleaning) {
            clearCell();
        }
    }

    private void paintCell() {
        cell = grid.getCell(cursor.getCol(), cursor.getRow());
        cell.paint(ColorType.colorCode(cursor.getPaintColor()));
        grid.setCell(cursor.getCol(), cursor.getRow(), cell);
    }

    private void clearCell() {
        cell = grid.getCell(cursor.getCol(), cursor.getRow());
        if(!cell.isPainted()){
            return;
        }
        cell.originColor();
        grid.setCell(cursor.getCol(), cursor.getRow(), cell);
    }

    private void clearEditor() {
        grid.clearCells();
    }

    private void load() {
        grid.fileToGrid(FileManager.readFile());
    }

    private void save() {
        FileManager.writeFile(grid.toString());
    }

    private void randomColor() {
        String colorCode = String.valueOf(Randomizer.random(9));
        cursor.setPaintColor(ColorType.getColor(colorCode));
    }


    private void myKeyboard() {

        KeyboardEvent[] events = new KeyboardEvent[12];

        for (int i = 0; i < events.length; i++) {
            events[i] = new KeyboardEvent();
        }

        events[0].setKey(KeyboardEvent.KEY_RIGHT);
        events[0].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[1].setKey(KeyboardEvent.KEY_LEFT);
        events[1].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[2].setKey(KeyboardEvent.KEY_UP);
        events[2].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[3].setKey(KeyboardEvent.KEY_DOWN);
        events[3].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[4].setKey(KeyboardEvent.KEY_SPACE);
        events[4].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[5].setKey(KeyboardEvent.KEY_S);
        events[5].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[6].setKey(KeyboardEvent.KEY_L);
        events[6].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[7].setKey(KeyboardEvent.KEY_C);
        events[7].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[8].setKey(KeyboardEvent.KEY_U);
        events[8].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[9].setKey(KeyboardEvent.KEY_R);
        events[9].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[10].setKey(KeyboardEvent.KEY_SPACE);
        events[10].setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        events[11].setKey(KeyboardEvent.KEY_U);
        events[11].setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        for (int i = 0; i < events.length; i++) {
            keyboard.addEventListener(events[i]);
        }
    }

    public static Cursor curso() {
        return cursor;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                moveCursor(Cursor.Direction.LEFT);
                break;
            case KeyboardEvent.KEY_RIGHT:
                moveCursor(Cursor.Direction.RIGHT);
                break;
            case KeyboardEvent.KEY_UP:
                moveCursor(Cursor.Direction.UP);
                break;
            case KeyboardEvent.KEY_DOWN:
                moveCursor(Cursor.Direction.DOWN);
                break;
            case KeyboardEvent.KEY_SPACE:
                cleaning = false;
                painting = true;
                paintCell();
                break;
            case KeyboardEvent.KEY_U:
                painting = false;
                cleaning = true;
                clearCell();
                break;
            case KeyboardEvent.KEY_C:
                clearEditor();
                break;
            case KeyboardEvent.KEY_L:
                load();
                break;
            case KeyboardEvent.KEY_S:
                save();
                break;
            case KeyboardEvent.KEY_R:
                randomColor();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == keyboardEvent.KEY_SPACE) {
            painting = false;
        }
        if (keyboardEvent.getKey() == keyboardEvent.KEY_U) {
            cleaning = false;
        }
    }
}