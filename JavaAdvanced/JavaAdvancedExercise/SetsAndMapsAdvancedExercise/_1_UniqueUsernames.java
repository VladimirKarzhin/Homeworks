package JavaAdvanced.JavaAdvancedExercise.SetsAndMapsAdvancedExercise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _1_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Set<String> wordsSet = new LinkedHashSet<>();

        for (int i = 0; i < count; i++) {
            wordsSet.add(scanner.nextLine());
        }
        wordsSet.forEach(System.out::println);
    }
}
