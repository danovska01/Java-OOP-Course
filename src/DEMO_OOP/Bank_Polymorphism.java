package DEMO_OOP;

public class Bank_Polymorphism {
    //Since in AwesomeBank class the getInterestRate() method is not overridden,
    // the method in the parent class will be called in the run-time.
    public float getInterestRate() {
        return 0;
    }
}

// child class - 1
class AwesomeBank extends Bank_Polymorphism {
    public float getInterestRate() { // superclass's method is overridden
        return (float) 8.4;
    }
}

// child class - 2
class SuperBank extends Bank_Polymorphism{
    public float getInterestRate() { // superclass's method is overridden
        return (float) 9.6;
    }
}

// child class - 3
class GovernmentBank extends Bank_Polymorphism {} // superclass's method is not overridden

// My main class
class MyMain4 {
    public static void main(String[] args) {
         Bank_Polymorphism b= new Bank_Polymorphism();
        System.out.println(b.getInterestRate());
        b = new AwesomeBank(); // upcasting
        System.out.println(b.getInterestRate());
        b = new SuperBank(); // upcasting
        System.out.println(b.getInterestRate());
        b = new GovernmentBank(); // upcasting
        System.out.println(b.getInterestRate());
    }
}
