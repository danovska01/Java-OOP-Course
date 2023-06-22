package _06_Inheritance_Ex.NeedForSpeed;

public class RaceMotorcycle extends Motorcycle{
    private static final int DEFAULT_FUEL_CONSUMPTION = 8;

    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
