package Fundamentals.MethodsLab;

import java.util.Scanner;

public class _3_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rowsCount; i++) {
            printLine(i);
        }

        for (int i = rowsCount - 1; i >= 1; i--) {
            printLine(i);
        }
    }
    public static void printLine(int elementCount) {
        for (int i = 1; i <= elementCount ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
