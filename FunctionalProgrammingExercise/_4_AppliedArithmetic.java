package JavaAdvanced.JavaAdvancedExercise.FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class _4_AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"add" -> adds 1;
        Function<int[], int[]> add = array -> Arrays.stream(array).map(number -> number += 1).toArray();
        //"multiply" -> multiplies by 2;
        Function<int[], int[]> multiply = array -> Arrays.stream(array).map(number -> number *= 2).toArray();
        //"subtract" -> subtracts 1;
        Function<int[], int[]> subtract = array -> Arrays.stream(array).map(number -> number -= 1).toArray();
        //"print" -> prints
        Consumer<int[]> print = array -> Arrays.stream(array).forEach(e -> System.out.print(e + " "));

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            switch (command) {
                case "add":
                    numbers = add.apply(numbers);
                    break;
                case "multiply":
                    multiply.apply(numbers);
                    break;
                case "print":
                    print.accept(numbers);
                    System.out.println();
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
