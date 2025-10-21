package org.example;

import org.example.company.*;
import org.example.arge.*;

public class Main {
    public static void main(String[] args) {

        Car baseCar = new Car(8, "Base car");
        System.out.println(baseCar.startEngine());
        System.out.println(baseCar.accelerate());
        System.out.println(baseCar.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println("\n--- CarSkeleton Polymorphism Test ---");
        GasPoweredCar gasCar = new GasPoweredCar("GasCar1", "Fuel efficient", 15.5, 4);
        gasCar.startEngine();
        gasCar.drive();

        ElectricCar electricCar = new ElectricCar("ElectricCar1", "Silent car", 200, 75);
        electricCar.startEngine();
        electricCar.drive();

        HybridCar hybridCar = new HybridCar("HybridCar1", "Hybrid car", 18.0, 50, 4);
        hybridCar.startEngine();
        hybridCar.drive();
    }
}
