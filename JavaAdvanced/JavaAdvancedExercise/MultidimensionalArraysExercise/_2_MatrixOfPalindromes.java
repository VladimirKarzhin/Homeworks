package JavaAdvanced.JavaAdvancedExercise.MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _2_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readInputAsArray(scanner);

        int rows = dimensions[0];
        int cols = dimensions[1];

        String[][] arr = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                int characterToChange = row + col;
                int rowSymbols = 97 + row;

                char charForChange = (char) (97 + characterToChange);
                char rowChar = (char) (rowSymbols);

                int charNumberRow = rowChar;
                int charNumberChange = charForChange;

                arr[row][col] = (char) charNumberRow + "" +(char) charNumberChange + "" + (char) charNumberRow;
            }
        }

        for (int row = 0; row < rows; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < cols; col++) {
                sb.append(arr[row][col]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }

    }
    public static int[] readInputAsArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
