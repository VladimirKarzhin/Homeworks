package Fundamentals.MethodsExercise;

import java.util.Scanner;

public class _7_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTable(n);

    }
    public static void printTable (int n) {
        for (int row = 1; row <= n ; row++) {
            for (int column = 1; column <= n; column++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
