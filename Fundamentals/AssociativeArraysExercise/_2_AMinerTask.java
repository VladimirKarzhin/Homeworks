package Fundamentals.AssociativeArraysExercise;

import java.util.*;

public class _2_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> minerInventory = new LinkedHashMap<>();

        while (true) {
            String resource = scanner.nextLine();

            if (resource.equals("stop")) {
                break;
            }
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!minerInventory.containsKey(resource)) {
                minerInventory.put(resource, quantity);
            } else {
                int currentQuantity = minerInventory.get(resource);
                minerInventory.put(resource, currentQuantity + quantity);
            }

        }

        minerInventory.entrySet().forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));
    }
}
