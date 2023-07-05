package OOP_DEMO.Inheritance;

//SubClass is extending SuperClass. Hence, SubClass will have properties inherited from SuperClass along with its own properties.
// You can say that either we are reusing properties of SuperClass in SubClass or we are adding additional features to SuperClass by extending it through SubClass.

public class SuperClass {
    String superClassField = "Super_Class_Field";

    void superClassMethod()
    {
        System.out.println("Super_Class_Method");
    }
}

class SubClass extends SuperClass
{
    String subClassField = "Sub_Class_Field";

    void subClassMethod()
    {
        System.out.println("Sub_Class_Method");
    }
}

class JavaOOPConcepts
{
    public static void main(String[] args)
    {
        SubClass subClass = new SubClass();

        subClass.subClassMethod();
        System.out.println(subClass.subClassField);

        //SuperClass properties are inherited to SubClass

        subClass.superClassMethod();
        System.out.println(subClass.superClassField);

    }
}
