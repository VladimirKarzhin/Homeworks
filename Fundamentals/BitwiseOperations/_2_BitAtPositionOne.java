package Fundamentals.BitwiseOperations;

import java.util.Scanner;

public class _2_BitAtPositionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int shiftedNumber = number >> 1;
        int result =  shiftedNumber & 1;
        System.out.println(result);
    }
}
