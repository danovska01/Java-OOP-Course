package _06_Inheritance_Ex.animals;

public class Kitten extends Cat{
    private final static String genderKitten = "Female";
    public Kitten(String name, int age) {
        super(name, age, genderKitten);
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
