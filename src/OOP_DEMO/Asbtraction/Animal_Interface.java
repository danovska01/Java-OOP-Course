package OOP_DEMO.Asbtraction;
//Why use Interfaces?
//    To specify the behavior of a particular data
//    To achieve multiple inheritance.
//    Java doesn't support multiple inheritances. ( You can only inherit from a single superclass.) However, it can be achieved using interfaces.


//interface
interface Animal_Interface {
    public void animalSound(); // interface method
    public void sleep(); // interface method
}
// subclass (implemets the abstract class)
class Cat implements Animal_Interface {
    public void animalSound() { // body of the interface method is provided here
        System.out.println("Meow!");
    }
    public void sleep() { // body of the interface method is provided here
        System.out.println("Purrrrr!");
    }

}

// My main class
class MyMain6 {
    public static void main(String[] args) {
        Cat myCat = new Cat(); // create a Cat object
        myCat.animalSound();
        myCat.sleep();
    }
}
