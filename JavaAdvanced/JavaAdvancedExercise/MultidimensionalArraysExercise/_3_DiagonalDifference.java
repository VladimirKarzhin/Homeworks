package JavaAdvanced.JavaAdvancedExercise.MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _3_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        int[] firstDiagonal = new int[size];
        int[] secondDiagonal = new int[size];

        for (int row = 0; row < size; row++) {
            matrix[row] = readInputAsArray(scanner);
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == col) {
                    firstDiagonal[row] = matrix[row][col];
                }
            }
        }
        int count = size - 1;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row + col == size - 1) {
                    secondDiagonal[count] = matrix[row][col];
                    count--;
                }
            }
        }
        System.out.println();
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;

        for (int number : firstDiagonal) {
            firstDiagonalSum += number;
        }
        for (int number : secondDiagonal) {
            secondDiagonalSum += number;
        }

        System.out.println(Math.abs(firstDiagonalSum - secondDiagonalSum));

    }
    public static int[] readInputAsArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
