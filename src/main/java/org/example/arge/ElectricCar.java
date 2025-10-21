package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() { return avgKmPerCharge; }
    public int getBatterySize() { return batterySize; }

    @Override
    public void startEngine() {
        System.out.println("ElectricCar engine starting silently.");
    }

    @Override
    public void drive() {
        System.out.println("ElectricCar driving. Range: " + avgKmPerCharge + " km per charge.");
        super.drive();
    }
}
