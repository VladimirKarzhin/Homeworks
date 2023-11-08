package Fundamentals.TextProcessingLab;

import java.util.Scanner;

public class _1_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.nextLine();
            if (word.equals("end")) {
                break;
            }

            String reversedString = reverseWord(word);

            System.out.printf("%s = %s%n", word, reversedString);
        }
    }

    private static String reverseWord(String word) {
        char[] reversedResult = new char[word.length()];

        int reversedResultIndex = 0;

        for (int i = word.length() - 1; i >= 0; i--) {
            char currentChar = word.charAt(i);
            reversedResult[reversedResultIndex] = currentChar;
            reversedResultIndex += 1;
        }
        return new String(reversedResult);
    }
}
