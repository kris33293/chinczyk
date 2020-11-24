package com.kodilla.chinczyk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapOfFields {
    private static Map<Field,Integer> listOfFields = new HashMap<>();

    public static void addListOfFields() {

        listOfFields.put( new Field(4, 10),0);
        listOfFields.put( new Field(4, 9),1);
        listOfFields.put( new Field(4, 8),2);
        listOfFields.put( new Field(4, 7),3);
        listOfFields.put( new Field(4, 6),4);
        listOfFields.put( new Field(3, 6),5);
        listOfFields.put( new Field(2, 6),6);
        listOfFields.put( new Field(1, 6),7);
        listOfFields.put( new Field(0, 6),8);
        listOfFields.put( new Field(0, 5),9);
        listOfFields.put( new Field(0, 4),10);
        listOfFields.put( new Field(1, 4),11);
        listOfFields.put( new Field(2, 4),12);
        listOfFields.put( new Field(3, 4),13);
        listOfFields.put( new Field(4, 4),14);
        listOfFields.put( new Field(4, 3),15);
        listOfFields.put( new Field(4, 2),16);
        listOfFields.put( new Field(4, 1),17);
        listOfFields.put( new Field(4, 0),18);
        listOfFields.put( new Field(5, 0),19);
        listOfFields.put( new Field(6, 0),19);
        listOfFields.put( new Field(6, 1),20);
        listOfFields.put( new Field(6, 2),21);
        listOfFields.put( new Field(6, 3),22);
        listOfFields.put( new Field(6, 4),23);
        listOfFields.put( new Field(7, 4),24);
        listOfFields.put( new Field(8, 4),25);
        listOfFields.put( new Field(9, 4),26);
        listOfFields.put( new Field(10, 4),27);
        listOfFields.put( new Field(10, 5),28);
        listOfFields.put( new Field(10, 6),29);
        listOfFields.put( new Field(9, 6),30);
        listOfFields.put( new Field(8, 6),31);
        listOfFields.put( new Field(7, 6),32);
        listOfFields.put( new Field(6, 6),33);
        listOfFields.put( new Field(6, 7),34);
        listOfFields.put( new Field(6, 8),35);
        listOfFields.put( new Field(6, 9),36);
        listOfFields.put( new Field(6, 10),37);
        listOfFields.put( new Field(5, 10),38);
        listOfFields.put( new Field(5, 9),39);




    }

    public static Map<Field,Integer> getListOfFields() {
        return listOfFields;
    }

    @Override
    public String toString() {
        return "MapOfFields{}";
    }
}
