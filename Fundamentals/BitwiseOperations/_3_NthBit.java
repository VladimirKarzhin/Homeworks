package Fundamentals.BitwiseOperations;

import java.util.Scanner;

public class _3_NthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int position = Integer.parseInt(scanner.nextLine());

        int shiftedNumber = number >> position;
        int result =  shiftedNumber & 1;
        System.out.println(result);
    }
}
