package _06_Inheritance_Ex.Animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    @Override
    public String toString() { //To find the name of the class you can use this.getClass().getSimpleName() in toString() method inside Animal class.

        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(System.lineSeparator());
        sb.append(this.name).append(" ").append(this.age).append(" ").append(this.gender).append(System.lineSeparator());
        sb.append(this.produceSound());
        return sb.toString();
    }

    public String produceSound() {
        return null;
    }

    ;
}
