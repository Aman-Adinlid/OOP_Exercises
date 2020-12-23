package org.example.model;

public class Rectangle {

    private double high;
    private double width;

    public Rectangle(double high) {
        this.high = high;

    }

    public Rectangle(double high, double width) {
        this.high = high;
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
