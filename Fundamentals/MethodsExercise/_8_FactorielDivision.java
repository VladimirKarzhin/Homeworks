package Fundamentals.MethodsExercise;

import java.util.Scanner;

public class _8_FactorielDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long factFirstNumber = calculateFactoriel(firstNumber);
        long factSecondNumber = calculateFactoriel(secondNumber);
        double result = factFirstNumber * 1.0/ factSecondNumber;
        System.out.printf("%.2f", result);

    }
    public static long calculateFactoriel (int number) {
        long fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
