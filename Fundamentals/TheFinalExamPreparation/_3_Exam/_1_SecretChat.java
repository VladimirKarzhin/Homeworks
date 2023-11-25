package TheFinalExamPreparation._3_Exam;

import java.util.Scanner;

public class _1_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        StringBuilder lastMessage = new StringBuilder(message);

        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {
            String[] commandParts = input.split(":\\|:");
            String commandName = commandParts[0];

            switch (commandName) {
                case "InsertSpace":
                    int indexToInsertSpace = Integer.parseInt(commandParts[1]);
                    message = lastMessage.toString();
                    String left = message.substring(0, indexToInsertSpace);
                    String right = message.substring(indexToInsertSpace);
                    String insertedSpaceString = left + " " + right;
                    lastMessage.replace(0, lastMessage.length(), "");
                    lastMessage.append(insertedSpaceString);
                    System.out.println(insertedSpaceString);
                    break;
                case "Reverse":
                    String subString = commandParts[1];
                    message = lastMessage.toString();
                    if (message.contains(subString)) {
                        String reversedString = "";
                       String replaced = message.replace(subString, "");
                        for (int i = subString.length() - 1; i >= 0; i--) {
                            char ch = subString.charAt(i);
                            reversedString += ch ;
                        }
                        String result = replaced + reversedString;
                        lastMessage.replace(0, lastMessage.length(), "");
                        lastMessage.append(result);
                        System.out.println(result);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String subStringTo = commandParts[1];
                    String replacement = commandParts[2];
                    lastMessage = new StringBuilder(lastMessage.toString().replaceAll(subStringTo, replacement));
                    System.out.println(lastMessage);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", lastMessage);
    }
}
