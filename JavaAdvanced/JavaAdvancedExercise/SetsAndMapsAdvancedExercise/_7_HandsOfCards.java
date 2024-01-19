package JavaAdvanced.JavaAdvancedExercise.SetsAndMapsAdvancedExercise;

import java.util.*;

public class _7_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> players = new LinkedHashMap<>();

        String line = scanner.nextLine();
        while (!"JOKER".equals(line)) {
            String[] commandParts = line.split(": ");
            String playerName = commandParts[0];
            String[] playerCards = commandParts[1].split(", ");

            Set<String> cardsSet = new HashSet<>();
            cardsSet.addAll(Arrays.asList(playerCards));

            if (!players.containsKey(playerName)) {
                players.put(playerName, cardsSet);
            } else {
                Set<String> currentCards = players.get(playerName);
                currentCards.addAll(cardsSet);
            }
            line = scanner.nextLine();
        }
        for (Map.Entry<String, Set<String>> kvp : players.entrySet()) {
            String playerName = kvp.getKey();
            Set<String> cards = kvp.getValue();
            int points = getPoints(cards);
            System.out.printf("%s: %d%n", playerName, points);
        }

    }

    private static int getPoints(Set<String> cards) {
        Map<Character, Integer> symbolsValue = getSymbolsValue();
        int sumPoints = 0;

        for (String card : cards) {

            int points = 0;

            if (card.startsWith("10")) {
                char type = card.charAt(2);
                points = 10 * symbolsValue.get(type);
            } else {
                char power = card.charAt(0);
                char type = card.charAt(1);
                points = symbolsValue.get(power) * symbolsValue.get(type);
            }
            sumPoints += points;
        }
        return sumPoints;
    }

    private static Map<Character, Integer> getSymbolsValue() {
        Map<Character, Integer> characterValues = new HashMap<>();
        characterValues.put('2', 2);
        characterValues.put('3', 3);
        characterValues.put('4', 4);
        characterValues.put('5', 5);
        characterValues.put('6', 6);
        characterValues.put('7', 7);
        characterValues.put('8', 8);
        characterValues.put('9', 9);
        characterValues.put('J', 11);
        characterValues.put('Q', 12);
        characterValues.put('K', 13);
        characterValues.put('A', 14);
        characterValues.put('S', 4);
        characterValues.put('H', 3);
        characterValues.put('D', 2);
        characterValues.put('C', 1);

        return characterValues;
    }
}
