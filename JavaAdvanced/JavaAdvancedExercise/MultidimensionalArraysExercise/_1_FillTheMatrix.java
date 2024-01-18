package JavaAdvanced.JavaAdvancedExercise.MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(", ");
        int rowsAndCols = Integer.parseInt(arr[0]);
        String pattern = arr[1];

        int[][] matrix = new int[rowsAndCols][rowsAndCols];

        if ("A".equals(pattern)) {
            printPatternA(matrix);
        } else if ("B".equals(pattern)) {
            printPatternB(matrix);
        }
    }

    private static void printPatternB(int[][] array) {
        int dim = array.length;
        int count = 1;

        for (int col = 0; col < dim; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < dim; row++) {
                    array[row][col] = count++;
                }
            } else {
                for (int row = dim - 1; row >= 0; row--) {
                    array[row][col] = count++;
                }
            }
        }
        printArray(array);
    }

    private static void printPatternA(int[][] array) {
        int dim = array.length;
        int count = 1;

        for (int col = 0; col < dim; col++) {
            for (int row = 0; row < dim; row++) {
                array[row][col] = count++;
            }
        }
        printArray(array);
    }

    public static void printArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < array[row].length; col++) {
                sb.append(array[row][col]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
