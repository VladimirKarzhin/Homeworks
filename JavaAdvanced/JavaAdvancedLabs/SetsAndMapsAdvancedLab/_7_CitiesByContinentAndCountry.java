package JavaAdvanced.JavaAdvancedLabs.SetsAndMapsAdvancedLab;

import java.util.*;

public class _7_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, LinkedHashMap<String, List<String>>> map = new LinkedHashMap<>();

        for (int i = 0; i < count; i++) {
            String line = scanner.nextLine();
            String[] commandParts = line.split("\\s+");
            String continent = commandParts[0];
            String country = commandParts[1];
            String city = commandParts[2];

            map.putIfAbsent(continent, new LinkedHashMap<>());
            map.get(continent).putIfAbsent(country, new ArrayList<>());
            map.get(continent).get(country).add(city);
        }
        map.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach((k, v) -> {
                System.out.printf("  %s -> %s%n", k, String.join(", ", v));
            });
        });
        }
    }