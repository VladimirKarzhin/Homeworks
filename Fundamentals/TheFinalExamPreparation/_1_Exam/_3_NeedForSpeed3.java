package TheFinalExamPreparation._1_Exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _3_NeedForSpeed3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> carsMileage = new LinkedHashMap<>();
        Map<String, Integer> carsFuel = new LinkedHashMap<>();

        int countOfCars = Integer.parseInt(scanner.nextLine());

        for (int count = 0; count < countOfCars; count++) {
            String line = scanner.nextLine();
            String[] commandParts = line.split("\\|");
            String currentCarModel = commandParts[0];
            int currentCarMileage = Integer.parseInt(commandParts[1]);
            int currentCarFuel = Integer.parseInt(commandParts[2]);

            carsMileage.put(currentCarModel, currentCarMileage);
            carsFuel.put(currentCarModel, currentCarFuel);
        }

        String commands = scanner.nextLine();
        while (!commands.equals("Stop")) {
            String[] commandParts = commands.split(" : ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Drive":
                    String carModelDrive = commandParts[1];
                    int carDistance = Integer.parseInt(commandParts[2]);
                    int carFuel = Integer.parseInt(commandParts[3]);
                    if (carsFuel.get(carModelDrive) >= carFuel) {
                        carsMileage.put(carModelDrive, carsMileage.get(carModelDrive) + carDistance);
                        carsFuel.put(carModelDrive, carsFuel.get(carModelDrive) - carFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carModelDrive, carDistance, carFuel);
                        if (carsMileage.get(carModelDrive) >= 100_000) {
                            System.out.printf("Time to sell the %s!%n", carModelDrive);
                            carsFuel.remove(carModelDrive);
                            carsMileage.remove(carModelDrive);
                        }
                    }
                    else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;
                case "Refuel":
                    String carModelRefuel = commandParts[1];
                    int fuelForRefuel = Integer.parseInt(commandParts[2]);
                    boolean cantTakeMore = true;
                    for (int i = 0; i <= fuelForRefuel; i++) {
                        if (carsFuel.get(carModelRefuel) + fuelForRefuel >= 75) {
                            System.out.printf("%s refueled with %d liters%n", carModelRefuel, i + 1);
                            cantTakeMore = false;
                            break;
                        }
                        carsFuel.put(carModelRefuel, carsFuel.get(carModelRefuel) + 1);
                    }
                    if (cantTakeMore) {
                        System.out.printf("%s refueled with %d liters%n", carModelRefuel, fuelForRefuel);
                    }
                    break;
                case "Revert":
                    String carModelRevert = commandParts[1];
                    int kilometersToDecrease = Integer.parseInt(commandParts[2]);
                    if (carsMileage.get(carModelRevert) - kilometersToDecrease >= 10_000) {
                        int currentMileage = carsMileage.get(carModelRevert);
                        int result = currentMileage - kilometersToDecrease;
                        carsMileage.put(carModelRevert, result);
                        System.out.printf("%s mileage decreased by %d kilometers%n", carModelRevert, kilometersToDecrease);
                    } else {
                        carsFuel.remove(carModelRevert);
                        carsMileage.remove(carModelRevert);
                    }
                    break;

            }
            commands = scanner.nextLine();
        }
        //"{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt."
        for (Map.Entry<String, Integer> kvp : carsFuel.entrySet()) {
                    String productName = kvp.getKey();
                    int mileage = carsMileage.get(productName);
                    int fuel = kvp.getValue();
                    System.out.printf("%s -> Mileage: %s kms, Fuel in the tank: %s lt.%n", productName, mileage, fuel);
                }

    }
}
