package com.kodilla.chinczyk;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class GreenPawn {
    private Field currentField,startPosition;
    private int value = 132;
    private int activationStatus = 0;
    private boolean activate,finished;
    Circle redPawn = new Circle(10.0f, 10.0f, 40.f );



    public GreenPawn(Field startPosition) {
        this.startPosition = startPosition;
        this.activate = false;
        this.currentField = currentField;
        this.finished = false;
        redPawn.setFill(Color.DARKGREEN);
    }
    public void setActivationNr(int value) {
        this.activationStatus = value;
    }

    public int getActivationNr (){return activationStatus;};

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Field getCurrentField() {
        return currentField;
    }

    public void setNewPosition(Field field) {
        this.currentField = field;
    }

    public boolean getActivationStatus() {
        return activate;
    }

    public Field getStartPosition(){return startPosition;}

    public boolean changeActivationStatus() {
        if (activate ) {
            activate = false;
        } else {
            activate = true;
        }
        return activate;
    }

    public boolean getFinishStatus() {
        return finished;
    }

    public boolean changeFinishStatus() {
        if (finished == true) {
            finished = false;
        } else {
            finished = true;
        }
        return finished;
    }

    public Circle getPawnImage() {
        return redPawn;
    }
}
