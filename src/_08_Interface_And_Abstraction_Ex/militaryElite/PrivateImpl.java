package _08_Interface_And_Abstraction_Ex.militaryElite;

public class PrivateImpl extends SoldierImpl implements Private{
    private double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + " Salary: " + String.format("%.2f", salary);
    }
}
