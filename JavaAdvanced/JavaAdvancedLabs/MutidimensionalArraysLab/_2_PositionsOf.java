package JavaAdvanced.JavaAdvancedLabs.MutidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class _2_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = readInputAsArray(scanner);

        int rows = dimension[0];
        int cols = dimension[1];

        int[][] array = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            array[row] = readInputAsArray(scanner);
        }
        int searchNumber = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int currentNumber = array[row][col];
                if (currentNumber == searchNumber) {
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }

    }
    public static int[] readInputAsArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
