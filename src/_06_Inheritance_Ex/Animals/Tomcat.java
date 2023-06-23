package _06_Inheritance_Ex.Animals;

public class Tomcat extends Cat{
    private final static String genderKitten = "Male";
    public Tomcat(String name, int age) {
        super(name, age, genderKitten);
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}
