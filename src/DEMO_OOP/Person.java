package DEMO_OOP;

public class Person {
    static final String planet = "Earth";

    static final int ears = 2;
    static  int legs = 2;
    private String name; // private access modifier
    public int age; // public access modifier
    protected String address; // protected access modifier

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private void displayDetails() { // private method
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public void introduce() { // public method
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I am " + age + " years old.");
    }

    protected void changeAddress(String newAddress) { // protected method
        address = newAddress;
        System.out.println("Address changed to: " + address);
    }

    public static void main(String[] args) {
        Person person = new Person("John", 30, "123 Main St");

        person.displayDetails(); // Compile-time error, private method cannot be accessed outside the class

        person.introduce(); // Accessible, as the method is public

        System.out.println("Age: " + person.age); // Accessible, as the field is public

        person.changeAddress("456 Park Ave"); // Accessible, as the method is protected
    }
}
