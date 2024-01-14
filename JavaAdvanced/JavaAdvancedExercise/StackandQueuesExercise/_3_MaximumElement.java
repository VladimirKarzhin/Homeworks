package JavaAdvanced.JavaAdvancedExercise.StackandQueuesExercise;

import java.util.*;

public class _3_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {

            String[] commandArgs = scanner.nextLine().split(" ");
            String number = commandArgs[0];

            switch (number) {
                case "1":
                    int elementToPush = Integer.parseInt(commandArgs[1]);
                    stack.push(elementToPush);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(stack));
                    break;
            }
        }
    }
}
