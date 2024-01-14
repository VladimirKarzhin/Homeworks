package JavaAdvanced.JavaAdvancedLabs.StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _6_1_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String line = scanner.nextLine();
        String[] arr = line.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String currentName = arr[i];
            queue.offer(currentName);
        }

        int count = Integer.parseInt(scanner.nextLine());

        while (queue.size() != 1) {
            for (int i = 1; i < count; i++) {
                queue.offer(String.valueOf(queue.poll()));

            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.poll());

    }
}
