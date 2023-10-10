package Fundamentals.BitwiseOperations;

import java.util.Scanner;

public class _1_BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int digit = Integer.parseInt(scanner.nextLine());
        int count = 0;

        while (number > 0) {
            int remainder = number % 2;
            number /= 2;

            if (remainder == digit) {
                count++;
            }
        }
        System.out.println(count);
    }
}
