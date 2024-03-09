package JavaOOP.JavaOOP_Labs.InterfacesAndAbstractionLab._5_BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> listOfFakeIds = new ArrayList<>();

        String line = scanner.nextLine();

        while (!"End".equals(line)) {
            String[] commandParts = line.split("\\s+");

            if (commandParts.length == 2) {
                String model = commandParts[0];
                String id = commandParts[1];

                Robot robot = new Robot(id, model);
                listOfFakeIds.add(robot);
            } else if (commandParts.length == 3) {
                String name = commandParts[0];
                int age = Integer.parseInt(commandParts[1]);
                String id = commandParts[2];

                Citizen citizen = new Citizen(name, age, id);
                listOfFakeIds.add(citizen);
            }

            line = scanner.nextLine();
        }
        String lastDigits = scanner.nextLine();

        for (Identifiable entry : listOfFakeIds) {
            if (entry.getId().endsWith(lastDigits)) {
                System.out.println(entry.getId());
            }
        }
    }
}
