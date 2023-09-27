package Fundamentals.DataTypeandVariablesExercise;

import java.util.Scanner;

public class _2_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        // 1 posledna cifra
        // 2 sumirame
        // 3 premahvame
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        System.out.println(sum);
    }
}
