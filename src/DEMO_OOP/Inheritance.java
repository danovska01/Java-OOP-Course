package DEMO_OOP;

    // parent class
    class Employee {
        float salary = 100; // property of the parent class
    }

    // child class
    class Programmer extends Employee {
        float bonus = 30;
    }

    // My main class
    class MyMainClass {
        public static void main(String[] args) {
            Programmer myVariable = new Programmer();
            System.out.println("My salary is " + myVariable.salary );
            System.out.println("My bonus is " + myVariable.bonus );
        }
    }


