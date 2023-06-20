package _04_Encapsulation_Ex.PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (!toppingType.equals("Meat") && !toppingType.equals("Veggies") && !toppingType.equals("Cheese") && !toppingType.equals("Sauce")) {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }
    public double calculateCalories() {
        double modifier = 2.0;
        if (toppingType.equals("Meat")) {
            modifier *= 1.2;
        } else if (toppingType.equals("Veggies")) {
            modifier *= 0.8;
        } else if (toppingType.equals("Cheese")) {
            modifier *= 1.1;
        } else if (toppingType.equals("Sauce")) {
            modifier *= 0.9;
        }
        return (weight * modifier);
    }
}
