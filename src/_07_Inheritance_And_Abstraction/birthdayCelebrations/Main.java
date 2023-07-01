package _07_Inheritance_And_Abstraction.birthdayCelebrations;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        List<Birthable> birthables = new ArrayList<>();
        List<Identifiable> identifiables = new ArrayList<>();
        while(!line.equals("End")){
            String [] tokens = line.split("\\s+");


            if(tokens[0].equals("Pet")){
                Birthable birthable= new Pet(tokens[1], tokens[2]);
                birthables.add(birthable);
            }
            if(tokens[0].equals("Citizen")){
               Birthable birthable = new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]);
                birthables.add(birthable);
            }
            if(tokens[0].equals("Robot")){
                Identifiable identifiable = new Robot(tokens[1], tokens[2]);
                identifiables.add(identifiable);
            }

            line= sc.nextLine();

        }

        String lastFakeDigits = sc.nextLine();


        System.out.println(identifiables.stream()
                .map(Identifiable::getId)
                .filter(i -> i.endsWith(lastFakeDigits))
                .collect(Collectors.joining(System.lineSeparator())));

        System.out.println(birthables.stream()
                .map(Birthable::getBirthDate)
                .filter(i -> i.endsWith(lastFakeDigits))
                .collect(Collectors.joining(System.lineSeparator())));
    }

}
