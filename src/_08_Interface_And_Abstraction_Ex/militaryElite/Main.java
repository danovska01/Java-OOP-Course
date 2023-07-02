package _08_Interface_And_Abstraction_Ex.militaryElite;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Soldier> soldiers = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String type = tokens[0];
            int id = Integer.parseInt(tokens[1]);
            String firstName = tokens[2];
            String lastName = tokens[3];
            switch (type) {
                case "Private":
                    double salary = Double.parseDouble(tokens[4]);
                    soldiers.add(new PrivateImpl(id, firstName, lastName, salary));
                    break;
                case "LieutenantGeneral":
                    double generalSalary = Double.parseDouble(tokens[4]);
                    LieutenantGeneralImpl lieutenantGeneral = new LieutenantGeneralImpl(id, firstName, lastName, generalSalary);
                    for (int i = 5; i < tokens.length; i++) {
                        int privateId = Integer.parseInt(tokens[i]);
                        Private priv = (Private) soldiers.stream()
                                .filter(s -> s instanceof Private && s.getId() == privateId)
                                .findFirst()
                                .orElse(null);
                        if (priv != null) {
                            lieutenantGeneral.addPrivate(priv);
                        }
                    }
                    soldiers.add(lieutenantGeneral);
                    break;
                case "Engineer":
                    double engineerSalary = Double.parseDouble(tokens[4]);
                    Corps engineerCorps;
                    try {
                        engineerCorps = Corps.valueOf(tokens[5].toUpperCase());
                    } catch (IllegalArgumentException e) {
                        input = scanner.nextLine();
                        continue;
                    }
                    EngineerImpl engineer = new EngineerImpl(id, firstName, lastName, engineerCorps);
                    for (int i = 6; i < tokens.length - 1; i += 2) {
                        String partName = tokens[i];
                        int hoursWorked = Integer.parseInt(tokens[i + 1]);
                        Repair repair = new Repair(partName, hoursWorked);
                        engineer.addRepair(repair);
                    }
                    soldiers.add(engineer);
                    break;
                case "Commando":
                    double commandoSalary = Double.parseDouble(tokens[4]);
                    Corps commandoCorps;
                    try {
                        commandoCorps = Corps.valueOf(tokens[5].toUpperCase());
                    } catch (IllegalArgumentException e) {
                        input = scanner.nextLine();
                        continue;
                    }
                    CommandoImpl commando = new CommandoImpl(id, firstName, lastName, commandoCorps);
                    for (int i = 6; i < tokens.length - 1; i += 2) {
                        String codeName = tokens[i];
                        State state;
                        try {
                            state = State.valueOf(tokens[i + 1].toUpperCase());
                        } catch (IllegalArgumentException e) {
                            continue;
                        }
                        Mission mission = new Mission(codeName, state);
                        commando.addMission(mission);
                    }
                    soldiers.add(commando);
                    break;
                case "Spy":
                    int codeNumber = Integer.parseInt(tokens[4]);
                    soldiers.add(new SpyImpl(id, firstName, lastName, codeNumber));
                    break;
            }

            input = scanner.nextLine();
        }

        for (Soldier soldier : soldiers) {
            System.out.println(soldier.toString());
        }
    }
}
