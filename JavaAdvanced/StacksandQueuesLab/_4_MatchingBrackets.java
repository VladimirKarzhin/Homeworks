package JavaAdvanced.StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _4_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        while (stack.isEmpty()) {
            for (int index = 0; index < sb.length(); index++) {
                char currentChar = sb.charAt(index);
                if (currentChar == '(') {
                    stack.push(index);
                } else if (currentChar == ')') {
                    String substring = sb.substring(stack.pop(), index + 1);
                    System.out.println(substring);
                }
            }
            if (stack.isEmpty()) {
                break;
            }
        }
    }
}
