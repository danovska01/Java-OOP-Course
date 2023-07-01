package _03_Encapsulation.sortByNameAndAge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            people.add(new Person(firstName, lastName, age));
        }

        Collections.sort(people, (firstPerson, secondPerson) -> {
            int compared = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());

            if (compared != 0) {
                return compared;
            } else {
                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
            }
        });

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}