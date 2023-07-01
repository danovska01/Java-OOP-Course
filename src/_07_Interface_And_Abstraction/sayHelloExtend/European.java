package _07_Interface_And_Abstraction.sayHelloExtend;

public class European extends BasePerson{
    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
