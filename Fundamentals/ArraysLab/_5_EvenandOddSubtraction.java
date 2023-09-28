package Fundamentals.ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class _5_EvenandOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int evensum = 0;
        int oddSum = 0;

        for (int number: numbers) {
            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddSum += number;
            }
        }
        int difference = evensum - oddSum;
        System.out.println(difference);
    }
}
