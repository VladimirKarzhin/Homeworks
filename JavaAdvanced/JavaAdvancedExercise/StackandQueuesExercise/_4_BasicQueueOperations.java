package JavaAdvanced.JavaAdvancedExercise.StackandQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class _4_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> queue = new ArrayDeque<>();

        int[] tokens = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int N = tokens[0];
        int S = tokens[1];
        int X = tokens[2];

        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(queue::offer);

        for (int i = 0; i < S; i++) {
            queue.poll();
        }

        if (queue.size() == 0) {
            System.out.println(0);
        }

        while (!queue.isEmpty()) {
            if (queue.contains(X)) {
                System.out.println(true);
                break;
            }
            if (queue.size() == 1) {
                break;
            }

            int topmost = queue.poll();
            int underTopmost = queue.poll();

            if (topmost > underTopmost) {
                queue.offer(underTopmost);
            } else {
                queue.offer(topmost);
            }
        }
        if (!queue.contains(X)) {
            for (int number : queue) {
                number = queue.poll();
                System.out.print(number);
            }
        }
    }
}
