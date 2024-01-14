package JavaAdvanced.JavaAdvancedLabs.StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _3_DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> decimalNumber = new ArrayDeque<>();

        int number = Integer.parseInt(scanner.nextLine());

        if (number == 0) {
            System.out.println(number);
        }

        while (number != 0) {
            decimalNumber.push(number % 2);
            number /= 2;
        }

        while (!decimalNumber.isEmpty()) {
            System.out.print(decimalNumber.pop());
        }

    }
}
