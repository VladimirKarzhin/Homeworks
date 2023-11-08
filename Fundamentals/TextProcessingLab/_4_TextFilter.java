package Fundamentals.TextProcessingLab;

import java.util.Arrays;
import java.util.Scanner;

public class _4_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : bannedWords) {
            String replacement = getReplacement(word);
            text = text.replace(word, replacement);

        }
        System.out.println(text);
    }

    private static String getReplacement(String word) {
        char[] replacementCharArr = new char[word.length()];

        Arrays.fill(replacementCharArr, '*');

        return new String(replacementCharArr);
    }
}
