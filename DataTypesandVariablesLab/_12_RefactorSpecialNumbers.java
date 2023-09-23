package Fundamentals.DataTypesandVariablesLab;

import java.util.Scanner;

public class _12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int times= 0;
        boolean isSpecialNum = false;
        for (int i = 1; i <= number; i++) {
            times = i;
            while (i > 0) {
                sum += i % 10;
                i= i / 10;
            }
            isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecialNum) {
                System.out.printf("%d -> %s%n", times, "True");
            } else {
                System.out.printf("%d -> %s%n", times, "False");
            }
            sum = 0;
            i = times;
        }

    }
}
