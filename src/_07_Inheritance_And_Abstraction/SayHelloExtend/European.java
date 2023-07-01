package _07_Inheritance_And_Abstraction.SayHelloExtend;

public class European extends BasePerson{
    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
