package _10_Polymorphism_Ex.wildFarm;

public class Tiger extends Feline {
    private String livingRegion;

    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }


    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food f) {
        if(f instanceof Vegetable ){
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        super.eat(f);
    }
}
