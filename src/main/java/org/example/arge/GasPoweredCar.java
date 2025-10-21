package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() { return avgKmPerLitre; }
    public int getCylinders() { return cylinders; }

    @Override
    public void startEngine() {
        System.out.println("GasPoweredCar engine starting with " + getCylinders() + " cylinders.");
    }

    @Override
    public void drive() {
        System.out.println("GasPoweredCar driving. Efficiency: " + avgKmPerLitre + " km/l");
        super.drive();
    }
}
