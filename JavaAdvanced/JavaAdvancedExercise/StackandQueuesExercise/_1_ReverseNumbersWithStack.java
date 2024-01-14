package JavaAdvanced.JavaAdvancedExercise.StackandQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class _1_ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(stack::push);

        for (int number : stack) {
            number = stack.pop();

            if (stack.isEmpty()) {
                System.out.print(number);
            } else {
                System.out.print(number + " ");
            }
        }
    }
}
