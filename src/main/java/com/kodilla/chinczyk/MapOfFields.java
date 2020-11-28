package com.kodilla.chinczyk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapOfFields {
    private static Map<Field,Integer> listOfFields = new HashMap<>();

    public static void addListOfFields() {
        // trasa czerwonego

        listOfFields.put(new Field(10, 6),0);
        listOfFields.put(new Field(9, 6),1);
        listOfFields.put(new Field(8, 6),2);
        listOfFields.put(new Field(7, 6),3);
        listOfFields.put(new Field(6, 6),4);
        listOfFields.put(new Field(6, 7),5);
        listOfFields.put(new Field(6, 8),6);
        listOfFields.put(new Field(6, 9),7);
        listOfFields.put(new Field(6, 10),8);
        listOfFields.put(new Field(5, 10),9);
        listOfFields.put( new Field(4, 10),10);
        listOfFields.put( new Field(4, 9),11);
        listOfFields.put( new Field(4, 8),12);
        listOfFields.put( new Field(4, 7),13);
        listOfFields.put( new Field(4, 6),14);
        listOfFields.put( new Field(3, 6),15);
        listOfFields.put( new Field(2, 6),16);
        listOfFields.put( new Field(1, 6),17);
        listOfFields.put( new Field(0, 6),18);
        listOfFields.put( new Field(0, 5),19);
        listOfFields.put( new Field(0, 4),20);
        listOfFields.put( new Field(1, 4),21);
        listOfFields.put( new Field(2, 4),22);
        listOfFields.put( new Field(3, 4),23);
        listOfFields.put( new Field(4, 4),24);
        listOfFields.put( new Field(4, 3),25);
        listOfFields.put( new Field(4, 2),26);
        listOfFields.put( new Field(4, 1),27);
        listOfFields.put( new Field(4, 0),28);
        listOfFields.put( new Field(5, 0),29);
        listOfFields.put( new Field(6, 0),30);
        listOfFields.put( new Field(6, 1),31);
        listOfFields.put( new Field(6, 2),32);
        listOfFields.put( new Field(6, 3),33);
        listOfFields.put( new Field(6, 4),34);
        listOfFields.put( new Field(7, 4),35);
        listOfFields.put( new Field(8, 4),36);
        listOfFields.put( new Field(9, 4),37);
        listOfFields.put( new Field(10, 4),38);
        listOfFields.put( new Field(10, 5),39);
        //pola chronione (domki) czerwone
        listOfFields.put(new Field(9, 5),40);
        listOfFields.put(new Field(8, 5),41);
        listOfFields.put(new Field(7, 5),42);
        listOfFields.put(new Field(6, 5),43);

        //pola chronione (domki) niebieskie
        listOfFields.put(new Field(5, 9),84);
        listOfFields.put(new Field(5, 8),85);
        listOfFields.put(new Field(5, 7),86);
        listOfFields.put(new Field(5, 6),87);

        //pola chronione (domki) zolte
        listOfFields.put(new Field(1, 5),128);
        listOfFields.put(new Field(2, 5),129);
        listOfFields.put(new Field(3, 5),130);
        listOfFields.put(new Field(4, 5),131);

        //pola chronione (domki) zielone
        listOfFields.put(new Field(5, 1),172);
        listOfFields.put(new Field(5, 2),173);
        listOfFields.put(new Field(5, 3),174);
        listOfFields.put(new Field(5, 4),175);

        listOfFields.put(new Field(10,10),176);
        listOfFields.put(new Field(10,9),177);
        listOfFields.put(new Field(9,10),178);
        listOfFields.put(new Field(9,9),179);

          listOfFields.put(new Field(0, 9), 180);
          listOfFields.put(new Field(0, 10),181);
          listOfFields.put(new Field(1, 9), 182);
          listOfFields.put(new Field(1, 10),183);

          listOfFields.put(new Field(10, 0),184);
          listOfFields.put(new Field(10, 1),185);
          listOfFields.put(new Field(9, 0), 186);
          listOfFields.put(new Field(9, 1), 187);

         listOfFields.put( new Field(10, 0),188);
         listOfFields.put( new Field(10, 1),189);
         listOfFields.put( new Field(9, 0),190);
         listOfFields.put( new Field(9, 1),191);
    }

    public static Map<Field,Integer> getListOfFields() {
        return listOfFields;
    }


}
