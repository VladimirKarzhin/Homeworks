package Fundamentals.MethodsExercise;

import java.util.Scanner;

public class _2_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();

        printCountVowels(text);
        // A, a, E, e , I, i, O, o, U, u
    }
    public static void printCountVowels (String text) {
        int count = 0;

        for (char letter : text.toCharArray()) {
            if (letter == 'a'|| letter == 'e'|| letter == 'i'|| letter == 'o'|| letter == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
