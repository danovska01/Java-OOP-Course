package _07_Inheritance_And_Abstraction.sayHelloExtend;

public class Bulgarian extends BasePerson{


    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
