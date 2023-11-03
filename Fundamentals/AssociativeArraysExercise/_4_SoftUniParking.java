package Fundamentals.AssociativeArraysExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _4_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());

        Map<String, String> parking = new LinkedHashMap<>();

        for (int count = 1; count <= countCommands; count++) {
            String command = scanner.nextLine();
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            String username = commandParts[1];

            switch (commandName) {
                case "register":
                    String licensePlateNumber = commandParts[2];
                    if (parking.containsKey(username)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", parking.get(username));
                    } else {
                        parking.put(username, licensePlateNumber);
                        System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                    }
                    break;
                case "unregister":
                    if (!parking.containsKey(username)) {
                        System.out.printf("ERROR: user %s not found%n", username);
                    } else {
                        parking.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> kvp : parking.entrySet()) {
            System.out.printf("%s => %s%n", kvp.getKey(), kvp.getValue());
        }
    }
}
