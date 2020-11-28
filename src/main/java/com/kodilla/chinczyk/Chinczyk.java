package com.kodilla.chinczyk;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Chinczyk extends Application {


    private Image logoMain = new Image("file:src/main/resources/logo_main.png");
    private Image imagebackBoard = new Image("file:src/main/resources/board.png");
    private GridPane board = new GridPane();
    private GridPane main = new GridPane();
    private GridPane settings = new GridPane();

    private Label playersLabel = new Label("Liczba graczy uzytkownka:");
    private Label colorLabel = new Label("Kolor piownkow uzytkownika:");


    static ArrayList<RedPawn> redPawns = new ArrayList<>();

    Field startRed1 = new Field(10,10);
    Field startRed2 = new Field(10,9);
    Field startRed3 = new Field(9,9);
    Field startRed4 = new Field(9,10);

    RedPawn redPawn1 = new RedPawn(startRed1);
    RedPawn redPawn2 = new RedPawn(startRed2);
    RedPawn redPawn3 = new RedPawn(startRed3);
    RedPawn redPawn4 = new RedPawn(startRed4);
    int redMaxField = 43;

    static ArrayList<BluePawn> bluePawns = new ArrayList<>();

    Field startBlue1 = new Field(0,9);
    Field startBlue2 = new Field(0,10);
    Field startBlue3 = new Field(1,9);
    Field startBlue4 = new Field(1,10);

    BluePawn bluePawn1 = new BluePawn(startBlue1);
    BluePawn bluePawn2 = new BluePawn(startBlue2);
    BluePawn bluePawn3 = new BluePawn(startBlue3);
    BluePawn bluePawn4 = new BluePawn(startBlue4);
    int blueMaxField = 87;

    static ArrayList<YellowPawn> yellowPawns = new ArrayList<>();

    Field startYellow1 = new Field(0,0);
    Field startYellow2 = new Field(0,1);
    Field startYellow3 = new Field(1,0);
    Field startYellow4 = new Field(1,1);

    YellowPawn yellowPawn1 = new YellowPawn(startYellow1);
    YellowPawn yellowPawn2 = new YellowPawn(startYellow2);
    YellowPawn yellowPawn3 = new YellowPawn(startYellow3);
    YellowPawn yellowPawn4 = new YellowPawn(startYellow4);
    int yellowMaxField = 131;

    static ArrayList<GreenPawn> greenPawns = new ArrayList<>();

    Field startGreen1 = new Field(10,0);
    Field startGreen2 = new Field(10,1);
    Field startGreen3 = new Field(9,0);
    Field startGreen4 = new Field(9,1);

    GreenPawn greenPawn1 = new GreenPawn(startGreen1);
    GreenPawn greenPawn2 = new GreenPawn(startGreen2);
    GreenPawn greenPawn3 = new GreenPawn(startGreen3);
    GreenPawn greenPawn4 = new GreenPawn(startGreen4);
    int greenMaxField = 175;


    private int dice;
    private int players = 2;
    private int maxPlayers = 4;
    private Label drawBox = new Label();
    private Label checkRed = new Label();
    private Label checkBlue = new Label();
    private Label checkYellow = new Label();
    private Label checkGreen = new Label();



    public static int rollTheDice() {
            Random random = new Random();
            return random.nextInt(6) + 1;
    }

    public boolean checkRedValue(int value){
        boolean check = false;
        for (int i=0; i<4; i++){
            check = value >= redPawns.get(i).getValue();
        } return check;
    }

    private void buildBoard(GridPane board) {

        board.getRowConstraints().add(new RowConstraints(92));
        board.getRowConstraints().add(new RowConstraints(90));
        board.getRowConstraints().add(new RowConstraints(90));
        board.getRowConstraints().add(new RowConstraints(90));
        board.getRowConstraints().add(new RowConstraints(90));
        board.getRowConstraints().add(new RowConstraints(92));
        board.getRowConstraints().add(new RowConstraints(90));
        board.getRowConstraints().add(new RowConstraints(91));
        board.getRowConstraints().add(new RowConstraints(91));
        board.getRowConstraints().add(new RowConstraints(92));
        board.getRowConstraints().add(new RowConstraints(91));
        board.getColumnConstraints().add(new ColumnConstraints(91));
        board.getColumnConstraints().add(new ColumnConstraints(92));
        board.getColumnConstraints().add(new ColumnConstraints(90));
        board.getColumnConstraints().add(new ColumnConstraints(90));
        board.getColumnConstraints().add(new ColumnConstraints(90));
        board.getColumnConstraints().add(new ColumnConstraints(90));
        board.getColumnConstraints().add(new ColumnConstraints(92));
        board.getColumnConstraints().add(new ColumnConstraints(90));
        board.getColumnConstraints().add(new ColumnConstraints(90));
        board.getColumnConstraints().add(new ColumnConstraints(93));

        if (players == 1) {

        }

        if (players == 2) {

        }

        if (players == 3) {

        }

        if (players == 4) {

        }
    }

    private void buildMain(GridPane main) {

       main.getRowConstraints().add(new RowConstraints(60));
       main.getRowConstraints().add(new RowConstraints(60));
       main.getRowConstraints().add(new RowConstraints(60));
       main.getRowConstraints().add(new RowConstraints(60));
       main.getColumnConstraints().add(new ColumnConstraints(100));
       main.getColumnConstraints().add(new ColumnConstraints(100));


    }

    private void buildSettings(GridPane settings) {

        settings.getRowConstraints().add(new RowConstraints(15));
        settings.getRowConstraints().add(new RowConstraints(30));
        settings.getRowConstraints().add(new RowConstraints(30));
        settings.getColumnConstraints().add(new ColumnConstraints(20));
        settings.getColumnConstraints().add(new ColumnConstraints(80));
        settings.getColumnConstraints().add(new ColumnConstraints(20));
        settings.getColumnConstraints().add(new ColumnConstraints(100));


    }


    private void putGreenPawnsOnBoard(GridPane board) {

        greenPawns.add(0, greenPawn1);
        greenPawns.add(1, greenPawn2);
        greenPawns.add(2, greenPawn3);
        greenPawns.add(3, greenPawn4);
        board.add(greenPawns.get(0).getPawnImage(), greenPawns.get(0).getStartPosition().getColumn(), greenPawns.get(0).getStartPosition().getRow());
        board.add(greenPawns.get(1).getPawnImage(), greenPawns.get(1).getStartPosition().getColumn(), greenPawns.get(1).getStartPosition().getRow());
        board.add(greenPawns.get(2).getPawnImage(), greenPawns.get(2).getStartPosition().getColumn(), greenPawns.get(2).getStartPosition().getRow());
        board.add(greenPawns.get(3).getPawnImage(), greenPawns.get(3).getStartPosition().getColumn(), greenPawns.get(3).getStartPosition().getRow());

        for (int i=0;i < 4;i++) {
            int finalI = i;
            greenPawns.get(finalI).getPawnImage().setOnMouseClicked(g -> {

                if (dice == 6) {

                    if (greenPawns.get(finalI).getActivationStatus()) {
                        if (greenPawns.get(finalI).getActivationNr() == 1){
                            drawBox.setText("Pionek Zakonczyl Gre");
                        }

                        if (greenPawns.get(finalI).getActivationNr() == 0) {
                            if (dice <= greenMaxField - greenPawns.get(finalI).getValue()) {
                                greenPawns.get(finalI).setValue(greenPawns.get(finalI).getValue() + dice);

                            }  else if (dice > greenMaxField - greenPawns.get(finalI).getValue()) {
                                drawBox.setText("Ruch niemozliwy, Wylosowano " + dice);
                            }
                        }
                        for (int j = 132; j < 176 ; j++) {
                            if (greenPawns.get(finalI).getValue() == j) {
                                greenPawns.get(finalI).setNewPosition(MapOfMovements.getListOfMovements().get(j));
                                for (int k = 0 ; k < 4; k++) {

                                    if (Objects.equals(MapOfFields.getListOfFields().get(redPawns.get(k).getCurrentField()), MapOfFields.getListOfFields().get(greenPawns.get(finalI).getCurrentField()))) {

                                        board.getChildren().remove(redPawns.get(k).getPawnImage());
                                        board.add(redPawns.get(k).getPawnImage(), redPawns.get(k).getStartPosition().getColumn(), redPawns.get(k).getStartPosition().getRow());
                                        redPawns.get(k).changeActivationStatus();
                                        redPawns.get(k).setValue(0);
                                        redPawns.get(k).setNewPosition(redPawns.get(k).getStartPosition());

                                        board.getChildren().remove(greenPawns.get(finalI).getPawnImage());
                                        board.add(greenPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Czerwony Pionek Zbity");



                                    } else if (MapOfFields.getListOfFields().get(yellowPawns.get(k).getCurrentField())   == MapOfFields.getListOfFields().get(greenPawns.get(finalI).getCurrentField()) ) {

                                        board.getChildren().remove(yellowPawns.get(k).getPawnImage());
                                        board.add(yellowPawns.get(k).getPawnImage(), yellowPawns.get(k).getStartPosition().getColumn(), yellowPawns.get(k).getStartPosition().getRow());
                                        yellowPawns.get(k).changeActivationStatus();
                                        yellowPawns.get(k).setValue(0);
                                        yellowPawns.get(k).setNewPosition(yellowPawns.get(k).getStartPosition());
                                        board.getChildren().remove(greenPawns.get(finalI).getPawnImage());
                                        board.add(greenPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Zolty Pionek Zbity");


                                    } else if (MapOfFields.getListOfFields().get(bluePawns.get(k).getCurrentField())   == MapOfFields.getListOfFields().get(greenPawns.get(finalI).getCurrentField()) ) {

                                        board.getChildren().remove(bluePawns.get(k).getPawnImage());
                                        board.add(bluePawns.get(k).getPawnImage(), bluePawns.get(k).getStartPosition().getColumn(), bluePawns.get(k).getStartPosition().getRow());
                                        bluePawns.get(k).changeActivationStatus();
                                        bluePawns.get(k).setValue(0);
                                        bluePawns.get(k).setNewPosition(bluePawns.get(k).getStartPosition());
                                        board.getChildren().remove(greenPawns.get(finalI).getPawnImage());
                                        board.add(greenPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Niebieski Pionek Zbity");

                                    }

                                    else {
                                        board.getChildren().remove(greenPawns.get(finalI).getPawnImage());
                                        board.add(greenPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());

                                    }

                                }
                            }
                        }
                        for (int j = 172; j < 176 ; j++) {

                            if (greenPawns.get(finalI).getValue() == greenMaxField) {
                                greenPawns.get(finalI).changeFinishStatus();
                                greenPawns.get(finalI).changeActivationStatus();
                                greenPawns.get(finalI).setActivationNr(1);
                                greenMaxField = greenMaxField - 1;
                                drawBox.setText("Pionek Zakonczyl Gre");
                            }

                        }
                    } else {
                        if (greenPawns.get(finalI).getActivationNr() == 0) {
                            greenPawns.get(finalI).changeActivationStatus();
                            greenPawns.get(finalI).setNewPosition(greenPawns.get(finalI).getStartPosition());
                            greenPawns.get(finalI).setValue(132);
                            board.getChildren().remove(greenPawns.get(finalI).getPawnImage());
                            board.add(greenPawns.get(finalI).getPawnImage(), 6, 0);
                        } else drawBox.setText("Pionek Zakonczyl Gre");
                    }
                } else if (dice != 6) {

                    if (greenPawns.get(finalI).getActivationStatus()) {

                        if (greenPawns.get(finalI).getActivationNr() == 1){
                            drawBox.setText("Pionek Zakonczyl Gre");
                        }

                        if (greenPawns.get(finalI).getActivationNr() == 0) {
                            if (dice <= greenMaxField - greenPawns.get(finalI).getValue()) {
                                greenPawns.get(finalI).setValue(greenPawns.get(finalI).getValue() + dice);

                            }   else if (dice > greenMaxField - greenPawns.get(finalI).getValue()) {
                                drawBox.setText("Ruch niemozliwy, Wylosowano " + dice);
                            }
                        }
                        for (int j = 132; j < 176 ; j++) {
                            if (greenPawns.get(finalI).getValue() == j) {
                                greenPawns.get(finalI).setNewPosition(MapOfMovements.getListOfMovements().get(j));
                                for (int k = 0 ; k < 4; k++) {

                                    if (Objects.equals(MapOfFields.getListOfFields().get(redPawns.get(k).getCurrentField()), MapOfFields.getListOfFields().get(greenPawns.get(finalI).getCurrentField()))) {

                                        board.getChildren().remove(redPawns.get(k).getPawnImage());
                                        board.add(redPawns.get(k).getPawnImage(), redPawns.get(k).getStartPosition().getColumn(), redPawns.get(k).getStartPosition().getRow());
                                        redPawns.get(k).changeActivationStatus();
                                        redPawns.get(k).setValue(0);
                                        redPawns.get(k).setNewPosition(redPawns.get(k).getStartPosition());

                                        board.getChildren().remove(greenPawns.get(finalI).getPawnImage());
                                        board.add(greenPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Czerwony Pionek Zbity");



                                    } else if (MapOfFields.getListOfFields().get(yellowPawns.get(k).getCurrentField())   == MapOfFields.getListOfFields().get(greenPawns.get(finalI).getCurrentField()) ) {

                                        board.getChildren().remove(yellowPawns.get(k).getPawnImage());
                                        board.add(yellowPawns.get(k).getPawnImage(), yellowPawns.get(k).getStartPosition().getColumn(), yellowPawns.get(k).getStartPosition().getRow());
                                        yellowPawns.get(k).changeActivationStatus();
                                        yellowPawns.get(k).setValue(0);
                                        yellowPawns.get(k).setNewPosition(yellowPawns.get(k).getStartPosition());
                                        board.getChildren().remove(greenPawns.get(finalI).getPawnImage());
                                        board.add(greenPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Zolty Pionek Zbity");


                                    } else if (MapOfFields.getListOfFields().get(bluePawns.get(k).getCurrentField())   == MapOfFields.getListOfFields().get(greenPawns.get(finalI).getCurrentField()) ) {

                                        board.getChildren().remove(bluePawns.get(k).getPawnImage());
                                        board.add(bluePawns.get(k).getPawnImage(), bluePawns.get(k).getStartPosition().getColumn(), bluePawns.get(k).getStartPosition().getRow());
                                        bluePawns.get(k).changeActivationStatus();
                                        bluePawns.get(k).setValue(0);
                                        bluePawns.get(k).setNewPosition(bluePawns.get(k).getStartPosition());
                                        board.getChildren().remove(greenPawns.get(finalI).getPawnImage());
                                        board.add(greenPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Niebieski Pionek Zbity");

                                    } else if (greenPawns.get(finalI).getValue() == greenMaxField) {
                                        greenPawns.get(finalI).changeFinishStatus();
                                        greenPawns.get(finalI).changeActivationStatus();
                                        greenPawns.get(finalI).setActivationNr(1);
                                        greenMaxField = greenMaxField - 1;
                                        drawBox.setText("Pionek Zakonczyl Gre");
                                    }  else {
                                        board.getChildren().remove(greenPawns.get(finalI).getPawnImage());
                                        board.add(greenPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());

                                    }

                                }
                            }
                        }
                        for (int j = 172; j < 176 ; j++) {

                            if (greenPawns.get(finalI).getValue() == greenMaxField) {
                                greenPawns.get(finalI).changeFinishStatus();
                                greenPawns.get(finalI).changeActivationStatus();
                                greenPawns.get(finalI).setActivationNr(1);
                                greenMaxField = greenMaxField - 1;
                                drawBox.setText("Pionek Zakonczyl Gre");
                            }

                        }
                    }
                }


            });

        }
    }

    private void putYellowPawnsOnBoard(GridPane board) {
        yellowPawns.add(0, yellowPawn1);
        yellowPawns.add(1, yellowPawn2);
        yellowPawns.add(2, yellowPawn3);
        yellowPawns.add(3, yellowPawn4);
        board.add(yellowPawns.get(0).getPawnImage(), yellowPawns.get(0).getStartPosition().getColumn(), yellowPawns.get(0).getStartPosition().getRow());
        board.add(yellowPawns.get(1).getPawnImage(), yellowPawns.get(1).getStartPosition().getColumn(), yellowPawns.get(1).getStartPosition().getRow());
        board.add(yellowPawns.get(2).getPawnImage(), yellowPawns.get(2).getStartPosition().getColumn(), yellowPawns.get(2).getStartPosition().getRow());
        board.add(yellowPawns.get(3).getPawnImage(), yellowPawns.get(3).getStartPosition().getColumn(), yellowPawns.get(3).getStartPosition().getRow());

        for (int i=0;i < 4;i++) {
            int finalI = i;
            yellowPawns.get(finalI).getPawnImage().setOnMouseClicked(g -> {

                if (dice == 6) {

                    if (yellowPawns.get(finalI).getActivationStatus()) {
                        if (yellowPawns.get(finalI).getActivationNr() == 1){
                            drawBox.setText("Pionek Zakonczyl Gre");
                        }

                        if (yellowPawns.get(finalI).getActivationNr() == 0) {
                            if (dice <= yellowMaxField - yellowPawns.get(finalI).getValue()) {
                                yellowPawns.get(finalI).setValue(yellowPawns.get(finalI).getValue() + dice);

                            }  else if (dice > yellowMaxField - yellowPawns.get(finalI).getValue()) {
                                drawBox.setText("Ruch niemozliwy, Wylosowano " + dice);
                            }
                        }
                        for (int j = 88; j < 132 ; j++) {
                            if (yellowPawns.get(finalI).getValue() == j) {
                                yellowPawns.get(finalI).setNewPosition(MapOfMovements.getListOfMovements().get(j));
                                for (int k = 0 ; k < 4; k++) {

                                    if (MapOfFields.getListOfFields().get(redPawns.get(k).getCurrentField())   == MapOfFields.getListOfFields().get(yellowPawns.get(finalI).getCurrentField())) {

                                        board.getChildren().remove(redPawns.get(k).getPawnImage());
                                        board.add(redPawns.get(k).getPawnImage(), redPawns.get(k).getStartPosition().getColumn(), redPawns.get(k).getStartPosition().getRow());
                                        redPawns.get(k).changeActivationStatus();
                                        redPawns.get(k).setValue(0);
                                        redPawns.get(k).setNewPosition(redPawns.get(k).getStartPosition());

                                        board.getChildren().remove(yellowPawns.get(finalI).getPawnImage());
                                        board.add(yellowPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Czerwony Pionek Zbity");



                                    } else if (MapOfFields.getListOfFields().get(greenPawns.get(k).getCurrentField())   == MapOfFields.getListOfFields().get(yellowPawns.get(finalI).getCurrentField()) ) {

                                        board.getChildren().remove(greenPawns.get(k).getPawnImage());
                                        board.add(greenPawns.get(k).getPawnImage(), greenPawns.get(k).getStartPosition().getColumn(), greenPawns.get(k).getStartPosition().getRow());
                                        greenPawns.get(k).changeActivationStatus();
                                        greenPawns.get(k).setValue(0);
                                        greenPawns.get(k).setNewPosition(greenPawns.get(k).getStartPosition());
                                        board.getChildren().remove(yellowPawns.get(finalI).getPawnImage());
                                        board.add(yellowPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Zielony Pionek Zbity");


                                    } else if (MapOfFields.getListOfFields().get(bluePawns.get(k).getCurrentField())   == MapOfFields.getListOfFields().get(yellowPawns.get(finalI).getCurrentField()) ) {

                                        board.getChildren().remove(bluePawns.get(k).getPawnImage());
                                        board.add(bluePawns.get(k).getPawnImage(), bluePawns.get(k).getStartPosition().getColumn(), bluePawns.get(k).getStartPosition().getRow());
                                        bluePawns.get(k).changeActivationStatus();
                                        bluePawns.get(k).setValue(0);
                                        bluePawns.get(k).setNewPosition(bluePawns.get(k).getStartPosition());
                                        board.getChildren().remove(yellowPawns.get(finalI).getPawnImage());
                                        board.add(yellowPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Niebieski Pionek Zbity");

                                    }

                                    else {
                                        board.getChildren().remove(yellowPawns.get(finalI).getPawnImage());
                                        board.add(yellowPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());

                                    }

                                }
                            }
                        }
                        for (int j = 128; j < 132 ; j++) {

                            if (yellowPawns.get(finalI).getValue() == yellowMaxField) {
                                yellowPawns.get(finalI).changeFinishStatus();
                                yellowPawns.get(finalI).changeActivationStatus();
                                yellowPawns.get(finalI).setActivationNr(1);
                                yellowMaxField = yellowMaxField - 1;
                                drawBox.setText("Pionek Zakonczyl Gre");
                            }

                        }
                    } else {
                        if (yellowPawns.get(finalI).getActivationNr() == 0) {
                            yellowPawns.get(finalI).changeActivationStatus();
                            yellowPawns.get(finalI).setNewPosition(bluePawns.get(finalI).getStartPosition());
                            yellowPawns.get(finalI).setValue(88);
                            board.getChildren().remove(yellowPawns.get(finalI).getPawnImage());
                            board.add(yellowPawns.get(finalI).getPawnImage(), 0, 4);
                        } else drawBox.setText("Pionek Zakonczyl Gre");
                    }
                } else if (dice != 6) {

                    if (yellowPawns.get(finalI).getActivationStatus()) {

                        if (yellowPawns.get(finalI).getActivationNr() == 1){
                            drawBox.setText("Pionek Zakonczyl Gre");
                        }

                        if (yellowPawns.get(finalI).getActivationNr() == 0) {
                            if (dice <= yellowMaxField - yellowPawns.get(finalI).getValue()) {
                                yellowPawns.get(finalI).setValue(yellowPawns.get(finalI).getValue() + dice);

                            }   else if (dice > yellowMaxField - yellowPawns.get(finalI).getValue()) {
                                drawBox.setText("Ruch niemozliwy, Wylosowano " + dice);
                            }
                        }
                        for (int j = 88; j < 132 ; j++) {
                            if (yellowPawns.get(finalI).getValue() == j) {
                                yellowPawns.get(finalI).setNewPosition(MapOfMovements.getListOfMovements().get(j));
                                for (int k = 0 ; k < 4; k++) {

                                    if (MapOfFields.getListOfFields().get(redPawns.get(k).getCurrentField()) == MapOfFields.getListOfFields().get(yellowPawns.get(finalI).getCurrentField())) {

                                        board.getChildren().remove(redPawns.get(k).getPawnImage());
                                        board.add(redPawns.get(k).getPawnImage(), redPawns.get(k).getStartPosition().getColumn(), redPawns.get(k).getStartPosition().getRow());
                                        redPawns.get(k).changeActivationStatus();
                                        redPawns.get(k).setValue(0);
                                        redPawns.get(k).setNewPosition(redPawns.get(k).getStartPosition());

                                        board.getChildren().remove(yellowPawns.get(finalI).getPawnImage());
                                        board.add(yellowPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Czerwony Pionek Zbity");



                                    } else if (MapOfFields.getListOfFields().get(greenPawns.get(k).getCurrentField()) == MapOfFields.getListOfFields().get(yellowPawns.get(finalI).getCurrentField())) {

                                        board.getChildren().remove(greenPawns.get(k).getPawnImage());
                                        board.add(greenPawns.get(k).getPawnImage(), greenPawns.get(k).getStartPosition().getColumn(), greenPawns.get(k).getStartPosition().getRow());
                                        greenPawns.get(k).changeActivationStatus();
                                        greenPawns.get(k).setValue(0);
                                        greenPawns.get(k).setNewPosition(greenPawns.get(k).getStartPosition());

                                        board.getChildren().remove(yellowPawns.get(finalI).getPawnImage());
                                        board.add(yellowPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Zielony Pionek Zbity");


                                    } else if (MapOfFields.getListOfFields().get(bluePawns.get(k).getCurrentField()) == MapOfFields.getListOfFields().get(yellowPawns.get(finalI).getCurrentField())) {

                                        board.getChildren().remove(bluePawns.get(k).getPawnImage());
                                        board.add(bluePawns.get(k).getPawnImage(), bluePawns.get(k).getStartPosition().getColumn(), bluePawns.get(k).getStartPosition().getRow());
                                        bluePawns.get(k).changeActivationStatus();
                                        bluePawns.get(k).setValue(0);
                                        bluePawns.get(k).setNewPosition(bluePawns.get(k).getStartPosition());
                                        board.getChildren().remove(yellowPawns.get(finalI).getPawnImage());
                                        board.add(yellowPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Niebieski Pionek Zbity");

                                    } else if (yellowPawns.get(finalI).getValue() == yellowMaxField) {
                                        yellowPawns.get(finalI).changeFinishStatus();
                                        yellowPawns.get(finalI).changeActivationStatus();
                                        yellowPawns.get(finalI).setActivationNr(1);
                                        yellowMaxField = yellowMaxField - 1;
                                        drawBox.setText("Pionek Zakonczyl Gre");
                                    }  else {
                                        board.getChildren().remove(yellowPawns.get(finalI).getPawnImage());
                                        board.add(yellowPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());

                                    }

                                }
                            }
                        }
                        for (int j = 128; j < 132 ; j++) {

                            if (yellowPawns.get(finalI).getValue() == yellowMaxField) {
                                yellowPawns.get(finalI).changeFinishStatus();
                                yellowPawns.get(finalI).changeActivationStatus();
                                yellowPawns.get(finalI).setActivationNr(1);
                                yellowMaxField = yellowMaxField - 1;
                                drawBox.setText("Pionek Zakonczyl Gre");
                            }

                        }
                    }
                }


            });

        }
    }

    private void putRedPawnsOnBoard(GridPane board) {

        redPawns.add(0, redPawn1);
        redPawns.add(1, redPawn2);
        redPawns.add(2, redPawn3);
        redPawns.add(3, redPawn4);
        board.add(redPawns.get(0).getPawnImage(), 10, 10);
        board.add(redPawns.get(1).getPawnImage(), 10, 9);
        board.add(redPawns.get(2).getPawnImage(), 9, 10);
        board.add(redPawns.get(3).getPawnImage(), 9, 9);




        for (int i=0;i < 4;i++) {
            int finalI = i;
            redPawns.get(finalI).getPawnImage().setOnMouseClicked(g -> {

                if (dice == 6) {

                    if (redPawns.get(finalI).getActivationStatus()) {
                        if (redPawns.get(finalI).getActivationNr() == 1){
                            drawBox.setText("Pionek Zakonczyl Gre");
                        }

                        if (redPawns.get(finalI).getActivationNr() == 0) {
                            if (dice <= redMaxField - redPawns.get(finalI).getValue()) {
                                redPawns.get(finalI).setValue(redPawns.get(finalI).getValue() + dice);

                            }  else if (dice > redMaxField - redPawns.get(finalI).getValue()) {
                                drawBox.setText("Ruch niemozliwy, Wylosowano " + dice);
                            }
                        }
                        for (int j = 0; j < 44 ; j++) {
                            if (redPawns.get(finalI).getValue() == j) {
                                redPawns.get(finalI).setNewPosition(MapOfMovements.getListOfMovements().get(j));
                                for (int k = 0 ; k < 4; k++) {

                                    if (MapOfFields.getListOfFields().get(bluePawns.get(k).getCurrentField()) == MapOfFields.getListOfFields().get(redPawns.get(finalI).getCurrentField())) {

                                        board.getChildren().remove(bluePawns.get(k).getPawnImage());
                                        board.add(bluePawns.get(k).getPawnImage(), bluePawns.get(k).getStartPosition().getColumn(), bluePawns.get(k).getStartPosition().getRow());
                                        bluePawns.get(k).changeActivationStatus();
                                        bluePawns.get(k).setValue(0);
                                        bluePawns.get(k).setNewPosition(bluePawns.get(k).getStartPosition());

                                        board.getChildren().remove(redPawns.get(finalI).getPawnImage());
                                        board.add(redPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Niebieski Pionek Zbity");



                                    } else if (MapOfFields.getListOfFields().get(greenPawns.get(k).getCurrentField())   == MapOfFields.getListOfFields().get(redPawns.get(finalI).getCurrentField()) ) {

                                        board.getChildren().remove(greenPawns.get(k).getPawnImage());
                                        board.add(greenPawns.get(k).getPawnImage(), greenPawns.get(k).getStartPosition().getColumn(), greenPawns.get(k).getStartPosition().getRow());
                                        greenPawns.get(k).changeActivationStatus();
                                        greenPawns.get(k).setValue(0);
                                        greenPawns.get(k).setNewPosition(greenPawns.get(k).getStartPosition());

                                        board.getChildren().remove(redPawns.get(finalI).getPawnImage());
                                        board.add(redPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Zielony Pionek Zbity");


                                    } else if (MapOfFields.getListOfFields().get(yellowPawns.get(k).getCurrentField())   == MapOfFields.getListOfFields().get(redPawns.get(finalI).getCurrentField())  ) {

                                        board.getChildren().remove(yellowPawns.get(k).getPawnImage());
                                        board.add(yellowPawns.get(k).getPawnImage(), yellowPawns.get(k).getStartPosition().getColumn(), yellowPawns.get(k).getStartPosition().getRow());
                                        yellowPawns.get(k).changeActivationStatus();
                                        yellowPawns.get(k).setValue(0);
                                        yellowPawns.get(k).setNewPosition(yellowPawns.get(k).getStartPosition());

                                        board.getChildren().remove(redPawns.get(finalI).getPawnImage());
                                        board.add(redPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Zolty Pionek Zbity");

                                    }

                                    else {
                                        board.getChildren().remove(redPawns.get(finalI).getPawnImage());
                                        board.add(redPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());

                                    }

                                }
                            }
                        }
                        for (int j = 40; j < 44 ; j++) {

                            if (redPawns.get(finalI).getValue() == redMaxField) {
                                redPawns.get(finalI).changeFinishStatus();
                                redPawns.get(finalI).changeActivationStatus();
                                redPawns.get(finalI).setActivationNr(1);
                                redMaxField = redMaxField - 1;
                                drawBox.setText("Pionek Zakonczyl Gre");
                            }

                        }
                    } else {
                        if (redPawns.get(finalI).getActivationNr() == 0) {
                            redPawns.get(finalI).changeActivationStatus();
                            redPawns.get(finalI).setNewPosition(redPawns.get(finalI).getStartPosition());
                            redPawns.get(finalI).setValue(0);
                            board.getChildren().remove(redPawns.get(finalI).getPawnImage());
                            board.add(redPawns.get(finalI).getPawnImage(), 10, 6);
                        } else drawBox.setText("Pionek Zakonczyl Gre");
                    }
                } else if (dice != 6) {

                    if (redPawns.get(finalI).getActivationStatus()) {

                        if (redPawns.get(finalI).getActivationNr() == 1){
                            drawBox.setText("Pionek Zakonczyl Gre");
                        }

                        if (redPawns.get(finalI).getActivationNr() == 0) {
                            if (dice <= redMaxField - redPawns.get(finalI).getValue()) {
                                redPawns.get(finalI).setValue(redPawns.get(finalI).getValue() + dice);

                            }   else if (dice > redMaxField - redPawns.get(finalI).getValue()) {
                                drawBox.setText("Ruch niemozliwy, Wylosowano " + dice);
                            }
                        }
                        for (int j = 0; j < 44 ; j++) {
                            if (redPawns.get(finalI).getValue() == j) {
                                redPawns.get(finalI).setNewPosition(MapOfMovements.getListOfMovements().get(j));
                                for (int k = 0 ; k < 4; k++) {

                                    if (MapOfFields.getListOfFields().get(bluePawns.get(k).getCurrentField())   == MapOfFields.getListOfFields().get(redPawns.get(finalI).getCurrentField()) ) {

                                        board.getChildren().remove(bluePawns.get(k).getPawnImage());
                                        board.add(bluePawns.get(k).getPawnImage(), bluePawns.get(k).getStartPosition().getColumn(), bluePawns.get(k).getStartPosition().getRow());
                                        bluePawns.get(k).changeActivationStatus();
                                        bluePawns.get(k).setValue(0);
                                        bluePawns.get(k).setNewPosition(bluePawns.get(k).getStartPosition());

                                        board.getChildren().remove(redPawns.get(finalI).getPawnImage());
                                        board.add(redPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Niebieski Pionek Zbity");



                                    } else if (MapOfFields.getListOfFields().get(greenPawns.get(k).getCurrentField())   == MapOfFields.getListOfFields().get(redPawns.get(finalI).getCurrentField()) ) {

                                        board.getChildren().remove(greenPawns.get(k).getPawnImage());
                                        board.add(greenPawns.get(k).getPawnImage(), greenPawns.get(k).getStartPosition().getColumn(), greenPawns.get(k).getStartPosition().getRow());
                                        greenPawns.get(k).changeActivationStatus();
                                        greenPawns.get(k).setValue(0);
                                        greenPawns.get(k).setNewPosition(greenPawns.get(k).getStartPosition());

                                        board.getChildren().remove(redPawns.get(finalI).getPawnImage());
                                        board.add(redPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Zielony Pionek Zbity");


                                    } else if (MapOfFields.getListOfFields().get(yellowPawns.get(k).getCurrentField())   == MapOfFields.getListOfFields().get(redPawns.get(finalI).getCurrentField()) ) {

                                        board.getChildren().remove(yellowPawns.get(k).getPawnImage());
                                        board.add(yellowPawns.get(k).getPawnImage(), yellowPawns.get(k).getStartPosition().getColumn(), yellowPawns.get(k).getStartPosition().getRow());
                                        yellowPawns.get(k).changeActivationStatus();
                                        yellowPawns.get(k).setValue(0);
                                        yellowPawns.get(k).setNewPosition(yellowPawns.get(k).getStartPosition());
                                        board.getChildren().remove(redPawns.get(finalI).getPawnImage());
                                        board.add(redPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Zolty Pionek Zbity");

                                    }   else {
                                        board.getChildren().remove(redPawns.get(finalI).getPawnImage());
                                        board.add(redPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());

                                    }

                                }
                            }
                        }
                        for (int j = 40; j < 44 ; j++) {

                            if (redPawns.get(finalI).getValue() == redMaxField) {
                                redPawns.get(finalI).changeFinishStatus();
                                redPawns.get(finalI).changeActivationStatus();
                                redPawns.get(finalI).setActivationNr(1);
                                redMaxField = redMaxField - 1;
                                drawBox.setText("Pionek Zakonczyl Gre");
                            }

                        }
                    }
                }


            });

        }

    }

    private void putBluePawnsOnBoard(GridPane board) {

        bluePawns.add(0, bluePawn1);
        bluePawns.add(1, bluePawn2);
        bluePawns.add(2, bluePawn3);
        bluePawns.add(3, bluePawn4);
        board.add(bluePawns.get(0).getPawnImage(), 0, 9);
        board.add(bluePawns.get(1).getPawnImage(), 0, 10);
        board.add(bluePawns.get(2).getPawnImage(), 1, 9);
        board.add(bluePawns.get(3).getPawnImage(), 1, 10);

        for (int i=0;i < 4;i++) {
            int finalI = i;
            bluePawns.get(finalI).getPawnImage().setOnMouseClicked(g -> {

                if (dice == 6) {

                    if (bluePawns.get(finalI).getActivationStatus()) {
                        if (bluePawns.get(finalI).getActivationNr() == 1){
                            drawBox.setText("Pionek Zakonczyl Gre");
                        }

                        if (bluePawns.get(finalI).getActivationNr() == 0) {
                            if (dice <= blueMaxField - bluePawns.get(finalI).getValue()) {
                                bluePawns.get(finalI).setValue(bluePawns.get(finalI).getValue() + dice);

                            }  else if (dice > blueMaxField - bluePawns.get(finalI).getValue()) {
                                drawBox.setText("Ruch niemozliwy, Wylosowano " + dice);
                            }
                        }
                        for (int j = 44; j < 88 ; j++) {
                            if (bluePawns.get(finalI).getValue() == j) {
                                bluePawns.get(finalI).setNewPosition(MapOfMovements.getListOfMovements().get(j));
                                for (int k = 0 ; k < 4; k++) {

                                    if (MapOfFields.getListOfFields().get(redPawns.get(k).getCurrentField()) == MapOfFields.getListOfFields().get(bluePawns.get(finalI).getCurrentField())) {

                                        board.getChildren().remove(redPawns.get(k).getPawnImage());
                                        board.add(redPawns.get(k).getPawnImage(), redPawns.get(k).getStartPosition().getColumn(), redPawns.get(k).getStartPosition().getRow());
                                        redPawns.get(k).changeActivationStatus();
                                        redPawns.get(k).setValue(0);
                                        redPawns.get(k).setNewPosition(redPawns.get(k).getStartPosition());


                                        board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                                        board.add(bluePawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Czerwony Pionek Zbity");



                                    } else if (MapOfFields.getListOfFields().get(greenPawns.get(k).getCurrentField())   == MapOfFields.getListOfFields().get(bluePawns.get(finalI).getCurrentField())) {

                                        board.getChildren().remove(greenPawns.get(k).getPawnImage());
                                        board.add(greenPawns.get(k).getPawnImage(), greenPawns.get(k).getStartPosition().getColumn(), greenPawns.get(k).getStartPosition().getRow());
                                        greenPawns.get(k).changeActivationStatus();
                                        greenPawns.get(k).setValue(0);
                                        greenPawns.get(k).setNewPosition(greenPawns.get(k).getStartPosition());
                                        board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                                        board.add(bluePawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Zielony Pionek Zbity");


                                    } else if (MapOfFields.getListOfFields().get(yellowPawns.get(k).getCurrentField())   == MapOfFields.getListOfFields().get(bluePawns.get(finalI).getCurrentField())) {

                                        board.getChildren().remove(yellowPawns.get(k).getPawnImage());
                                        board.add(yellowPawns.get(k).getPawnImage(), yellowPawns.get(k).getStartPosition().getColumn(), yellowPawns.get(k).getStartPosition().getRow());
                                        yellowPawns.get(k).changeActivationStatus();
                                        yellowPawns.get(k).setValue(0);
                                        yellowPawns.get(k).setNewPosition(yellowPawns.get(k).getStartPosition());
                                        board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                                        board.add(bluePawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Zolty Pionek Zbity");

                                    } else {
                                        board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                                        board.add(bluePawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());

                                    }

                                }
                            }





                        }

                        for (int j = 84; j < 88 ; j++) {

                            if (bluePawns.get(finalI).getValue() == blueMaxField) {
                                bluePawns.get(finalI).changeFinishStatus();
                                bluePawns.get(finalI).changeActivationStatus();
                                bluePawns.get(finalI).setActivationNr(1);
                                blueMaxField = blueMaxField - 1;
                                drawBox.setText("Pionek Zakonczyl Gre");
                            }

                        }
                    } else {
                        if (bluePawns.get(finalI).getActivationNr() == 0) {
                            bluePawns.get(finalI).changeActivationStatus();
                            bluePawns.get(finalI).setNewPosition(bluePawns.get(finalI).getStartPosition());
                            bluePawns.get(finalI).setValue(44);
                            board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                            board.add(bluePawns.get(finalI).getPawnImage(), 4, 10);
                        } else drawBox.setText("Pionek Zakonczyl Gre");
                    }
                } else if (dice != 6) {

                    if (bluePawns.get(finalI).getActivationStatus()) {

                        if (bluePawns.get(finalI).getActivationNr() == 1){
                            drawBox.setText("Pionek Zakonczyl Gre");
                        }

                        if (bluePawns.get(finalI).getActivationNr() == 0) {
                            if (dice <= blueMaxField - bluePawns.get(finalI).getValue()) {
                                bluePawns.get(finalI).setValue(bluePawns.get(finalI).getValue() + dice);

                            }   else if (dice > blueMaxField - bluePawns.get(finalI).getValue()) {
                                drawBox.setText("Ruch niemozliwy, Wylosowano " + dice);
                            }
                        }

                            for (int j = 44; j < 88 ; j++) {
                                if (bluePawns.get(finalI).getValue() == j) {
                                    bluePawns.get(finalI).setNewPosition(MapOfMovements.getListOfMovements().get(j));
                                    for (int k = 0 ; k < 4; k++) {

                                        if (MapOfFields.getListOfFields().get(redPawns.get(k).getCurrentField())   == MapOfFields.getListOfFields().get(bluePawns.get(finalI).getCurrentField())) {

                                            board.getChildren().remove(redPawns.get(k).getPawnImage());
                                            board.add(redPawns.get(k).getPawnImage(), redPawns.get(k).getStartPosition().getColumn(), redPawns.get(k).getStartPosition().getRow());
                                            redPawns.get(k).changeActivationStatus();
                                            redPawns.get(k).setValue(0);
                                            redPawns.get(k).setNewPosition(redPawns.get(k).getStartPosition());
                                            board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                                            board.add(bluePawns.get(finalI).getPawnImage(),
                                                    MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                    MapOfMovements.getListOfMovements().get(j).getRow());
                                            drawBox.setText("Czerwony Pionek Zbity");



                                        } else if (MapOfFields.getListOfFields().get(greenPawns.get(k).getCurrentField())   == MapOfFields.getListOfFields().get(bluePawns.get(finalI).getCurrentField())) {

                                            board.getChildren().remove(greenPawns.get(k).getPawnImage());
                                            board.add(greenPawns.get(k).getPawnImage(), greenPawns.get(k).getStartPosition().getColumn(), greenPawns.get(k).getStartPosition().getRow());
                                            greenPawns.get(k).changeActivationStatus();
                                            greenPawns.get(k).setValue(0);
                                            greenPawns.get(k).setNewPosition(greenPawns.get(k).getStartPosition());
                                            board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                                            board.add(bluePawns.get(finalI).getPawnImage(),
                                                    MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                    MapOfMovements.getListOfMovements().get(j).getRow());
                                            drawBox.setText("Zielony Pionek Zbity");


                                        } else if (MapOfFields.getListOfFields().get(yellowPawns.get(k).getCurrentField())   == MapOfFields.getListOfFields().get(bluePawns.get(finalI).getCurrentField())) {

                                            board.getChildren().remove(yellowPawns.get(k).getPawnImage());
                                            board.add(yellowPawns.get(k).getPawnImage(), yellowPawns.get(k).getStartPosition().getColumn(), yellowPawns.get(k).getStartPosition().getRow());
                                            yellowPawns.get(k).changeActivationStatus();
                                            yellowPawns.get(k).setValue(0);
                                            yellowPawns.get(k).setNewPosition(yellowPawns.get(k).getStartPosition());
                                            board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                                            board.add(bluePawns.get(finalI).getPawnImage(),
                                                    MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                    MapOfMovements.getListOfMovements().get(j).getRow());
                                            drawBox.setText("Zolty Pionek Zbity");

                                        }     else {
                                        board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                                        board.add(bluePawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());

                                    }

                                }
                            }
                        }

                        for (int j = 84; j < 88 ; j++) {

                            if (bluePawns.get(finalI).getValue() == blueMaxField) {
                                bluePawns.get(finalI).changeFinishStatus();
                                bluePawns.get(finalI).changeActivationStatus();
                                bluePawns.get(finalI).setActivationNr(1);
                                blueMaxField = blueMaxField - 1;
                                drawBox.setText("Pionek Zakonczyl Gre");
                            }

                        }






                    }
                }


            });

        }


    }



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize mainbackgroundSize = new BackgroundSize(500,
                500,
                true,
                true,
                true,
                false);

        BackgroundSize backgroundSize = new BackgroundSize(1024,
                1024,
                true,
                true,
                true,
                false);

        BackgroundImage backgroundImageBoard = new BackgroundImage(imagebackBoard,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                backgroundSize);

        Background background = new Background(backgroundImageBoard);







        Button drawbtn1= new Button();
        drawbtn1.setText("Losuj");
        drawbtn1.setOnAction((e) -> {
                    dice = rollTheDice();
                    if (dice == 6) {
                        drawBox.setMinSize(350.00, 50.00);
                        drawBox.setText("Gratulacje, Wylosowano " + dice);
                    } else  drawBox.setText("Wylosowano " + dice);


            checkRed.setMinSize(350.00, 50.00);
            checkBlue.setMinSize(350.00, 50.00);
            checkGreen.setMinSize(350.00, 50.00);
            checkYellow.setMinSize(350.00, 50.00);
            checkBlue.setText("Blue 1: " + bluePawns.get(0).getValue() + "2: " + bluePawns.get(1).getValue() + "3: " + bluePawns.get(2).getValue() + "4: " + bluePawns.get(3).getValue());
            checkRed.setText("Red 1: " + redPawns.get(0).getValue() + "2: " + redPawns.get(1).getValue() + "3: " +redPawns.get(2).getValue()+ "4: " + redPawns.get(3).getValue());
            checkYellow.setText("Yellow 1: " + yellowPawns.get(0).getValue() + "2: " + yellowPawns.get(1).getValue() + "3: " + yellowPawns.get(2).getValue()+ "4: " + yellowPawns.get(3).getValue());
            checkGreen.setText(" Green 1: " + greenPawns.get(0).getValue() + "2: " + greenPawns.get(1).getValue() + "3: " + greenPawns.get(2).getValue()+ "4: " + greenPawns.get(3).getValue());
                    });




        MapOfMovements.addListOfMovements();
        MapOfFields.addListOfFields();
        board.add(drawbtn1,8,8);
        board.add(drawBox,8,7);
        board.add(checkYellow,3,7);
        board.add(checkGreen,3,8);
        board.add(checkBlue,3,9);
        board.add(checkRed,3,10);
        buildMain(main);
        buildSettings(settings);
        buildBoard(board);



        putRedPawnsOnBoard(board);
        putBluePawnsOnBoard(board);
        putGreenPawnsOnBoard(board);
        putYellowPawnsOnBoard(board);



        board.setBackground(background);
        Scene mainScene = new Scene(main, 300, 300, Color.BLACK);
        Scene settingsScene = new Scene(settings, 200, 150, Color.BLACK);
        Scene boardScene = new Scene(board, 1000, 1000, Color.BLACK);

        Button newGameButton = new Button("Nowa Gra");
        newGameButton.setOnAction(e -> primaryStage.setScene(settingsScene));
        newGameButton.setAlignment(Pos.CENTER);
        main.add(newGameButton,1,1);

        Button loadButton = new Button("Wczytaj Gre");
        loadButton.setOnAction(e -> primaryStage.setScene(boardScene));
        loadButton.setAlignment(Pos.CENTER);
        main.add(loadButton,1,2);

        Button exitButton = new Button("Wyjscie");
        exitButton.setOnAction(e -> System.exit(0));
        exitButton.setAlignment(Pos.CENTER);
        main.add(exitButton,1,3);


        playersLabel.setMinSize(300,15);
        settings.add(playersLabel,1,1);

        Button oneButton = new Button("1");
        oneButton.setOnAction(e -> {
            players = 1;
            primaryStage.setScene(boardScene);
        });
        settings.add(oneButton,1,2);

        Button twoButton = new Button("2");
        twoButton.setOnAction(e -> {
            players = 2;
            primaryStage.setScene(boardScene);
        });
        settings.add(twoButton,2,2);

        Button threeButton = new Button("3");
        threeButton.setOnAction(e -> {
            players = 3;
            primaryStage.setScene(boardScene);

        });
        settings.add(threeButton,1,3);

        Button fourButton = new Button("4");
        fourButton.setOnAction(e -> {
            players = 4;
            primaryStage.setScene(boardScene);

        });
        settings.add(fourButton,2,3);


        primaryStage.setTitle("Chinczyk");
        primaryStage.setResizable(false);
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }


}