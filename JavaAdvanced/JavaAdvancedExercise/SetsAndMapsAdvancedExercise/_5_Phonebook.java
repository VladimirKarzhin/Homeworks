package JavaAdvanced.JavaAdvancedExercise.SetsAndMapsAdvancedExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _5_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new HashMap<>();

        String line = scanner.nextLine();
        while (!"search".equals(line)) {
            String[] arr = line.split("-");
            String peopleName = arr[0];
            String phoneNumber = arr[1];

            phonebook.put(peopleName, phoneNumber);

            line = scanner.nextLine();
        }

        String command = scanner.nextLine();
        while (!"stop".equals(command)) {
            if (phonebook.containsKey(command)) {
                System.out.printf("%s -> %s%n", command, phonebook.get(command));

            } else {
                System.out.printf("Contact %s does not exist.%n", command);
            }
            command = scanner.nextLine();
        }
    }
}
