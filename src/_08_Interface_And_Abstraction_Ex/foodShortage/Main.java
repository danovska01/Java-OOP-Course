package _08_Interface_And_Abstraction_Ex.foodShortage;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            Person person = input.length == 4
                    ? new Citizen(input[0], Integer.parseInt(input[1]), input[2], input[3])
                    : new Rebel(input[0], Integer.parseInt(input[1]), input[2]);
            persons.add(person);

        }
        //you will receive names of people who bought food
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String nameOfPersonWhoBoughtFood = command;

            for (Person person : persons) {
                if (person.getName().equals(nameOfPersonWhoBoughtFood)) {
                    if (person instanceof Buyer) {
                        Buyer buyer = (Buyer) person;
                        buyer.buyFood();
                    }
                }
            }
//            persons.stream()
//                    .filter(person -> person.getName().equals(nameOfPersonWhoBoughtFood))
//                    .filter(person -> person instanceof Buyer)
//                    .map(person -> (Buyer) person)
//                    .forEach(Buyer::buyFood);



            command = scanner.nextLine();
        }
        int totalFood = 0;
        for (Person person : persons) {
            if (person instanceof Buyer) {
                Buyer buyer = (Buyer) person;
                totalFood += buyer.getFood();
            }
        }

        System.out.println(totalFood);
    }
}
