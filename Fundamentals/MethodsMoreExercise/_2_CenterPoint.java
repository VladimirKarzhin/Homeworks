package Fundamentals.MethodsLab.MethodsMoreExercise;

import java.util.Scanner;

public class _2_CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int fourthNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(printingClosestCenterOfTheCordinateSystem(firstNumber, secondNumber, thirdNumber, fourthNumber));

    }
    public static String printingClosestCenterOfTheCordinateSystem (int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {

        if (firstNumber + secondNumber >= thirdNumber + fourthNumber) {
            return "(" + thirdNumber + "," + " " + fourthNumber + ")";
        }
        return "(" + firstNumber + "," + " " + secondNumber + ")";
    }
}
