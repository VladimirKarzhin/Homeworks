package JavaAdvanced.StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _8_BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack =  new ArrayDeque<>();
        ArrayDeque<String> queue =  new ArrayDeque<>();

        String line = scanner.nextLine();

        while (!"Home".equals(line)) {
            if ("back".equals(line)) {
                if (stack.size() > 1) {
                    queue.addFirst(stack.pop());
                    System.out.println(stack.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else if ("forward".equals(line)) {
                if (!queue.isEmpty()) {
                    stack.push(queue.poll());
                    System.out.println(stack.peek());
                } else {
                    System.out.println("no next URLs");
                }
            } else {
                stack.push(line);
                queue.clear();
                System.out.println(line);
            }

            line = scanner.nextLine();
        }
    }
}
