package Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class _7_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder lineWithString = new StringBuilder(scanner.nextLine());

        int strength = 0;

        for (int i = 0; i < lineWithString.length(); i++) {
            if (strength > 0 && lineWithString.charAt(i) != '>') {
                lineWithString.deleteCharAt(i);
                strength--;
                i--;
            }
            else if (lineWithString.charAt(i) == '>') {
                strength += Integer.parseInt(String.valueOf(lineWithString.charAt(i + 1)));
            }
        }

        System.out.println(lineWithString);
    }
}
