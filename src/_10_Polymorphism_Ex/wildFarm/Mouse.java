package _10_Polymorphism_Ex.wildFarm;

public class Mouse extends Mammal{


    public Mouse(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food f) {
        if(f instanceof Meat ) {
            throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
            super.eat(f);
    }
}
