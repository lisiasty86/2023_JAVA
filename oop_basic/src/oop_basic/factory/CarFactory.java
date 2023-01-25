package oop_basic.factory;

import oop_basic.cars.Car;

public class CarFactory {

    Car car = new Car(4,5,1.9, "VW", "Jetta", "Diesel"); // referencja do klasy Car

    public Car getCar() {

        return car;
    }

}
