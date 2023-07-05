package OOP_DEMO.Asbtraction;

//You can also use interfaces in Java to implement abstraction.
//n the above code snippet, Interface has anIdea() which is implemented by ClassOne and ClassTwo according to their requirements.
//Till Java 8, interfaces are allowed to have only abstract methods.
// From Java 8, they can also have concrete methods in the form of default and static methods thus reducing the gap between abstract classes and interfaces.


interface Interface {
    void anIdea();
}

class ClassOne implements Interface
{
    @Override
    public void anIdea()
    {
        System.out.println("An idea is implemented according to ClassOne requirement");
    }
}

class ClassTwo implements Interface
{
    @Override
    public void anIdea()
    {
        System.out.println("An idea is implemented according to ClassTwo requirement");
    }
}
