package JavaAdvanced.JavaAdvancedLabs.StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _4_1_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String line = scanner.nextLine();

        for (int i = 0; i <= line.length() - 1; i++) {
            char currentChar = line.charAt(i);

            if ('(' == currentChar) {
                stack.push(i);
            } else if (')' == currentChar) {
                String result = line.substring(stack.pop(), i + 1);
                System.out.println(result);
            }
        }

    }
}
