package com.kodilla.chinczyk;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;

public class Chinczyk extends Application {


    // plansza do gry
    private Image imageback = new Image("file:src/main/resources/board.png");
    private GridPane board = new GridPane();

    static ArrayList<RedPawn> redPawns = new ArrayList<>();

    Field startRed1 = new Field(10,10);
    Field startRed2 = new Field(10,9);
    Field startRed3 = new Field(9,9);
    Field startRed4 = new Field(9,10);

    RedPawn redPawn1 = new RedPawn(startRed1);
    RedPawn redPawn2 = new RedPawn(startRed2);
    RedPawn redPawn3 = new RedPawn(startRed3);
    RedPawn redPawn4 = new RedPawn(startRed4);
    int redMaxField = 44;

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
    int yellowMaxField = 44;

    static ArrayList<GreenPawn> greenPawns = new ArrayList<>();

    Field startGreen1 = new Field(10,0);
    Field startGreen2 = new Field(10,1);
    Field startGreen3 = new Field(9,0);
    Field startGreen4 = new Field(9,1);

    GreenPawn greenPawn1 = new GreenPawn(startGreen1);
    GreenPawn greenPawn2 = new GreenPawn(startGreen2);
    GreenPawn greenPawn3 = new GreenPawn(startGreen3);
    GreenPawn greenPawn4 = new GreenPawn(startGreen4);
    int greenMaxField = 44;


    private int dice;
    private Label drawBox = new Label();
    private Label checkRed = new Label();
    private Label checkBlue = new Label();



