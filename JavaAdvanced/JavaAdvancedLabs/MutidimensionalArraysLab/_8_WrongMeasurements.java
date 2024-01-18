package JavaAdvanced.JavaAdvancedLabs.MutidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class _8_WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = filMatrix(scanner, size);
        System.out.println();

        int wrongValue = findWrongValue(matrix, scanner);
        matrix = editedMatrix(matrix, wrongValue);
        printMatrix(matrix);

    }

    public static int[][] editedMatrix(int[][] matrix, int wrongValue) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] newMatrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int sum = 0;

                int currentNumber = matrix[row][col];
                if (currentNumber == wrongValue) {
                    //ляво
                    if (col != 0) {
                        if (matrix[row][col - 1] != wrongValue) {
                            sum +=matrix[row][col - 1];
                        }
                    }
                    //нагоре
                    if (row != 0) {
                        if (matrix[row - 1][col] != wrongValue) {
                            sum += matrix[row - 1][col];
                        }
                    }
                    //надясно
                    if (col != matrix[row].length - 1) {
                        if (matrix[row][col + 1] != wrongValue) {
                            sum += matrix[row][col + 1];
                        }
                    }
                    //надолу
                    if (row != matrix.length - 1) {
                        if (matrix[row + 1][col] != wrongValue) {
                            sum += matrix[row + 1][col];
                        }
                    }
                    newMatrix[row][col] = sum;
                } else {
                    newMatrix[row][col] = matrix[row][col];
                }
            }
        }
        return newMatrix;
    }

    public static int findWrongValue(int[][] matrix, Scanner scanner) {
        int[] coordinatesForWrongNumber = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int row = coordinatesForWrongNumber[0];
        int col = coordinatesForWrongNumber[1];

        return matrix[row][col];
    }

    public static int[][] filMatrix (Scanner scanner,int size) {
        int[][] matrix = new int[size][size];
        for (int row = 0; row < matrix.length; row++) {
            int[] input = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = input;
        }
        return matrix;
    }

    public static void printMatrix(int[][] updatedMatrix) {
        for (int [] row : updatedMatrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
