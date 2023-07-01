package _02_Abstraction_Ex.trafficLights;

import java.util.Scanner;

enum TrafficLight {
    RED, GREEN, YELLOW;

    public TrafficLight getNext() {
        return values()[(ordinal() + 1) % values().length];
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] signals = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        TrafficLight[] lights = new TrafficLight[signals.length];
        for (int i = 0; i < signals.length; i++) {
            lights[i] = TrafficLight.valueOf(signals[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < lights.length; j++) {
                lights[j] = lights[j].getNext();
                System.out.print(lights[j] + " ");
            }
            System.out.println();
        }
    }
}
