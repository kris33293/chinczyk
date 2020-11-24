package com.kodilla.chinczyk;

import java.util.Objects;

public class Field {
    private int column,row;

    public Field(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return column == field.column &&
                row == field.row;
    }

    @Override
    public int hashCode() {
        return Objects.hash(column, row);
    }

    @Override
    public String toString() {
        return "Field{" +
                "column=" + column +
                ", row=" + row +
                '}';
    }
}
