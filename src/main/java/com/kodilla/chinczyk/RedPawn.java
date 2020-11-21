package com.kodilla.chinczyk;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class RedPawn {
    private Field currentField,startPosition;
    private int value,activationStatus, fieldNr = 0;
    private boolean activate,finished;
    Circle redPawn = new Circle(10.0f, 10.0f, 40.f );


    public int getFieldNr() {
        return fieldNr;
    }

    public void setFieldNr(int fieldNr) {
        this.fieldNr = fieldNr;
    }

    public RedPawn(Field startPosition) {
        this.startPosition = startPosition;
        this.activate = false;

        this.finished = false;
        redPawn.setFill(Color.DARKRED);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Field getCurrentField() {
        return currentField;
    }

    public Field getStartPosition(){return startPosition;}

    public void setActivationNr(int value) {
        this.activationStatus = value;
    }

    public int getActivationNr (){return activationStatus;}

    public void setNewPosition(Field field) {
        this.currentField = field;
    }

    public boolean getActivationStatus() {
        return activate;
    }

    public boolean changeActivationStatus() {
        activate = !activate;
        return activate;
    }

    public boolean getFinishStatus() {
        return finished;
    }

    public boolean changeFinishStatus() {
        finished = !finished;
        return finished;
    }

    public Circle getPawnImage() {
        return redPawn;
    }
}
