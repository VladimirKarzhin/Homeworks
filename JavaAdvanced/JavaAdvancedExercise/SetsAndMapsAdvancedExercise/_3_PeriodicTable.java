package JavaAdvanced.JavaAdvancedExercise.SetsAndMapsAdvancedExercise;

import java.util.*;

public class _3_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Set<String> chemicalSet = new TreeSet<>();

        for (int i = 0; i < count; i++) {
            String[] arr = scanner.nextLine().split(" ");
            chemicalSet.addAll(Arrays.asList(arr));
        }
        for (String element : chemicalSet) {
            System.out.print(element + " ");
        }
    }
}
