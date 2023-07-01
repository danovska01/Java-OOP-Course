package _06_Inheritance_Ex.restaurant;

import java.math.BigDecimal;

public class Salmon extends MainDish{
    private static final double SALMON_GRAMS = 22;

    public Salmon(String name, BigDecimal price) {
        super(name, price, SALMON_GRAMS);

    }
}
