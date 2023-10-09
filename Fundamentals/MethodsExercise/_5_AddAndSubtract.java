package Fundamentals.MethodsExercise;

import java.util.Scanner;

public class _5_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondsNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int addingResult = adding(firstNumber, secondsNumber);
        int subtractingResult = subtracting(addingResult, thirdNumber);
        System.out.println(subtractingResult);
    }
    public static int adding (int n1, int n2) {
        return n1 + n2;
    }
    public static int subtracting (int n1, int n2) {
        return n1 - n2;
    }

}
