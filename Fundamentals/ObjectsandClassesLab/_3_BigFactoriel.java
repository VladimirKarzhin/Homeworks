package Fundamentals.ObjectsandClassesLab;

import java.math.BigInteger;
import java.util.Scanner;

public class _3_BigFactoriel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number =  Integer.parseInt(scanner.nextLine());

        BigInteger result = BigInteger.valueOf(1);

        for (int index = 1; index <= number; index++) {
            result = result.multiply(BigInteger.valueOf(index));
        }

        System.out.println(result);
    }
}
