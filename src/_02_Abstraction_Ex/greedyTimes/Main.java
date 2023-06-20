
package _02_Abstraction_Ex.greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static long gold = 0;
    static long gems = 0;
    static long cash = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());
        String[] input = scanner.nextLine().split("\\s+");

        Map<String, LinkedHashMap<String, Long>> bag = new LinkedHashMap();


        for (int i = 0; i < input.length; i += 2) {
            String name = input[i];
            long quantity = Long.parseLong(input[i + 1]);

            String type = "";
            type = getType(name, type);

            if (type.equals("")) {
                continue;
            } else if (capacity < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + quantity) {
                continue;
            }

            switch (type) {
                case "Gem":
                    if (bagContainsType(bag, type, "Gold", quantity)) continue;
                    break;
                case "Cash":
                    if (bagContainsType(bag, type, "Gem", quantity)) continue;
                    break;
            }

            doAdditionalCheck(bag, name, type);
            fillBag(bag, name, quantity, type);
        }

        print(bag);
    }

    private static String getType(String name, String type) {
        if (name.length() == 3) {
            type = "Cash";
        } else if (name.toLowerCase().endsWith("gem")) {
            type = "Gem";
        } else if (name.toLowerCase().equals("gold")) {
            type = "Gold";
        }
        return type;
    }

    private static void fillBag(Map<String, LinkedHashMap<String, Long>> bag, String name, long quantity, String type) {
        bag.get(type).put(name, bag.get(type).get(name) + quantity);
        if (type.equals("Gold")) {
            gold += quantity;
        } else if (type.equals("Gem")) {
            gems += quantity;
        } else if (type.equals("Cash")) {
            cash += quantity;
        }
    }

    private static void doAdditionalCheck(Map<String, LinkedHashMap<String, Long>> bag, String name, String type) {
        if (!bag.containsKey(type)) {
            bag.put(type, new LinkedHashMap<String, Long>());
        }

        if (!bag.get(type).containsKey(name)) {
            bag.get(type).put(name, 0L);
        }
    }

    private static void print(Map<String, LinkedHashMap<String, Long>> bag) {
        for (var x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }

    private static boolean bagContainsType(Map<String, LinkedHashMap<String, Long>> bag, String type, String Gold, long quantity) {
        if (!bag.containsKey(type)) {
            if (bag.containsKey(Gold)) {
                if (quantity > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                    return true;
                }
            } else {
                return true;
            }
        } else if (bag.get(type).values().stream().mapToLong(e -> e).sum() + quantity > bag.get(Gold).values().stream().mapToLong(e -> e).sum()) {
            return true;
        }
        return false;
    }
}