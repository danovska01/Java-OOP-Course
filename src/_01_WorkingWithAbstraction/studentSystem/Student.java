package _01_WorkingWithAbstraction.studentSystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }


    public String toString (String name) {

        StringBuilder sb = new StringBuilder(String.format("%s is %s years old.", name, age));

        if (grade >= 5.00) {
            sb.append(" Excellent student.");
        } else if (grade < 5.00 && grade >= 3.50) {
            sb.append(" Average student.");
        } else {
            sb.append(" Very nice person.");
        }

        return sb.toString();
    }
}
