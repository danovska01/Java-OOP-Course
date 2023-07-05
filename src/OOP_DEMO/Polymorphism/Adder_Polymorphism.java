package OOP_DEMO.Polymorphism;
//What is Compile-time polymorphism
//When method overloading is used, which method to call is resolved during the compile time by looking at the signature of the method invoke statement.
//What is method overloading?
//A feature that allows a class to have more than one method having the same name but with different signatures.
//What is the signature of a method?
//The signature of a method is determined by the number of arguments, types of each argument, and the order of the arguments.
// The return type of the method does not affect the signature.

public class Adder_Polymorphism {
    // method 1
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    // method 2
    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    // method 3
    public void add(String a, String b) {
        System.out.println(a + " + " + b);
    }
}

// My main class
class MyMain {
    public static void main(String[] args) {
        Adder_Polymorphism adder = new Adder_Polymorphism(); // create a Adder object
        adder.add(5, 4); // invoke method 1
        adder.add(5, 4, 3); // invoke method 2
        adder.add("5", "4"); // invoke method 3
    }
}



