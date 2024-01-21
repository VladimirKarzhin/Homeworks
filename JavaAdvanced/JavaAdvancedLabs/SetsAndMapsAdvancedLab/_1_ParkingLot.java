package JavaAdvanced.JavaAdvancedLabs.SetsAndMapsAdvancedLab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _1_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parking = new LinkedHashSet<>();

        String line = scanner.nextLine();
        while (!"END".equals(line)) {
            String[] commandParts = line.split(", ");
            String direction = commandParts[0];
            String carNumber = commandParts[1];

            if ("IN".equals(direction)) {
                parking.add(carNumber);
            } else {
                parking.remove(carNumber);
            }
            line = scanner.nextLine();
        }
        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            parking.forEach(System.out::println);
        }
    }
}
