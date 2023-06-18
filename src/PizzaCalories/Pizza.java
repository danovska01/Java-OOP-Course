package _06_Encapsulation_Exersise_04_Pizza_Calories;

import PizzaCalories.Dough;
import PizzaCalories.Topping;

import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza (String name, int numberOfToppings){
        setName(name);
        numberOfToppings= this.toppings.size();
    }

    public void setToppings(int ){

    }

    private void setName(String name) {
        if(name.trim().isEmpty() || name.length() > 15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }


}