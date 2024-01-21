package JavaAdvanced.JavaAdvancedLabs.SetsAndMapsAdvancedLab;

import java.util.*;

public class _3_VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayerCards = new LinkedHashSet<>();
        Set<Integer> secondPlayerCards = new LinkedHashSet<>();

        int count = 1;
        for (int i = 0; i < 2; i++) {
            String line = scanner.nextLine();
            int[] numbers = Arrays.stream(line.split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            if (count == 1) {
                for (int number : numbers) {
                    firstPlayerCards.add(number);
                }
            } else if (count == 2) {
                for (int number : numbers) {
                    secondPlayerCards.add(number);
                }
            }
            count++;
        }
        int countFor = 0;
            while (countFor != 50){
            int firstNumber = firstPlayerCards.iterator().next();
            firstPlayerCards.remove(firstNumber);
            int secondNumber = secondPlayerCards.iterator().next();
            secondPlayerCards.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstPlayerCards.add(firstNumber);
                firstPlayerCards.add(secondNumber);
            } else if (secondNumber > firstNumber) {
                secondPlayerCards.add(firstNumber);
                secondPlayerCards.add(secondNumber);
            }
            countFor++;
        }

        if (firstPlayerCards.size() > secondPlayerCards.size()) {
            System.out.println("First player win!");
        } else if (secondPlayerCards.size() > firstPlayerCards.size()) {
            System.out.println("Second player win!");
        }
    }
}
