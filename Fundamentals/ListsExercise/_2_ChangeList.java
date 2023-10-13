package Fundamentals.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command =  scanner.nextLine();

        while (!command.equals("end")) {
            if(command.contains("Delete")) {

                int numberToRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Arrays.asList(numberToRemove));

            } else if (command.contains("Insert")) {

                int numberToInsert = Integer.parseInt(command.split(" ")[1]);
                int numberIndex = Integer.parseInt(command.split(" ")[2]);
                numbers.add(numberIndex, numberToInsert);

            }
            command = scanner.nextLine();
        }
        for (int number: numbers) {
            System.out.print(number + " ");
        }

    }
}
