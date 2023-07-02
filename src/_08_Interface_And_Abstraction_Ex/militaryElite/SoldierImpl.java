package _08_Interface_And_Abstraction_Ex.militaryElite;

public class SoldierImpl implements Soldier{
    private int id;
    private String firstName;
    private String lastName;

    public SoldierImpl(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + " Id: " + id;
    }
}
