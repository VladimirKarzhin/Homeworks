package JavaAdvanced.JavaAdvancedExercise.MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _5_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readInputAsArray(scanner);

        int rows = dimensions[0];
        int cols = dimensions[1];

        String[][] arr = new String[rows][cols];
        fillMatrix(arr, scanner);

        String line = scanner.nextLine();
        while (!"END".equals(line)) {
            String[] commandParts = line.split(" ");
            String commandName = commandParts[0];
            if (commandParts.length != 5 || !commandName.equals("swap")) {
                System.out.printf("Invalid input!%n");
            } else {
                int oldRow = Integer.parseInt(commandParts[1]);
                int oldCol = Integer.parseInt(commandParts[2]);
                int newRow = Integer.parseInt(commandParts[3]);
                int newCol = Integer.parseInt(commandParts[4]);

                if (oldRow > rows - 1 || oldCol > cols - 1 || newRow > rows - 1 || newCol > cols - 1 || oldRow < 0 || oldCol < 0 || newRow < 0 || newCol < 0) {
                    System.out.println("Invalid input!");

                    } else {
                    String oldNumber = arr[oldRow][oldCol];
                    String newNumber = arr[newRow][newCol];

                    arr[newRow][newCol] = oldNumber;
                    arr[oldRow][oldCol] = newNumber;

                    for (int row = 0; row < rows; row++) {
                        for (int col = 0; col < cols; col++) {
                            System.out.print(arr[row][col] + " ");
                        }
                        System.out.println();
                    }
                }
            }
            line = scanner.nextLine();
        }
    }
    public static int[] readInputAsArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }
}
