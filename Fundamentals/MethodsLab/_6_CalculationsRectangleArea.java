package Fundamentals.MethodsLab;

import java.util.Scanner;

public class _6_CalculationsRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sideA = Integer.parseInt(scanner.nextLine());
        int sideB = Integer.parseInt(scanner.nextLine());

        System.out.println(calculateArea(sideA, sideB));
    }
    public static int calculateArea(int sideA, int sideB) {
        return sideA * sideB;

    }
}
