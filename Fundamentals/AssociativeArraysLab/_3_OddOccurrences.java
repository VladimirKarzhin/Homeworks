package Fundamentals.AssociativeArraysLab;

import java.util.*;

public class _3_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                .map(word -> word.toLowerCase())
                .toArray(String[]:: new);

        LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<>();

        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }
        /*String[] result = wordMap
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .map(entry -> entry.getKey())
                .toArray(String[]::new);*/

        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() % 2!= 0) {
                result.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", result));
    }
}
