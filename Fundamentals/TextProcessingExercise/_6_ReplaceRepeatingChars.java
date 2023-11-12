package Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class _6_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder letters = new StringBuilder(scanner.nextLine());

        for (int position = 0; position < letters.length() - 1; position++) {
            char currentChar = letters.charAt(position);
            char nextChar = letters.charAt(position + 1);
            if (currentChar == nextChar) {
                letters.deleteCharAt(position);
                position--;
            }
        }
        System.out.println(letters);

    }
}
