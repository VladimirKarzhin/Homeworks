package JavaAdvanced.JavaAdvancedExercise.StackandQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class _2_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();

        int[] tokens = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int N = tokens[0];
        int S = tokens[1];
        int X = tokens[2];

        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(stack::push);

        for (int i = 0; i < S; i++) {
            stack.pop();
        }

        if (stack.size() == 0) {
            System.out.println(0);
        }

        while (!stack.isEmpty()) {
            if (stack.contains(X)) {
                System.out.println(true);
                break;
            }
            if (stack.size() == 1) {
                break;
            }

            int topmost = stack.pop();
            int underTopmost = stack.pop();

            if (topmost > underTopmost) {
                stack.push(underTopmost);
            } else {
                stack.push(topmost);
            }
        }
        if (!stack.contains(X)) {
            for (int number : stack) {
                number = stack.pop();
                System.out.print(number);
            }
        }
    }
}
