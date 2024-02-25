package JavaOOP.JavaOOP_Labs.WorkingwithAbstractionLab;

import java.util.Scanner;

public class _1_RhombusofStars {
    public static void main(String[] args) {

        int size = readInput();
        printRhombus(size);

    }

    private static void printRhombus(int size) {
        for (int i = 1; i <= size; i++) {
            printRhombusLine(size, i);

        }
        for (int i = size - 1; i >= 1; i--) {
            printRhombusLine(size, i);

        }
    }

    private static int readInput() {
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }
    private static void printRhombusLine (int rows, int currentRow) {

        for (int s = 0; s < rows - currentRow; s++) {
            System.out.print(" ");
        }

        for (int a = 0; a < currentRow; a++) {
            System.out.print("* ");
        }

        System.out.println();
    }
}
