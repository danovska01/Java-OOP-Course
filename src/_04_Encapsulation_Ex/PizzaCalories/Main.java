package _04_Encapsulation_Ex.PizzaCalories;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaInfo = scanner.nextLine().split("\\s+");
        String pizzaName = pizzaInfo[1];
        int numberOfToppings = Integer.parseInt(pizzaInfo[2]);

        try {
            validateNumberOfToppings(numberOfToppings);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        Pizza pizza = new Pizza(pizzaName, numberOfToppings);

        String[] doughInfo = scanner.nextLine().split("\\s+");
        String flourType = doughInfo[1];
        String bakingTechnique = doughInfo[2];
        double doughWeight = Double.parseDouble(doughInfo[3]);

        try {
            Dough dough = new Dough(flourType, bakingTechnique, doughWeight);
            pizza.setDough(dough);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        String toppingInfo;
        while (!(toppingInfo = scanner.nextLine()).equals("END")) {
            String[] toppingData = toppingInfo.split("\\s+");
            String toppingType = toppingData[1];
            double toppingWeight = Double.parseDouble(toppingData[2]);

            try {
                Topping topping = new Topping(toppingType, toppingWeight);
                pizza.addTopping(topping);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        double overallCalories = pizza.getOverallCalories();
        System.out.printf("%s - %.2f%n", pizza.getName(), overallCalories);
    }

    private static void validateNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }
}
