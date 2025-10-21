package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true; // motor her zaman var
        this.wheels = 4;    // default 4 teker
    }

    public int getCylinders() { return cylinders; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Car{" + "cylinders=" + cylinders + ", name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders &&
                Objects.equals(name, car.name);
    }

    public String startEngine() {
        String msg = "the car's engine is starting";
        System.out.println(getClass().getSimpleName() + " -> " + msg);
        return msg;
    }

    public String accelerate() {
        String msg = "the car is accelerating";
        System.out.println(getClass().getSimpleName() + " -> " + msg);
        return msg;
    }

    public String brake() {
        String msg = "the car is braking";
        System.out.println(getClass().getSimpleName() + " -> " + msg);
        return msg;
    }
}
