package Fundamentals.TextProcessingExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class _5_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());
        //byte secondNumber = Byte.parseByte(scanner.nextLine());


        //System.out.println(firstNumber.multiply(new BigInteger(secondNumber + " ")));
        System.out.println(firstNumber.multiply(secondNumber));

    }
}
