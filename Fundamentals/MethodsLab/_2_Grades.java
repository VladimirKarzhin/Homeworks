package Fundamentals.MethodsLab;

import java.util.Scanner;

public class _2_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double grade = Double.parseDouble(input);

        printGradeName(grade);
    }
    public static void printGradeName(double grade) {
        if (grade >= 2 && grade <= 2.99) {
            System.out.println("Fail");
        } else if (grade >= 3 && grade <= 3.49) {
            System.out.println("Poor");
        } else if (grade >= 3.5 && grade <= 4.49) {
            System.out.println("Good");
        } else if (grade >= 4.5 && grade <= 5.49) {
            System.out.println("Very good");
        } else if (grade >= 5.5 && grade <= 6) {
            System.out.println("Excellent");
        }
    }
}
