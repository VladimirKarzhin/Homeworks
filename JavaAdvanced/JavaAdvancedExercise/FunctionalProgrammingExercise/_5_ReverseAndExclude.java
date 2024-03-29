package JavaAdvanced.JavaAdvancedExercise.FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _5_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<List<Integer>> print = list -> list.forEach(e -> System.out.print(e + " "));

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);

        Predicate<Integer> checkDivision = number -> number % n == 0;

        numbers.removeIf(checkDivision);

        numbers.forEach(number -> System.out.print(number + " "));

    }
}
