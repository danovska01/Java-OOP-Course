package DEMO_OOP;

public class Main {
    public static void main(String[] args) {



        Person x = new Person("X", 22, "Another address");
        System.out.println(x.address);


        Child y = new Child("Y", 2, "No address");
        y.changeAddress("New address");

        System.out.println(y.address);

        System.out.println(x.address);
        x.changeAddress("X changed");
        System.out.println(x.address);

        System.out.println(Child.planet);
        System.out.println(Child.legs);

        Child.legs= 4;

        System.out.println(Child.legs);


    }
}
