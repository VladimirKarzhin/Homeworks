package TheFinalExamPreparation._2_Exam;

import java.util.Scanner;

public class _1_WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        String line = scanner.nextLine();
        while (!line.equals("Travel")) {
            String[] commandParts = line.split(":");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Add Stop":
                    int index = Integer.parseInt(commandParts[1]);
                    String inputToAdd = commandParts[2];
                    if (isValidIndex(index, inputString)) {
                        String left = inputString.substring(0, index);
                        String right = inputString.substring(index);

                        inputString = left + inputToAdd + right;
                    }
                    break;
                case "Remove Stop":
                    int startIndexToRemove = Integer.parseInt(commandParts[1]);
                    int endIndexToRemove = Integer.parseInt(commandParts[2]);

                    if (isValidIndex(startIndexToRemove, inputString) && isValidIndex(endIndexToRemove + 1, inputString)) {
                        String left = inputString.substring(0, startIndexToRemove);
                        String right = inputString.substring(endIndexToRemove + 1);

                        inputString = left + right;
                    }
                    break;
                case "Switch":
                    String oldString = commandParts[1];
                    String newString = commandParts[2];

                    inputString = inputString.replace(oldString, newString);
                    break;
            }

            line = scanner.nextLine();
            System.out.println(inputString);
        }
        System.out.printf("Ready for world tour! Planned stops: %s%n",inputString);
    }

    private static boolean isValidIndex(int index, String string) {
        return index >= 0 && index <= string.length();
    }
}
