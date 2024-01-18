package JavaAdvanced.JavaAdvancedExercise.SetsAndMapsAdvancedExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _4_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] arr = scanner.nextLine().toCharArray();

        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            char element = arr[i];
            if (!map.containsKey(element)) {
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1);
            }
        }

        for (Map.Entry<Character, Integer> kvp : map.entrySet()) {
            System.out.printf("%c: %d time/s%n", kvp.getKey(), kvp.getValue());
        }
    }
}
