package _10_Polymorphism_Ex.vehicles;

import java.text.DecimalFormat;

public class Vehicle {


    private double fuelQuantity;
    private double litersPerKm;

    public Vehicle(double fuelQuantity, double litersPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.litersPerKm = litersPerKm;
    }


    protected double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getLitersPerKm() {
        return litersPerKm;
    }

    public void setLitersPerKm(double litersPerKm) {
        this.litersPerKm = litersPerKm;
    }


    public String drive (double distance) {
        double fuelNeeded = distance * litersPerKm;
        if (this.getFuelQuantity() >= fuelNeeded) {
            this.setFuelQuantity(this.getFuelQuantity() - fuelNeeded);
            DecimalFormat df = new DecimalFormat("##.##");
            return this.getClass().getSimpleName() + " travelled " + df.format(distance) + " km";
        }
        return this.getClass().getSimpleName() + " needs refueling";
    }
    public void refuel(double liters) {
        fuelQuantity += liters;
    }
}
