package JavaAdvanced.JavaAdvancedLabs.MutidimensionalArraysLab;

import java.util.Scanner;

public class _6_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsAndCols = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rowsAndCols][rowsAndCols];

        for (int row = 0; row < rowsAndCols; row++) {
            for (int col = 0; col < rowsAndCols; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        int[] firstDiagonal = new int[rowsAndCols];
        int[] secondDiagonal = new int[rowsAndCols];

        for (int row = 0; row < rowsAndCols; row++) {
            for (int col = 0; col < rowsAndCols; col++) {
                if (row == col) {
                    firstDiagonal[row] = matrix[row][col];
                }
            }
        }
        int count = rowsAndCols - 1;
        for (int row = 0; row < rowsAndCols; row++) {
            for (int col = 0; col < rowsAndCols; col++) {
                if (row + col == rowsAndCols - 1) {
                    secondDiagonal[count] = matrix[row][col];
                    count--;
                }
            }
        }
        for (int i = 0; i < rowsAndCols; i++) {
            System.out.print(firstDiagonal[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < rowsAndCols; i++) {
            System.out.print(secondDiagonal[i] + " ");
        }
    }
}
