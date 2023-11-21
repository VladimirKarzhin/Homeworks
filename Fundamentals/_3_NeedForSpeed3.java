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

        for (int count = 1; count <= countOfCars; count++) {
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
                    String carModel = commandParts[1];
                    int carDistance = Integer.parseInt(commandParts[2]);
                    int carFuel = Integer.parseInt(commandParts[3]);
                    if (carsMileage.get(carModel) >= carFuel) {
                        carsMileage.put(carModel, carsMileage.get(carModel) + carDistance);
                        carsFuel.put(carModel, carsFuel.get(carModel) - carFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carModel, carDistance, carFuel);
                        if (carsMileage.get(carModel) >= 100_000) {
                            System.out.printf("Time to sell the %s!%n", carModel);
                            carsFuel.remove(carModel);
                            carsMileage.remove(carModel);
                        }
                    }
                    else {
                        System.out.println("Not enough fuel to make that ride");
                    }

                    break;
                case "Refuel":

                    break;
                case "Revert":

                    break;

            }
            commands = scanner.nextLine();
        }
    }
}
