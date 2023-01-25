package oop_basic;

import oop_basic.cars.Car;

public class Main {

    static Car car = new Car(4,5,1.9, "VW", "Jetta", "Diesel");

    public static void main(String[] args) {
        System.out.println("Hello World!\n" + car);

        car.getHorn();

        /** OOP:
         * - klasy, obiekty, metody
         * - konstruktory
         * - parametry
         * - dziedziczenie
         * - argumenty metod
         * - slowa kluczowe*/
    }
}
