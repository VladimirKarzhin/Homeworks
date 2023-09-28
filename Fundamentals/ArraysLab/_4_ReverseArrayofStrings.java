package Fundamentals.ArraysLab;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class _4_ReverseArrayofStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");

        int j = elements.length - 1;
        for (int i = 0; i < elements.length / 2; i++) {
            String leftElement =  elements[i];
            String rightElement =  elements[j];

            elements[i] = rightElement;
            elements[j] = leftElement;
            j -= 1;
        }
        System.out.println(String.join(" ", elements));
    }
}
