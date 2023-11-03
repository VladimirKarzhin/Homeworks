package Fundamentals.AssociativeArraysExercise;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _1_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (!symbolsCount.containsKey(symbol)) {
                symbolsCount.put(symbol, 1);
            } else {
                int currentCount = symbolsCount.get(symbol);
                symbolsCount.put(symbol, currentCount + 1);
            }
        }
        for (Map.Entry<Character, Integer> kvp : symbolsCount.entrySet()) {
            System.out.printf("%c -> %d%n", kvp.getKey(), kvp.getValue());
        }
        //symbolsCount.entrySet().forEach(kvp -> System.out.println(kvp.getKey() + " -> " + kvp.getValue()));
    }
}
