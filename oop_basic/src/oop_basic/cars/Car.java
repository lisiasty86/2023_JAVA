package oop_basic.cars;

public class Car {

    // Musimy okreslic skladniki Car. Czyli elementy, z ktorych sklada sie ten typ.

    int wheels;
    int doors;
    double engineCapacity;
    String brand;
    String model;
    String fuel;

    public void getHorn () {
        System.out.println("BIIIIIIII");
    }

    public Car(int wheels, int doors, double engineCapacity, String brand, String model, String fuel) {
        this.wheels = wheels;
        this.doors = doors;
        this.engineCapacity = engineCapacity;
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", doors=" + doors +
                ", engineCapacity=" + engineCapacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
