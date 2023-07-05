package _10_Polymorphism_Ex.vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String carInfo = scanner.nextLine();
        String truckInfo = scanner.nextLine();
        int commandsCount = Integer.parseInt(scanner.nextLine());

        String[] carTokens = carInfo.split("\\s+");
        double carFuelQuantity = Double.parseDouble(carTokens[1]);
        double carFuelConsumption = Double.parseDouble(carTokens[2]);
        Car car = new Car(carFuelQuantity, carFuelConsumption);

        String[] truckTokens = truckInfo.split("\\s+");
        double truckFuelQuantity = Double.parseDouble(truckTokens[1]);
        double truckFuelConsumption = Double.parseDouble(truckTokens[2]);
        Truck truck = new Truck(truckFuelQuantity, truckFuelConsumption);

        //DecimalFormat decimalFormat = new DecimalFormat("#.##");

        for (int i = 0; i < commandsCount; i++) {
            String command = scanner.nextLine();
            String[] commandTokens = command.split("\\s+");
            String vehicleType = commandTokens[1];
            String action = commandTokens[0];
            double parameter = Double.parseDouble(commandTokens[2]);

            if (vehicleType.equals("Car")) {
                if (action.equals("Drive")) {
                    System.out.println(car.drive(parameter));
                } else if (action.equals("Refuel")) {
                    car.refuel(parameter);
                }
            } else if (vehicleType.equals("Truck")) {
                if (action.equals("Drive")) {
                    System.out.println(truck.drive(parameter));
                } else if (action.equals("Refuel")) {
                    truck.refuel(parameter);
                }
            }
        }

        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n", truck.getFuelQuantity());

//        System.out.println("Car: " + decimalFormat.format(car.getFuelQuantity()));
//        System.out.println("Truck: " + decimalFormat.format(truck.getFuelQuantity()));
    }


    }

