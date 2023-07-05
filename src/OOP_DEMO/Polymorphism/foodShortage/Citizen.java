package OOP_DEMO.Polymorphism.foodShortage;

public class Citizen implements Person, Identifiable, Buyer {

    private final String name;
    private final int age;

    private final String id;

    private final String birthDate;

    private int food;

    Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
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


    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }


    @Override
    public void buyFood() {
        food += 10;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

}
