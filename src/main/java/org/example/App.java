package org.example;
;
import org.example.model.Car;

import java.util.concurrent.Callable;

public class App {

    public static void main(String[] args) {

        Car car = new Car(1123,2012,"Audio", "white",25);
        System.out.println(car.drive());


        Car car1 = new Car(123,2019,"slow","black",20);
        System.out.println(car1.drive());
        }
    }





