package _10_Polymorphism_Ex.vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle {

    public Car(double fuelQuantity, double litersPerKm) {
        super(fuelQuantity, litersPerKm);
    }

    @Override
    public String drive(double distance) {
        double fuelNeeded = (distance * getLitersPerKm()) + (distance * 0.9);
        if (fuelNeeded <= getFuelQuantity()) {
            setFuelQuantity( getFuelQuantity() - fuelNeeded);
            DecimalFormat df = new DecimalFormat("##.##");
            return this.getClass().getSimpleName() + " travelled " + df.format(distance) + " km";
        } else {
            return String.format("%s needs refueling", this.getClass().getSimpleName());
        }
    }
}
