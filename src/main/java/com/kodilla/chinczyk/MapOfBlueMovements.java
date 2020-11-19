package com.kodilla.chinczyk;

import java.util.ArrayList;

public class MapOfBlueMovements {
    private static ArrayList<Field> listOfMovements = new ArrayList<>();

    public static void addListOfMovements() {
        // trasa niebieskiego
        listOfMovements.add(0, new Field(4, 10));
        listOfMovements.add(1, new Field(4, 9));
        listOfMovements.add(2, new Field(4, 8));
        listOfMovements.add(3, new Field(4, 7));
        listOfMovements.add(4, new Field(4, 6));
        listOfMovements.add(5, new Field(3, 6));
        listOfMovements.add(6, new Field(2, 6));
        listOfMovements.add(7, new Field(1, 6));
        listOfMovements.add(8, new Field(0, 6));
        listOfMovements.add(9, new Field(0, 5));
        listOfMovements.add(10, new Field(0, 4));
        listOfMovements.add(11, new Field(1, 4));
        listOfMovements.add(12, new Field(2, 4));
        listOfMovements.add(13, new Field(3, 4));
        listOfMovements.add(14, new Field(4, 4));
        listOfMovements.add(15, new Field(4, 3));
        listOfMovements.add(16, new Field(4, 2));
        listOfMovements.add(17, new Field(4, 1));
        listOfMovements.add(18, new Field(4, 0));
        listOfMovements.add(19, new Field(5, 0));
        listOfMovements.add(20, new Field(6, 0));
        listOfMovements.add(21, new Field(6, 1));
        listOfMovements.add(22, new Field(6, 2));
        listOfMovements.add(23, new Field(6, 3));
        listOfMovements.add(24, new Field(6, 4));
        listOfMovements.add(25, new Field(7, 4));
        listOfMovements.add(26, new Field(8, 4));
        listOfMovements.add(27, new Field(9, 4));
        listOfMovements.add(28, new Field(10, 4));
        listOfMovements.add(29, new Field(10, 5));
        listOfMovements.add(30, new Field(10, 6));
        listOfMovements.add(31, new Field(9, 6));
        listOfMovements.add(32, new Field(8, 6));
        listOfMovements.add(33, new Field(7, 6));
        listOfMovements.add(34, new Field(6, 6));
        listOfMovements.add(35, new Field(6, 7));
        listOfMovements.add(36, new Field(6, 8));
        listOfMovements.add(37, new Field(6, 9));
        listOfMovements.add(38, new Field(6, 10));
        listOfMovements.add(39, new Field(5, 10));
        listOfMovements.add(40, new Field(5, 9));
        listOfMovements.add(41, new Field(5, 8));
        listOfMovements.add(42, new Field(5, 7));
        listOfMovements.add(43, new Field(5, 6));



    }

    public static ArrayList<Field> getListOfMovements() {
        return listOfMovements;
    }

}
