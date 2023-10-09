package Fundamentals.MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        calculate(firstNumber, operator, secondNumber);
        double resultat = calculate(firstNumber, operator, secondNumber);
        System.out.println(new DecimalFormat("0.####").format(resultat));
    }
    public static double calculate(int a, String operator, int b) {
        int result = 0;

        switch (operator) {
            case "/":
               result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }
        return result;
    }

}
