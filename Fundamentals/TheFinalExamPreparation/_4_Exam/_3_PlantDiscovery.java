package TheFinalExamPreparation._4_Exam;

import java.util.*;

public class _3_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfPlants = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantRarity = new LinkedHashMap<>();
        Map<String, List<Double>> plantRating = new LinkedHashMap<>();

        for (int i = 0; i < countOfPlants; i++) {
            String line = scanner.nextLine();
            String[] commandParts = line.split("<->");
            String plantName = commandParts[0];
            int rarity = Integer.parseInt(commandParts[1]);

            plantRarity.put(plantName, rarity);
            plantRating.putIfAbsent(plantName, new ArrayList<>());
        }

        String line = scanner.nextLine();

        while (!line.equals("Exhibition")) {
            String[] commandParts = line.split(" ");
            String commandName = commandParts[0];
            String plantName = commandParts[1];

            if (!plantRarity.containsKey(plantName)) {
                System.out.println("error");
                line = scanner.nextLine();
                continue;
            }

            switch (commandName) {
                case "Rate:":
                    double ratingForRate = Double.parseDouble(commandParts[3]);
                    plantRating.get(plantName).add(ratingForRate);
                    break;
                case "Update:":
                    int rarityForUpdate = Integer.parseInt(commandParts[3]);
                    plantRarity.put(plantName, rarityForUpdate);
                    break;
                case "Reset:":
                    plantRating.get(plantName).clear();
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantRarity.entrySet().forEach(entry -> {
            String plantName = entry.getKey();
            int rarity = entry.getValue();
            double averageRating = plantRating.get(plantName)
                    .stream()
                    .mapToDouble(a -> a)
                    .average()
                    .orElse(0.0);
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plantName, rarity, averageRating);
        });
    }
}
