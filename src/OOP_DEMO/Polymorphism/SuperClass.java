package OOP_DEMO.Polymorphism;

//Dynamic DEMO_OOP.Polymorphism :
//Any entity which shows polymorphism at run time is called as dynamic polymorphism.
// It is also called as late binding or dynamic binding as object used is determined at run time. Method overriding shows dynamic polymorphism.

public class SuperClass {
    void superClassMethod()
    {
        System.out.println("Super_Class_Method");
    }
}

class SubClass extends SuperClass
{
    @Override
    void superClassMethod()
    {
        System.out.println("Super_Class_Method_Is_Overridden");
    }
}

class JavaOOPConcepts
{
    public static void main(String[] args)
    {
        SuperClass superClass = new SuperClass();

        superClass.superClassMethod();        //Output : Super_Class_Method

        superClass = new SubClass();

        superClass.superClassMethod();        //Output : Super_Class_Method_Is_Overridden

    }
}
