package JavaAdvanced.JavaAdvancedExercise.FunctionalProgrammingExercise;

import java.util.Scanner;
import java.util.function.Consumer;

public class _2_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] names = input.split("\\s+");

        Consumer<String[]> printString = array -> {
            for (String name : names) {
                System.out.println("Sir " + name);
            }
        };
        printString.accept(names);

        
    }
}
