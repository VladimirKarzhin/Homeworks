package Fundamentals.MidExamPreparation._4_Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _3_ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine()
                        .split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> warship = Arrays.stream(scanner.nextLine()
                        .split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxHealthCapacity = Integer.parseInt(scanner.nextLine());

        String line = scanner.nextLine();
        boolean canPrint = true;
        while (!line.equals("Retire")) {

            String[] commandParts = line.split(" ");
            String command = commandParts[0];

            if (command.contains("Fire")) {
                int indexFire = Integer.parseInt(commandParts[1]);
                int damageFire = Integer.parseInt(commandParts[2]);

                if (indexFire >= 0 && indexFire <= warship.size() - 1) {
                    int currentNumber = warship.get(indexFire);
                    currentNumber -= damageFire;
                    warship.remove(indexFire);
                    warship.add(indexFire, currentNumber);

                    if (currentNumber <= 0) {
                        canPrint = false;
                        System.out.println("You won! The enemy ship has sunken.");
                        break;
                    }
                }
            } else if (command.contains("Defend")) {
                int startIndex = Integer.parseInt(commandParts[1]);
                int endIndex = Integer.parseInt(commandParts[2]);
                int damageDefend = Integer.parseInt(commandParts[3]);

                if (startIndex >= 0 && endIndex <= pirateShip.size() - 1) {
                    for (int index = startIndex; index <= endIndex; index++) {
                        int currentNumber = pirateShip.get(index);
                        currentNumber -= damageDefend;
                        pirateShip.remove(index);
                        pirateShip.add(index, currentNumber);

                        if (currentNumber <= 0) {
                            canPrint = false;
                            System.out.println("You lost! The pirate ship has sunken.");
                            break;
                        }
                    }
                }
            } else if (command.contains("Repair")) {
                int index = Integer.parseInt(commandParts[1]);
                int health = Integer.parseInt(commandParts[2]);
                //int healthOnIndex = pirateShip.get(index);

                if (index >= 0 && index <= pirateShip.size() - 1) {
                        pirateShip.set(index, pirateShip.get(index) + health);
                        //int updatedHealth = healthOnIndex + health;
                        if (pirateShip.get(index) > maxHealthCapacity) {
                        pirateShip.set(index, maxHealthCapacity);
                    }
                }
            } else if (command.equals("Status")) {
                int countRepairs = 0;

                for (int index = 0; index <= pirateShip.size() - 1; index++) {
                    int numberFromCurrentList = pirateShip.get(index);
                    double check =  (1.0 * numberFromCurrentList / maxHealthCapacity) * 100;
                    if (check < 20) {
                        countRepairs++;
                    }
                }
                System.out.printf("%d sections need repair.", countRepairs);
                System.out.println();
            }

            line = scanner.nextLine();
        }

        int sumWarship = 0;
        int sumPirateShip = 0;

        if (canPrint) {
            for (int numbers : pirateShip) {
                sumPirateShip += numbers;
            }
            System.out.printf("Pirate ship status: %d", sumPirateShip);
            System.out.println();

            for (int numbers : warship) {
                sumWarship += numbers;
            }
            System.out.printf("Warship status: %d", sumWarship);
            System.out.println();
        }

    }
}
