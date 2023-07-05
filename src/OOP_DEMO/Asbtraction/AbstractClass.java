package OOP_DEMO.Asbtraction;
//n computer science terms, abstraction means separating ideas from their actual implementations. Using abstraction,
// you define only ideas in one class so that those ideas can be implemented by its subclasses according to their requirements.
//In Java, abstraction is implemented by abstract classes and interfaces.
//In the above code, AbstractClass has only idea and that idea is implemented by SubClassOne and SubClassTwo according to their requirements.

public abstract class AbstractClass {
    abstract void anIdea();
}

class SubClassOne extends AbstractClass
{
    @Override
    void anIdea()
    {
        System.out.println("An idea is implemented according to SubClassOne requirement");
    }
}

class SubClassTwo extends AbstractClass
{
    @Override
    void anIdea()
    {
        System.out.println("An idea is implemented according to SubClassTwo requirement");
    }
}
