package JavaAdvanced.JavaAdvancedLabs.SetsAndMapsAdvancedLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _9_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sorted = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());

        if (sorted.size() >= 3) {
            for (int i = 0; i < 3; i++) {
                int number = sorted.get(i);
                System.out.print(number + " ");
            }
        } else {
            for (int number : sorted) {
                System.out.print(number + " ");
            }
        }
    }
}
