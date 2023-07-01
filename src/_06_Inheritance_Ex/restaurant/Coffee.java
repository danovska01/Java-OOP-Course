package _06_Inheritance_Ex.restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage{

    private final double caffeine;
    private static final double COFFEE_MILLILITERS = 50;
    private static final BigDecimal COFFEE_PRICE = new BigDecimal("3.50");


    public Coffee(String name, double caffeine) {
        super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
        this.caffeine = caffeine;
    }

    public double getCaffeine() {
        return caffeine;
    }

}
