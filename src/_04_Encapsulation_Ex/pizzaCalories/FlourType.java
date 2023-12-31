package _04_Encapsulation_Ex.pizzaCalories;

public enum FlourType {
    White(1.5), Wholegrain(1.0), Crispy(0.9), Chewy(1.1), Homemade(1.0);

    private final double modifier;
    FlourType(double modifier){
        this.modifier = modifier;
    }
    public double getModifier(){
        return 2 * this.modifier;
    }
}