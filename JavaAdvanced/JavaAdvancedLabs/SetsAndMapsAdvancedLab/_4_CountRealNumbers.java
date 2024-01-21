package JavaAdvanced.JavaAdvancedLabs.SetsAndMapsAdvancedLab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _4_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> countOfNumbers = new LinkedHashMap<>();

        for (double value : arr) {
            if (!countOfNumbers.containsKey(value)) {
                countOfNumbers.put(value, 1);
            } else {
                countOfNumbers.put(value, countOfNumbers.get(value) + 1);
             }
        }
        for (Map.Entry<Double, Integer> kvp : countOfNumbers.entrySet()) {
            Double key = kvp.getKey();
            Integer value = kvp.getValue();
            System.out.printf("%.1f -> %d%n", key, value);
        }
    }
}