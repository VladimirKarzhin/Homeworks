package JavaAdvanced.JavaAdvancedLabs.StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _5_1_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String line = scanner.nextLine();
        while (!"print".equals(line)) {
            if (!"cancel".equals(line)) {
                queue.offer(line);
            } else {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.poll());
                }
            }
            line = scanner.nextLine();
        }
        for (String file : queue) {
            System.out.println(file);
        }

    }
}
