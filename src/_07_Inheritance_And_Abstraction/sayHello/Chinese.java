package _07_Inheritance_And_Abstraction.sayHello;

public class Chinese implements Person{
    private String name;
    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
