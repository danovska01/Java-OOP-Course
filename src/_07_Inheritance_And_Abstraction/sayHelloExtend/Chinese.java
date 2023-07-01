package _07_Inheritance_And_Abstraction.sayHelloExtend;

public class Chinese extends BasePerson{
    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
