package PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);


        String [] pizzaInput = scanner.nextLine().split(" ");
        //Pizza {pizzaName} {numberOfToppings}
        String [] doughInput = scanner.nextLine().split(" ");
        //Dough {flourType} {bakingTechnique} {weightInGrams}


        String [] input = scanner.nextLine().split(" ");
        while (!input[0].equals("END")){
            //Topping {toppingType} {weightInGrams}


            input=scanner.nextLine().split(" ");
        }



        try {
            Dough d = new Dough(FlourType.White.name(), "sds", 100);
            System.out.println(d.calculateCalories());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
