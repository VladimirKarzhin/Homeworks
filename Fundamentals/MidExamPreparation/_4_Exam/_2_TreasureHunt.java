package Fundamentals.MidExamPreparation._4_Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] loot = input.split("\\|");


        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {

            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {

                case "Loot":
                    for (int i = 1; i < commandParts.length; i++) {
                        boolean isItemExisting = false;

                        for (String treasure : loot) {
                            if (commandParts[i].equals(treasure)) {
                                isItemExisting = true;
                                break;
                            }
                        }
                        if (!isItemExisting) {
                            String[] treasureNew = new String[loot.length + 1];
                            treasureNew[0] = commandParts[i];
                            System.arraycopy(loot, 0, treasureNew, 1, loot.length);
                            loot = treasureNew;
                        }
                    }
                    break;
                case "Drop":
                    int indexForDrop = Integer.parseInt(commandParts[1]);

                    if (indexForDrop >= 0 && indexForDrop <= loot.length - 1) {
                        String droppedLoot = loot[indexForDrop];

                        for (int i = indexForDrop; i < loot.length - 1; i++) {
                            loot[i] = loot[i + 1];
                        }
                        loot[loot.length - 1] = droppedLoot;
                    }
                    break;
                case "Steal":
                    int items = Integer.parseInt(commandParts[1]);
                    int itemForDrop = Math.min(items, loot.length);

                    if (itemForDrop > 0) {
                        String[] stolenTreasures = Arrays.copyOfRange(loot, loot.length - itemForDrop, loot.length);
                        loot = Arrays.copyOf(loot, loot.length - itemForDrop);
                        System.out.println(String.join(", ", stolenTreasures));
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        if (loot.length > 0) {
            int sumItems = 0;
            for (String loots : loot) {
                sumItems += loots.length();
            }

            double avgTreasureGain = (double) sumItems / loot.length;
            System.out.printf("Average treasure gain: %.2f pirate credits.", avgTreasureGain);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
