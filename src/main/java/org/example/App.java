package org.example;
;
import org.example.model.Car;

public class App {

    public static void main(String[] args) {

        Car car = new Car(12456, 2019, "Audio", "white",25);
        System.out.println("model: "+car.getModel()+"motorSize: "+car.getMotorSize()+"can drive now");
        System.out.println("drive");


    }
}




