package Fundamentals.ObjectsandClassesLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Random;

public class _1_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputWords = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .collect(Collectors.toList());

        List<String> result = new ArrayList<>();

        Random random = new Random();

        int inputWordsLength = inputWords.size();
        for (int index = 0; index < inputWordsLength; index++) {
            int currentIndex = random.nextInt(inputWords.size());

            String currentString = inputWords.get(currentIndex);
            result.add(currentString);
            inputWords.remove(currentIndex);
        }

        for (String word : result) {
            System.out.println(word);
        }
    }
}
