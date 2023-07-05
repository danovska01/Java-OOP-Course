package OOP_DEMO.Asbtraction;
//Why use Abstract classes?
//To have some methods to implement later. If you don't use an abstract class,
// you have to implement the AnimalSound() method in the Animal class even if you inherit it from another class.



//abstract class
public abstract class Animal_Abstract_Class {
    public abstract void animalSound(); // abstract method
    public void sleep() {
        System.out.println("Zzzzzz!");
    }
}
// subclass (inherits the abstract class)
class Pig extends Animal_Abstract_Class{
    public void animalSound() { // body of the abstract method is provided here
        System.out.println("Wee Wee!");
    }
}

// My main class
class MyMain5 {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
