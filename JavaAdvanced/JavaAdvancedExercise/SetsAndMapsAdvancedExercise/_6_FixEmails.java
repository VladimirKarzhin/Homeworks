package JavaAdvanced.JavaAdvancedExercise.SetsAndMapsAdvancedExercise;

import java.util.IllegalFormatCodePointException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _6_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> legitEmails = new LinkedHashMap<>();
        Map<String, String> notLegitEmails = new LinkedHashMap<>();

        while (true) {
            String line = scanner.nextLine();
             if ("stop".equals(line)) {
                 break;
             }
             String email = scanner.nextLine();

             if (email.endsWith("uk") || email.endsWith("com") || email.endsWith("us")) {
                notLegitEmails.put(line, email);
            } else {
                 legitEmails.put(line, email);
             }
        }
        for (Map.Entry<String, String> kvp : legitEmails.entrySet()) {
            System.out.printf("%s -> %s%n", kvp.getKey(), kvp.getValue());
        }
    }
}
