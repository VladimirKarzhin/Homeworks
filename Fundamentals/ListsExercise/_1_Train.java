package Fundamentals.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxPeopleinOneWagon = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("Add")) {
                int numberToAdd = Integer.parseInt(command.split(" ")[1]);
                wagons.add(numberToAdd);
            } else {
                int passengerCount = Integer.parseInt(command);
                for (int wagon = 0; wagon <= wagons.size() - 1; wagon++) {
                    int passengerPerWagon = wagons.get(wagon);
                    if (passengerPerWagon + passengerCount <= maxPeopleinOneWagon) {
                        wagons.set(wagon, passengerPerWagon + passengerCount);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int number:wagons) {
            System.out.print(number + " ");
        }
    }
}
