package MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class _2_Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffeeList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        int countOfTheCommands = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= countOfTheCommands; i++) {
            String line = scanner.nextLine();
            String[] commandParts = line.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Include":

                    String coffeeToAdd = commandParts[1];
                    coffeeList.add(coffeeToAdd);
                    break;
                case "Remove":
                    String first = commandParts[1];
                    int numberOfCoffeesToRemove = Integer.parseInt(commandParts[2]);
                    if (line.contains("first")) {
                        for (int index = 1; index <= numberOfCoffeesToRemove; index++) {
                            coffeeList.remove(0);
                        }
                    }
                    String last = commandParts[1];
                    if (line.contains("last")) {
                        for (int index2 = 1; index2 <= numberOfCoffeesToRemove; index2++) {
                            coffeeList.remove(coffeeList.size() - 1);
                        }
                    }
                    break;
                case "Prefer":
                    int firstCoffeeIndex = Integer.parseInt(commandParts[1]);
                    int secondCoffeeIndex = Integer.parseInt(commandParts[2]);

                    if (firstCoffeeIndex >= 0 && firstCoffeeIndex <= coffeeList.size() - 1 && secondCoffeeIndex >= 0 & secondCoffeeIndex <= coffeeList.size() - 1) {
                        String firstCoffee = coffeeList.get(firstCoffeeIndex);
                        String secondCoffee = coffeeList.get(secondCoffeeIndex);
                        coffeeList.remove(firstCoffeeIndex);
                        coffeeList.add(firstCoffeeIndex, secondCoffee);
                        coffeeList.remove(secondCoffeeIndex);
                        coffeeList.add(secondCoffeeIndex, firstCoffee);

                    }
                    break;
                case "Reverse":
                    Collections.reverse(coffeeList);
                    break;

            }
        }
        System.out.println("Coffees: ");
        for (String currentCoffee : coffeeList) {
            System.out.print(currentCoffee + " ");

        }


    }
}
