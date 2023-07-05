package _10_Polymorphism_Ex.wildFarm;

public class Zebra extends Mammal{


    public Zebra(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food f) {
        if(f instanceof Meat ) {
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
        super.eat(f);
    }
}
