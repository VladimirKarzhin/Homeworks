package Fundamentals.AssociativeArraysLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _4_WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                .filter(word -> word.length() % 2 == 0).toArray(String[]::new);

        for (String word : words) {
            System.out.println(word);
        }
    }
}
