package JavaAdvanced.JavaAdvancedLabs.StacksandQueuesLab;

import java.util.PriorityQueue;
import java.util.Scanner;

public class _7_MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PriorityQueue<String> queue = new PriorityQueue<>();


        String line = scanner.nextLine();
        String[] arr = line.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String currentName = arr[i];
            queue.offer(currentName);
        }

        int count = Integer.parseInt(scanner.nextLine());
        int cycle = 1;

        while (queue.size() != 1) {
            for (int i = 1; i < count; i++) {
                queue.offer(String.valueOf(queue.poll()));

            }
            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;

        }
        System.out.println("Last is " + queue.poll());
    }

    private static boolean isPrime(int cycle) {
            if (cycle <= 1)
                return false;

            for (int i = 2; i < cycle; i++)
                if (cycle % i == 0)
                    return false;

            return true;
        }
    }
