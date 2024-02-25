package JavaOOP.JavaOOP_Exercises.WorkingwithAbstractionExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _5_JedyGalaxy_Refactoring {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] dimensions = readInput(scanner.nextLine());

            int rows = dimensions[0];
            int cols = dimensions[1];

            int[][] matrix = new int[rows][cols];
            
            fillMatrix(rows, cols, matrix);

            String command = scanner.nextLine();
            
            int sum = 0;
            while (!command.equals("Let the Force be with you")) {
                int[] jediPowerCoordinates = readInput(command);

                int jediRowCoordinates = jediPowerCoordinates[0];
                int jediColCoordinates = jediPowerCoordinates[1];

                while (jediRowCoordinates >= 0 && jediColCoordinates < matrix[1].length) {

                    if (jediRowCoordinates < matrix.length && jediColCoordinates >= 0 && jediColCoordinates < matrix[0].length) {
                        sum += matrix[jediRowCoordinates][jediColCoordinates];
                    }

                    jediColCoordinates++;
                    jediRowCoordinates--;
                }

                int[] evilPowerCoordinates = readInput(command);
                int evilRowCoordinates = evilPowerCoordinates[0];
                int evilColCoordinates = evilPowerCoordinates[1];

                while (evilRowCoordinates >= 0 && evilColCoordinates >= 0) {

                    if (evilRowCoordinates < matrix.length && evilColCoordinates < matrix[0].length) {
                        matrix[evilRowCoordinates][evilColCoordinates] = 0;
                    }
                    evilRowCoordinates--;
                    evilColCoordinates--;
                }

                command = scanner.nextLine();
            }

            System.out.println(sum);

        }
    private static void fillMatrix(int rows, int cols, int[][] matrix) {
        int count = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = count++;
            }
        }
    }

    private static int[] readInput(String command) {
        return Arrays.stream(command.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}