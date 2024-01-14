package JavaAdvanced.JavaAdvancedLabs.StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _3_1_DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int decimalNumber = Integer.parseInt(scanner.nextLine());

        if (decimalNumber == 0) {
            System.out.println(decimalNumber);
        }

        while (decimalNumber != 0) {
            stack.push(decimalNumber % 2);
            decimalNumber /= 2;
        }

        for (int number : stack) {
            System.out.print(number);
        }
    }
}
