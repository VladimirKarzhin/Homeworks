package TheFinalExamPreparation._1_Exam;

import java.util.Scanner;

public class _1_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder inputString = new StringBuilder(scanner.nextLine());

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Reveal")) {
                break;
            }
            String[] commandParts = command.split(":\\|:");
            String commandName = commandParts[0];

            switch (commandName) {
                case "InsertSpace":
                    int indexOfInsert = Integer.parseInt(commandParts[1]);
                    inputString.insert(indexOfInsert, " ");
                    System.out.println(inputString);
                    break;
                case "Reverse":
                    String subString = commandParts[1];
                    String copyOfInputString = inputString.toString();
                    if (copyOfInputString.contains(subString)) {
                        int indexOfStart = inputString.indexOf(subString);
                        int indexOfEnd = indexOfStart + subString.length();

                        inputString.replace(indexOfStart, indexOfEnd, "");

                        StringBuilder reversedString = new StringBuilder();
                        for (int i = subString.length() - 1; i >= 0; i--) {
                            char currentChar = subString.charAt(i);
                            reversedString.append(currentChar);
                        }
                        inputString.append(reversedString);
                        System.out.println(inputString);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String stringToChange = commandParts[1];
                    String replacement = commandParts[2];

                    String currentInputString = inputString.toString();
                    currentInputString = currentInputString.replace(stringToChange, replacement);
                    inputString.replace(0, inputString.length(), "");
                    inputString.append(currentInputString);
                    System.out.println(currentInputString);
                    break;
            }
        }
        System.out.printf("You have a new text message: %s", inputString);
    }
}
