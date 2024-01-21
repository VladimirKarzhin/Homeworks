package JavaAdvanced.JavaAdvancedExercise.SetsAndMapsAdvancedExercise;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class _8_UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"IP={IP.Address} message={A&sample&message} user={username}"

        Map<String, LinkedHashMap<String, Integer>> users = new TreeMap<>();

        String line = scanner.nextLine();
        while (!"end".equals(line)) {
            String[] commandParts = line.split("\\s+");
            String user = commandParts[2].split("=")[1];
            String ip = commandParts[0].split("=")[1];

            if (users.containsKey(user)) {
                if (users.get(user).containsKey(ip)) {
                    users.get(user).put(ip, users.get(user).get(ip) + 1);
                } else {
                    users.get(user).put(ip, 1);
                }
            } else {
                LinkedHashMap<String, Integer> currentTimes = new LinkedHashMap<>();
                currentTimes.put(ip, 1);
                users.put(user, currentTimes);
            }
            line = scanner.nextLine();
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> kvp : users.entrySet()) {
            System.out.printf("%s: %n", kvp.getKey());
            int counter = kvp.getValue().size();
            for (Map.Entry<String, Integer> entry : kvp.getValue().entrySet()) {
                if (counter > 1) {
                    counter--;
                    System.out.printf("%s => %d, ", entry.getKey(), entry.getValue());
                } else {
                    counter--;
                    System.out.printf("%s => %d.%n", entry.getKey(), entry.getValue());
                }
            }
        }
    }
}
