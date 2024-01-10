package JavaAdvanced.StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _6_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> peopleQueue = new ArrayDeque<>();

        String[] people = scanner.nextLine().split(" ");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < people.length; i++) {
            String currentPerson = people[i];
            peopleQueue.offer(currentPerson);
        }

        while (peopleQueue.size() != 1) {
            for (int i = 1; i < count; i++) {
                peopleQueue.offer(peopleQueue.poll());
            }
            System.out.printf("Removed %s%n", peopleQueue.poll());
        }
        System.out.printf("Last is %s%n", peopleQueue.poll());
    }
}

        


