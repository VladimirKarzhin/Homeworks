package Fundamentals.TextProcessingExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class _5_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. НАЧИН
        //BigInteger firstNumber = new BigInteger(scanner.nextLine());
        //byte secondNumber = Byte.parseByte(scanner.nextLine());
        //System.out.println(firstNumber.multiply(new BigInteger(secondNumber + " ")));

        //2. НАЧИН
        //BigInteger firstNumber = new BigInteger(scanner.nextLine());
        //BigInteger secondNumber = new BigInteger(scanner.nextLine());
        //System.out.println(firstNumber.multiply(secondNumber));

        //3. НАЧИН
        String firstNumber = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        StringBuilder result = new StringBuilder();
        int over = 0;

        for (int position = firstNumber.length() - 1; position >= 0; position--) {
            int digit = Integer.parseInt(firstNumber.charAt(position) + "");
            int currentMultiply = digit * secondNumber + over;

            over = currentMultiply / 10;
            result.insert(0, currentMultiply % 10);
        }
        System.out.println(result);


    }
}
