package Fundamentals.ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _3_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandCount = Integer.parseInt(scanner.nextLine());

        List<String> guestList = new ArrayList<>();

        for (int count = 1; count <= commandCount ;count++) {
            String command = scanner.nextLine();
            String[] commandParts = command.split(" ");
            String name = commandParts[0];

            if (command.contains("not")) {

                if (guestList.contains(name)) {
                    guestList.remove(name);
                } else {
                    System.out.println(name + " " + "is not in the list!");
                }
            } else {
                if (guestList.contains(name)) {
                    System.out.println(name + " " + "is already in the list!");
                } else {
                    guestList.add(name);
                }
            }
        }
        for (String names : guestList) {
            System.out.println(names);
        }

        }
    }