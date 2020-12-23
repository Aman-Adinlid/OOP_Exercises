package org.example.model;

public class Car {


        private int id;
        private int year;
        private String model;
        private String color;
        private long motorSize;


    public Car(int id, int year, String model, String color, long motorSize) {
        this.id = id;
        this.year = year;
        this.model = model;
        this.color = color;
        this.motorSize = motorSize;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(long motorSize) {
        this.motorSize = motorSize;
    }
}