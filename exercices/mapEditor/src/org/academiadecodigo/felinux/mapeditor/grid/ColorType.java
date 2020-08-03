package org.academiadecodigo.felinux.mapeditor.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;

public enum ColorType {

    MAGENTA("0"),
    BLACK("1"),
    WHITE("2"),
    GREEN("3"),
    YELLOW("4"),
    RED("5"),
    BLUE("6"),
    ORANGE("7"),
    PINK("8"),
    LIGHT_GRAY("9"),
    DARK_GRAY("x");


    private String colorCode;

    ColorType(String colorCode) {
        this.colorCode = colorCode;
    }

    public static String colorCode(Color color) {

        if (Color.MAGENTA.equals(color)) {
            return MAGENTA.getColorCode();
        } else if (Color.BLACK.equals(color)) {
            return BLACK.getColorCode();
        } else if (Color.WHITE.equals(color)) {
            return WHITE.getColorCode();
        } else if (Color.GREEN.equals(color)) {
            return GREEN.getColorCode();
        } else if (Color.YELLOW.equals(color)) {
            return YELLOW.getColorCode();
        } else if (Color.RED.equals(color)) {
            return RED.getColorCode();
        } else if (Color.BLUE.equals(color)) {
            return BLUE.getColorCode();
        } else if (Color.ORANGE.equals(color)) {
            return ORANGE.getColorCode();
        } else if (Color.PINK.equals(color)) {
            return PINK.getColorCode();
        } else if (Color.LIGHT_GRAY.equals(color)) {
            return LIGHT_GRAY.getColorCode();
        } else {
            return "x";
        }
    }

    public static Color getColor(String colorCode) {
        switch (colorCode) {
            case "0":
                return Color.MAGENTA;
            case "1":
                return Color.BLACK;
            case "2":
                return Color.WHITE;
            case "3":
                return Color.GREEN;
            case "4":
                return Color.YELLOW;
            case "5":
                return Color.RED;
            case "6":
                return Color.BLUE;
            case "7":
                return Color.ORANGE;
            case "8":
                return Color.PINK;
            case "9":
                return Color.LIGHT_GRAY;
            default:
                return Color.DARK_GRAY;
        }
    }

    private String getColorCode() {
        return colorCode;
    }

}

