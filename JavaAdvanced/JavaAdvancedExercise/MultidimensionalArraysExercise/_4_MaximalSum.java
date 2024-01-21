package JavaAdvanced.JavaAdvancedExercise.MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _4_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readInputAsArray(scanner);

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] arr = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            arr[row] = readInputAsArray(scanner);
        }

        int maxSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {

                int sum = arr[row][col]
                        + arr[row][col + 1]
                        + arr[row][col + 2]
                        + arr[row + 1][col]
                        + arr[row + 1][col + 1]
                        + arr[row + 1][col + 2]
                        + arr[row + 2][col]
                        + arr[row + 2][col + 1]
                        + arr[row + 2][col + 2];


                if (sum > maxSum) {
                    maxSum = sum;
                    bestRow = row;
                    bestCol = col;
                }
            }
        }

        System.out.printf("Sum = %d%n", maxSum);
                System.out.println(arr[bestRow][bestCol] + " " + arr[bestRow][bestCol + 1] + " "+ arr[bestRow][bestCol + 2]);
                System.out.println(arr[bestRow + 1][bestCol] + " " + arr[bestRow + 1][bestCol + 1] + " "+ arr[bestRow + 1][bestCol + 2]);
                System.out.println(arr[bestRow + 2][bestCol] + " " + arr[bestRow + 2][bestCol + 1] + " " + arr[bestRow + 2][bestCol + 2]);
            }
    public static int[] readInputAsArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}

