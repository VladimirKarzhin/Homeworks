package TheFinalExamPreparation._3_Exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _3_Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> townPopulation = new LinkedHashMap<>();
    

        while (!input.equals("Sail")) {
            String[] commandParts = input.split("\\|\\|");
            String town = commandParts[0];
            int population = Integer.parseInt(commandParts[1]);
            int gold = Integer.parseInt(commandParts[2]);

            if (!townPopulation.containsKey(town) && !townGold.containsKey(town)) {
                townPopulation.put(town, population);
                townGold.put(town, gold);
            } else {
                townPopulation.put(town, townPopulation.get(town) + population);
                townGold.put(town, townGold.get(town) + gold);
            }

            input = scanner.nextLine();
        }

        String eventsOutput = scanner.nextLine();
        while (!eventsOutput.equals("End")) {
            String[] commandParts = eventsOutput.split("=>");
            String eventName = commandParts[0];

            switch (eventName) {
                case "Plunder":
                    String townForPlunder = commandParts[1];
                    int people = Integer.parseInt(commandParts[2]);
                    int goldForPlunder = Integer.parseInt(commandParts[3]);

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", townForPlunder, goldForPlunder, people);
                    townPopulation.put(townForPlunder, townPopulation.get(townForPlunder) - people);
                    townGold.put(townForPlunder, townGold.get(townForPlunder) - goldForPlunder);

                    if (townPopulation.get(townForPlunder) <= 0 || townGold.get(townForPlunder) <= 0) {
                        townPopulation.remove(townForPlunder);
                        townGold.remove(townForPlunder);
                        System.out.printf("%s has been wiped off the map!%n", townForPlunder);
                }
                    break;
                case "Prosper":
                    String townForProsper = commandParts[1];
                    int goldForProsper = Integer.parseInt(commandParts[2]);

                    if (goldForProsper <= 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        townGold.put(townForProsper, townGold.get(townForProsper) + goldForProsper);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", goldForProsper, townForProsper, townGold.get(townForProsper));
                    }
                    break;
            }
            eventsOutput = scanner.nextLine();
        }
        if (townPopulation.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %s wealthy settlements to go to: %n", townPopulation.size());

            for (Map.Entry<String, Integer> kvp : townPopulation.entrySet()) {
                String cityName = kvp.getKey();
                int population = kvp.getValue();
                int gold = townGold.get(cityName);
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", cityName, population, gold);
            }
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
