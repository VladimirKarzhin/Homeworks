package JavaAdvanced.JavaAdvancedLabs.MutidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class _3_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsSize = Integer.parseInt(scanner.nextLine());
        int colsSize = Integer.parseInt(scanner.nextLine());

        String[][] firstArray = new String[rowsSize][colsSize];
        String[][] secondArray = new String[rowsSize][colsSize];

        for (int row = 0; row < rowsSize; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int col = 0; col < colsSize; col++) {
                firstArray[row][col] = input[col];
            }
        }
        for (int row = 0; row < rowsSize; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int col = 0; col < colsSize; col++) {
                secondArray[row][col] = input[col];
            }
        }
        for (int row = 0; row < rowsSize; row++) {
            for (int col = 0; col < colsSize; col++) {
                String currentElementFirstArray = firstArray[row][col];
                String currentElementSecondArray = secondArray[row][col];
                if (!currentElementFirstArray.equals(currentElementSecondArray)) {
                    secondArray[row][col] = "*";
                }
            }
        }
        for (String [] row : secondArray) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