    public static int rollTheDice() {
            Random random = new Random();
            return random.nextInt(6) + 1;
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

                        if (dice < redMaxField - redPawns.get(finalI).getValue()) {
                            redPawns.get(finalI).setValue(redPawns.get(finalI).getValue() + dice);

                        } else if (redPawns.get(finalI).getFinishStatus()) {
                            drawBox.setText("Pionek zakonczyl Gre");
                        } else if (dice > redMaxField - redPawns.get(finalI).getValue()) {
                            drawBox.setText("Ruch niemozliwy, Wylosowano " + dice);
                        }

                        for (int j = 0; j < 44 ; j++) {
                            if (redPawns.get(finalI).getValue() == j) {
                                redPawns.get(finalI).setNewPosition(MapOfMovements.getListOfMovements().get(j));
                                for (int k = 0 ; k < 4; k++) {

                                    if (bluePawns.get(k).getValue() -34   == redPawns.get(finalI).getValue() ) {
                                        if (k == 0) {
                                            bluePawns.get(k).setValue(176);
                                        }
                                        if (k == 1) {
                                            bluePawns.get(k).setValue(177);
                                        }
                                        if (k == 2) {
                                            bluePawns.get(k).setValue(178);
                                        }
                                        if (k == 3) {
                                            bluePawns.get(k).setValue(179);
                                        }
                                        board.getChildren().remove(bluePawns.get(k).getPawnImage());
                                        board.add(bluePawns.get(k).getPawnImage(), bluePawns.get(k).getStartPosition().getColumn(), bluePawns.get(k).getStartPosition().getRow());
                                        bluePawns.get(k).changeActivationStatus();

                                        board.getChildren().remove(redPawns.get(finalI).getPawnImage());
                                        board.add(redPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Niebieski Pionek Zbity");

                                        if (redPawns.get(finalI).getValue() >= redMaxField) {
                                            redPawns.get(finalI).changeFinishStatus();
                                            redPawns.get(finalI).changeActivationStatus();
                                            redPawns.get(finalI).setActivationNr(1);
                                            drawBox.setText("Pionek Zakonczyl Gre");
                                        }

                                    } else if (greenPawns.get(k).getValue() + 30 == redPawns.get(finalI).getValue()) {
                                        board.getChildren().remove(greenPawns.get(k).getPawnImage());
                                        board.add(greenPawns.get(k).getPawnImage(), greenPawns.get(k).getStartPosition().getColumn(), greenPawns.get(k).getStartPosition().getRow());
                                        greenPawns.get(k).changeActivationStatus();
                                        board.getChildren().remove(redPawns.get(finalI).getPawnImage());
                                        board.add(redPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());

                                        if (redPawns.get(finalI).getValue() >= redMaxField) {
                                            redPawns.get(finalI).changeFinishStatus();
                                            redPawns.get(finalI).changeActivationStatus();
                                            redPawns.get(finalI).setActivationNr(1);
                                            drawBox.setText("Pionek Zakonczyl Gre");
                                        }

                                   } else if (yellowPawns.get(k).getValue() + 30 == redPawns.get(finalI).getValue()) {
                                       board.getChildren().remove(yellowPawns.get(k).getPawnImage());
                                       board.add(yellowPawns.get(k).getPawnImage(), yellowPawns.get(k).getStartPosition().getColumn(), yellowPawns.get(k).getStartPosition().getRow());
                                       yellowPawns.get(k).changeActivationStatus();
                                       board.getChildren().remove(redPawns.get(finalI).getPawnImage());
                                       board.add(redPawns.get(finalI).getPawnImage(),
                                               MapOfMovements.getListOfMovements().get(j).getColumn(),
                                               MapOfMovements.getListOfMovements().get(j).getRow());

                                       if (redPawns.get(finalI).getValue() >= redMaxField) {
                                           redPawns.get(finalI).changeFinishStatus();
                                           redPawns.get(finalI).changeActivationStatus();
                                           redPawns.get(finalI).setActivationNr(1);
                                           drawBox.setText("Pionek Zakonczyl Gre");
                                       }
                                   }


                                    else {
                                        board.getChildren().remove(redPawns.get(finalI).getPawnImage());
                                        board.add(redPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        if (redPawns.get(finalI).getValue() >= redMaxField) {
                                            redPawns.get(finalI).changeFinishStatus();
                                            redPawns.get(finalI).changeActivationStatus();
                                            redPawns.get(finalI).setActivationNr(1);
                                            drawBox.setText("Pionek Zakonczyl Gre");
                                        }
                                    }

                                }
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

                        if (dice < redMaxField - redPawns.get(finalI).getValue()) {
                            redPawns.get(finalI).setValue(redPawns.get(finalI).getValue() + dice);

                        } else if (redPawns.get(finalI).getFinishStatus()) {
                            drawBox.setText("Pionek zakonczyl Gre");
                        } else if (dice > redMaxField - redPawns.get(finalI).getValue()) {
                            drawBox.setText("Ruch niemozliwy, Wylosowano " + dice);
                        }

                        for (int j = 0; j < 44; j++) {
                            if (redPawns.get(finalI).getValue() == j) {
                                redPawns.get(finalI).setNewPosition(MapOfMovements.getListOfMovements().get(j));
                                for (int k = 0 ; k < 4; k++) {

                                    if (bluePawns.get(k).getValue() -34   == redPawns.get(finalI).getValue()) {
                                        if (k == 0) {
                                            bluePawns.get(k).setValue(176);
                                        }
                                        if (k == 1) {
                                            bluePawns.get(k).setValue(177);
                                        }
                                        if (k == 2) {
                                            bluePawns.get(k).setValue(178);
                                        }
                                        if (k == 3) {
                                            bluePawns.get(k).setValue(179);
                                        }
                                        board.getChildren().remove(bluePawns.get(k).getPawnImage());
                                        board.add(bluePawns.get(k).getPawnImage(), bluePawns.get(k).getStartPosition().getColumn(), bluePawns.get(k).getStartPosition().getRow());
                                        bluePawns.get(k).changeActivationStatus();


                                        board.getChildren().remove(redPawns.get(finalI).getPawnImage());
                                        board.add(redPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Niebieski Pionek Zbity");

                                        if (redPawns.get(finalI).getValue() >= redMaxField) {
                                            redPawns.get(finalI).changeFinishStatus();
                                            redPawns.get(finalI).changeActivationStatus();
                                            redPawns.get(finalI).setActivationNr(1);
                                            drawBox.setText("Pionek Zakonczyl Gre");
                                        }

                                    } else if (greenPawns.get(k).getValue() + 30 == redPawns.get(finalI).getValue()) {
                                        board.getChildren().remove(greenPawns.get(k).getPawnImage());
                                        board.add(greenPawns.get(k).getPawnImage(), greenPawns.get(k).getStartPosition().getColumn(), greenPawns.get(k).getStartPosition().getRow());
                                        greenPawns.get(k).changeActivationStatus();
                                        board.getChildren().remove(redPawns.get(finalI).getPawnImage());
                                        board.add(redPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());

                                        if (redPawns.get(finalI).getValue() >= redMaxField) {
                                            redPawns.get(finalI).changeFinishStatus();
                                            redPawns.get(finalI).changeActivationStatus();
                                            redPawns.get(finalI).setActivationNr(1);
                                            drawBox.setText("Pionek Zakonczyl Gre");
                                        }

                                    } else if (yellowPawns.get(k).getValue() + 30 == redPawns.get(finalI).getValue()) {
                                        board.getChildren().remove(yellowPawns.get(k).getPawnImage());
                                        board.add(yellowPawns.get(k).getPawnImage(), yellowPawns.get(k).getStartPosition().getColumn(), yellowPawns.get(k).getStartPosition().getRow());
                                        yellowPawns.get(k).changeActivationStatus();
                                        board.getChildren().remove(redPawns.get(finalI).getPawnImage());
                                        board.add(redPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());

                                        if (redPawns.get(finalI).getValue() >= redMaxField) {
                                            redPawns.get(finalI).changeFinishStatus();
                                            redPawns.get(finalI).changeActivationStatus();
                                            redPawns.get(finalI).setActivationNr(1);
                                            drawBox.setText("Pionek Zakonczyl Gre");
                                        }
                                    }  else {
                                        board.getChildren().remove(redPawns.get(finalI).getPawnImage());
                                        board.add(redPawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        if (redPawns.get(finalI).getValue() >= redMaxField) {
                                            redPawns.get(finalI).changeFinishStatus();
                                            redPawns.get(finalI).changeActivationStatus();
                                            redPawns.get(finalI).setActivationNr(1);
                                            drawBox.setText("Pionek Zakonczyl Gre");
                                        }
                                    }

                                }
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
        board.add(bluePawns.get(0).getPawnImage(), 0, 10);
        board.add(bluePawns.get(1).getPawnImage(), 0, 9);
        board.add(bluePawns.get(2).getPawnImage(), 1, 10);
        board.add(bluePawns.get(3).getPawnImage(), 1, 9);

        for (int i=0;i < 4;i++) {
            int finalI = i;
            bluePawns.get(finalI).getPawnImage().setOnMouseClicked(g -> {

                if (dice == 6) {

                    if (bluePawns.get(finalI).getActivationStatus()) {

                        if (dice < blueMaxField - bluePawns.get(finalI).getValue()) {
                            bluePawns.get(finalI).setValue(bluePawns.get(finalI).getValue() + dice);

                        } else if (bluePawns.get(finalI).getFinishStatus()) {
                            drawBox.setText("Pionek zakonczyl Gre");
                        } else if (dice > blueMaxField - bluePawns.get(finalI).getValue()) {
                            drawBox.setText("Ruch niemozliwy, Wylosowano " + dice);
                        }

                        for (int j = 44; j < 88; j++) {
                            if (bluePawns.get(finalI).getValue() == j) {
                                bluePawns.get(finalI).setNewPosition(MapOfMovements.getListOfMovements().get(j));
                                for (int k = 0 ; k < 4; k++) {

                                    if (redPawns.get(k).getValue() + 34 == bluePawns.get(finalI).getValue()) {
                                        if (k == 0) {
                                            redPawns.get(k).setValue(180);
                                        }
                                        if (k == 1) {
                                            redPawns.get(k).setValue(181);
                                        }
                                        if (k == 2) {
                                            redPawns.get(k).setValue(182);
                                        }
                                        if (k == 3) {
                                            redPawns.get(k).setValue(183);
                                        }
                                        board.getChildren().remove(redPawns.get(k).getPawnImage());
                                        board.add(redPawns.get(k).getPawnImage(), redPawns.get(k).getStartPosition().getColumn(), redPawns.get(k).getStartPosition().getRow());
                                        redPawns.get(k).changeActivationStatus();


                                        board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                                        board.add(bluePawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Czerwony Pionek Zbity");

                                        if (bluePawns.get(finalI).getValue() >= blueMaxField) {
                                            bluePawns.get(finalI).changeFinishStatus();
                                            bluePawns.get(finalI).changeActivationStatus();
                                            bluePawns.get(finalI).setActivationNr(1);
                                            drawBox.setText("Pionek Zakonczyl Gre");
                                        }

                                    } else if (greenPawns.get(k).getValue() + 30 == bluePawns.get(finalI).getValue()) {
                                        board.getChildren().remove(greenPawns.get(k).getPawnImage());
                                        board.add(greenPawns.get(k).getPawnImage(), greenPawns.get(k).getStartPosition().getColumn(), greenPawns.get(k).getStartPosition().getRow());
                                        greenPawns.get(k).changeActivationStatus();
                                        board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                                        board.add(bluePawns.get(finalI).getPawnImage(),
                                                MapOfBlueMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfBlueMovements.getListOfMovements().get(j).getRow());

                                        if (bluePawns.get(finalI).getValue() >= blueMaxField) {
                                            bluePawns.get(finalI).changeFinishStatus();
                                            bluePawns.get(finalI).changeActivationStatus();
                                            bluePawns.get(finalI).setActivationNr(1);
                                            drawBox.setText("Pionek Zakonczyl Gre");
                                        }

                                    } else if (yellowPawns.get(k).getValue() + 30 == bluePawns.get(finalI).getValue()) {
                                        board.getChildren().remove(yellowPawns.get(k).getPawnImage());
                                        board.add(yellowPawns.get(k).getPawnImage(), yellowPawns.get(k).getStartPosition().getColumn(), yellowPawns.get(k).getStartPosition().getRow());
                                        yellowPawns.get(k).changeActivationStatus();
                                        board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                                        board.add(bluePawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());

                                        if (bluePawns.get(finalI).getValue() >= blueMaxField) {
                                            bluePawns.get(finalI).changeFinishStatus();
                                            bluePawns.get(finalI).changeActivationStatus();
                                            bluePawns.get(finalI).setActivationNr(1);
                                            drawBox.setText("Pionek Zakonczyl Gre");
                                        }
                                    }


                                    else {
                                        board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                                        board.add(bluePawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        if (bluePawns.get(finalI).getValue() >= blueMaxField) {
                                            bluePawns.get(finalI).changeFinishStatus();
                                            bluePawns.get(finalI).changeActivationStatus();
                                            bluePawns.get(finalI).setActivationNr(1);
                                            drawBox.setText("Pionek Zakonczyl Gre");
                                        }
                                    }

                                }
                            }
                        }
                    } else {
                        if (bluePawns.get(finalI).getActivationNr() == 0) {
                            bluePawns.get(finalI).changeActivationStatus();
                            bluePawns.get(finalI).setNewPosition(bluePawns.get(finalI).getStartPosition());
                            bluePawns.get(finalI).setValue(44);
                            board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                            board.add(bluePawns.get(finalI).getPawnImage(), 4,10);
                        } else drawBox.setText("Pionek Zakonczyl Gre");
                    }
                }

                if (dice != 6) {

                    if (bluePawns.get(finalI).getActivationStatus()) {

                        if (dice < blueMaxField - bluePawns.get(finalI).getValue()) {
                            bluePawns.get(finalI).setValue(bluePawns.get(finalI).getValue() + dice);

                        } else if (bluePawns.get(finalI).getFinishStatus()) {
                            drawBox.setText("Pionek zakonczyl Gre");
                        } else if (dice > blueMaxField - bluePawns.get(finalI).getValue()) {
                            drawBox.setText("Ruch niemozliwy, Wylosowano " + dice);
                        }

                        for (int j = 44; j < 88; j++) {
                            if (bluePawns.get(finalI).getValue() == j) {
                                bluePawns.get(finalI).setNewPosition(MapOfMovements.getListOfMovements().get(j));
                                for (int k = 0 ; k < 4; k++) {

                                    if (redPawns.get(k).getValue() + 34 == bluePawns.get(finalI).getValue()) {
                                        if (k == 0) {
                                            redPawns.get(k).setValue(180);
                                        }
                                        if (k == 1) {
                                            redPawns.get(k).setValue(181);
                                        }
                                        if (k == 2) {
                                            redPawns.get(k).setValue(182);
                                        }
                                        if (k == 3) {
                                            redPawns.get(k).setValue(183);
                                        }
                                        board.getChildren().remove(redPawns.get(k).getPawnImage());
                                        board.add(redPawns.get(k).getPawnImage(), redPawns.get(k).getStartPosition().getColumn(), redPawns.get(k).getStartPosition().getRow());
                                        redPawns.get(k).changeActivationStatus();

                                        board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                                        board.add(bluePawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        drawBox.setText("Czerwony Pionek Zbity");

                                        if (bluePawns.get(finalI).getValue() >= blueMaxField) {
                                            bluePawns.get(finalI).changeFinishStatus();
                                            bluePawns.get(finalI).changeActivationStatus();
                                            bluePawns.get(finalI).setActivationNr(1);
                                            drawBox.setText("Pionek Zakonczyl Gre");
                                        }

                                    } else if (greenPawns.get(k).getValue() + 30 == bluePawns.get(finalI).getValue()) {
                                        board.getChildren().remove(greenPawns.get(k).getPawnImage());
                                        board.add(greenPawns.get(k).getPawnImage(), greenPawns.get(k).getStartPosition().getColumn(), greenPawns.get(k).getStartPosition().getRow());
                                        greenPawns.get(k).changeActivationStatus();
                                        board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                                        board.add(bluePawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());

                                        if (bluePawns.get(finalI).getValue() >= blueMaxField) {
                                            bluePawns.get(finalI).changeFinishStatus();
                                            bluePawns.get(finalI).changeActivationStatus();
                                            bluePawns.get(finalI).setActivationNr(1);
                                            drawBox.setText("Pionek Zakonczyl Gre");
                                        }

                                    } else if (yellowPawns.get(k).getValue() + 30 == bluePawns.get(finalI).getValue()) {
                                        board.getChildren().remove(yellowPawns.get(k).getPawnImage());
                                        board.add(yellowPawns.get(k).getPawnImage(), yellowPawns.get(k).getStartPosition().getColumn(), yellowPawns.get(k).getStartPosition().getRow());
                                        yellowPawns.get(k).changeActivationStatus();
                                        board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                                        board.add(bluePawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());

                                        if (bluePawns.get(finalI).getValue() >= blueMaxField) {
                                            bluePawns.get(finalI).changeFinishStatus();
                                            bluePawns.get(finalI).changeActivationStatus();
                                            bluePawns.get(finalI).setActivationNr(1);
                                            drawBox.setText("Pionek Zakonczyl Gre");
                                        }
                                    }


                                    else {
                                        board.getChildren().remove(bluePawns.get(finalI).getPawnImage());
                                        board.add(bluePawns.get(finalI).getPawnImage(),
                                                MapOfMovements.getListOfMovements().get(j).getColumn(),
                                                MapOfMovements.getListOfMovements().get(j).getRow());
                                        if (bluePawns.get(finalI).getValue() >= blueMaxField) {
                                            bluePawns.get(finalI).changeFinishStatus();
                                            bluePawns.get(finalI).changeActivationStatus();
                                            bluePawns.get(finalI).setActivationNr(1);
                                            drawBox.setText("Pionek Zakonczyl Gre");
                                        }
                                    }

                                }
                            }
                        }
                    }
                }

                checkRed.setMinSize(650.00, 50.00);
                checkBlue.setMinSize(650.00, 50.00);
                checkBlue.setText("1: " + bluePawns.get(0).getCurrentField() + "2: " + bluePawns.get(1).getCurrentField()+ " 3: " + bluePawns.get(2).getCurrentField()+ " 4: " + bluePawns.get(3).getCurrentField());
                checkRed.setText("1: " + redPawns.get(0).getCurrentField() + "2: " + redPawns.get(1).getCurrentField() + "3: " +redPawns.get(2).getCurrentField()+ "4: " + redPawns.get(3).getCurrentField());


            });

        }


    }



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(1024,
                1024,
                true,
                true,
                true,
                false);

        BackgroundImage backgroundImage = new BackgroundImage(imageback,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                backgroundSize);

        Background background = new Background(backgroundImage);






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
            checkBlue.setText("1: " + bluePawns.get(0).getValue() + "2: " + bluePawns.get(1).getValue()+ "3: " + bluePawns.get(2).getValue()+ "4: " + bluePawns.get(3).getValue());
            checkRed.setText("1: " + redPawns.get(0).getValue() + "2: " + redPawns.get(1).getValue()+ "3: " +redPawns.get(2).getValue()+ "4: " + redPawns.get(3).getValue());
                    });





        MapOfMovements.addListOfMovements();
        MapOfBlueMovements.addListOfMovements();
        board.add(drawbtn1,8,8);
        board.add(drawBox,8,7);
        board.add(checkBlue,3,9);
        board.add(checkRed,3,10);
        buildBoard(board);
        putRedPawnsOnBoard(board);
        putBluePawnsOnBoard(board);
        putGreenPawnsOnBoard(board);
        putYellowPawnsOnBoard(board);






        board.setBackground(background);

        Scene scene = new Scene(board, 1000, 1000, Color.BLACK);

        primaryStage.setTitle("Chinczyk");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}