package AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }


    private void setName(String name) {
        //Validate the chicken’s name (it cannot be null, empty, or whitespace). In case of an invalid name, print the exception message "Name cannot be empty."
        if(name.trim().length()<1 || name.isEmpty() || name.equals(" ")){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if(age>15 || age<0){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    //The calculateProductPerDay() method is used by the productPerDay() public method.
    // This means the method can safely be hidden inside the Chicken class by declaring it private.
    public double productPerDay (){
      double product = calculateProductPerDay();
        return product;
    }

    private double calculateProductPerDay() {
        double calculateProductPerDay=0;
        //     • First 6 years it produces 2 eggs per day [0 - 5].
        //    • Next 6 years it produces 1 egg per day [6 - 11].
        //    • And after that, it produces 0.75 eggs per day.
        if(age<6){
            calculateProductPerDay=2;
        }
        else if(age<=11){
            calculateProductPerDay=1;
        }
        else {
            calculateProductPerDay=0.75;
        }

        return calculateProductPerDay;

    }

    @Override
    public String toString (){
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.%n", name, age, productPerDay());
    }








}
