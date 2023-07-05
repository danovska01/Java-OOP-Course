package _10_Polymorphism_Ex.vehicles;

import java.text.DecimalFormat;

class Truck extends Vehicle {
        public Truck(double fuelQuantity, double litersPerKm) {
            super(fuelQuantity, litersPerKm);
        }

        @Override
        public String drive(double distance) {
            double fuelNeeded = (distance * getLitersPerKm() + (distance * 1.6));
            if (fuelNeeded <= getFuelQuantity()) {
                setFuelQuantity(getFuelQuantity()-fuelNeeded);
                DecimalFormat df = new DecimalFormat("##.##");
                return this.getClass().getSimpleName() + " travelled " + df.format(distance) + " km";
            } else {
                return String.format("%s needs refueling", this.getClass().getSimpleName());
            }
        }

        @Override
        public void refuel(double liters) {
            super.refuel(liters * 0.95);
        }
    }

