package JavaAdvanced.JavaAdvancedLabs.FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _2_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int count = numbers.size();



        System.out.println("Count = " + count);

    }
}
