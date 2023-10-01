package Fundamentals.ArraysExercise;

import java.util.Scanner;

public class _3_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int [] firstArray = new int[rows];
        int [] secondArray = new int[rows];
        int sum = 0;

        for (int row = 1; row <= rows; row++) {
            String input = scanner.nextLine();
            String[] numbers = input.split(" ");
            int number1 = Integer.parseInt(numbers[0]);
            int number2 = Integer.parseInt(numbers[1]);
            sum += number2 + number1;

            if (row % 2 != 0) {
                firstArray[row - 1] = number1;
                secondArray[row - 1] = number2;
            } else {
                secondArray[row - 1] = number1;
                firstArray[row - 1] = number2;
            }
        }
        for (int number:firstArray) {
            System.out.print(" " + number);
        }
        System.out.println();
        for (int number :secondArray) {
            System.out.print(" " + number);
        }
    }
}
