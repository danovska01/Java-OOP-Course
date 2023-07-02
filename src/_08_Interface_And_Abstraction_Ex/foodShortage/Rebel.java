package _08_Interface_And_Abstraction_Ex.foodShortage;

public class Rebel implements Buyer, Person {
    private final String name;
    private final int age;

    private final String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.food = 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public String getGroup() {
        return this.group;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public void buyFood() {
        food += 5;

    }


}