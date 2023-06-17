package _03_Encapsulation.SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;

    private int age;
    private double salary;


    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this(firstName, lastName, age);
        setSalary(salary);
    }

    public void increaseSalary(double bonus) {
        if(this.getAge() < 30){
            this.setSalary(this.getSalary() + (this.getSalary() * bonus / 200));
        }else{
            this.setSalary(this.getSalary() + (this.getSalary() * bonus / 100));
        }
    }

    private void setSalary(double salary) {
        if (salary>0){
            this.salary = salary;
        }

    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.2f leva.", firstName, lastName, salary);
    }
}
