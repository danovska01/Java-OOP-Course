package OOP_DEMO.Polymorphism;

//In Java, there are two types of polymorphism – static polymorphism and dynamic polymorphism.
//Static DEMO_OOP.Polymorphism :
//Any entity which shows polymorphism during compilation is called static polymorphism. In this type of polymorphism,
// object used is determined during compilation itself. Hence, it is also called as static binding or early binding.
//Operator overloading, method overloading and constructor overloading are best examples of static polymorphism.

public class AnyClass {
    int i;
    String s;

    //Constructor Overloading

    public AnyClass()
    {
        this.i = 1;
        this.s = "";
    }

    public AnyClass(int i, String s)
    {
        this.i = i;
        this.s = s;
    }

    //Method Overloading

    void anyMethod(int i)
    {
        System.out.println(i+this.i);   //Here, '+' is used to add two numbers
    }

    void anyMethod(String s)
    {
        System.out.println(s+this.s);   //Here, '+' is used to concatenate two strings
    }
}
