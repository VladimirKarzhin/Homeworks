package TheFinalExamPreparation._4_Exam;

import java.util.Scanner;

public class _1_TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String inputLines = scanner.nextLine();
        while (!inputLines.equals("Decode")) {
            String[] commandParts = inputLines.split("\\|");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Move":
                    int n = Integer.parseInt(commandParts[1]);

                    String movedChars = "";
                    for (int i = 0; i < n; i++) {
                        char ch = message.charAt(i);
                        movedChars += ch;
                    }
                    String replacedStringWithSpace = message.replaceAll(movedChars, "");
                    String movedCharacters = replacedStringWithSpace + movedChars;

                    message = movedCharacters;
                    break;
                case "Insert":
                    int indexForInsert = Integer.parseInt(commandParts[1]);
                    String stringForInsert = commandParts[2];

                    String left = message.substring(0, indexForInsert);
                    String right = message.substring(indexForInsert);
                    String insertedString = left + stringForInsert + right;
                    message = insertedString;

                    break;
                case "ChangeAll":
                    String subStringTo = commandParts[1];
                    String replacement = commandParts[2];

                    String result = message.replace(subStringTo, replacement);
                    message = result;
                    break;

            }

            inputLines = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", message);

    }
}
