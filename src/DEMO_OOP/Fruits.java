package DEMO_OOP;
//What is Run-time polymorphism?
//When method overriding and upcasting is used, which class's method to call is resolved during the run-time.

// parent class
class Fruits {
    protected void getNumber(){
        System.out.println("I return a number");
    }
}
class Apple extends Fruits {
} // child class


//If we cast an object of the Apple class to Fruits type, it is Upcasting.
// If we cast an object of the Fruits class to Apple type, it is Downcasting
class MyMain1 {
    public static void main(String[] args) {
        Fruits upcastedVariable = new Apple(); // upcasting (implicit casting)
        Apple downcastedVariable = (Apple) upcastedVariable; // downcasting (explicit casting)
    }
}
//What is upcasting?
//When the reference variable of the parent class is referring to an object of the child class, it is upcasting.
// In other words, casting an object of an individual type to one common type.
//What is downcasting?
//When the reference variable of the child class is referring to an object of the parent class,it is downcasting.
// In other words, casting an object of a common type to a narrower (special) type.
//Upcasting can be done directly in Java. But Downcasting cannot. We have to do the casting explicitly.
//But we have to be careful not to downcast incompatible types. Unless it will throw an error.

class MyMain2{
    public static void main(String[] args) {
        Fruits myVariable = new Fruits();
        Apple downcastedVariable = (Apple) myVariable;// throws an error
        //Here upcastedVariable can be downcasted into Apple because, even though upcastedVariable is Fruit type, it refers to an object of the Apple class.
    }
}
class MyMain3 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.getNumber();//What is method overriding?
    }
    //What is method overriding?
    //Providing a specific implementation in the child class (subclass) of a method that already provided by one of its parent classes (super-classes).
    // And also, the method in the subclass should have the same signature and the same return type for it to override the superclass method.
}
