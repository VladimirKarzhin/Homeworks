package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _3_Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chat = new ArrayList<>();



        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] commandParts = line.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Chat":
                    String message = commandParts[1];
                    chat.add(message);
                    break;
                case "Delete":
                    String messageToDelete = commandParts[1];
                    if (chat.contains(messageToDelete)) {
                        int index = chat.indexOf(messageToDelete);
                        chat.remove(index);
                    }
                    break;
                case "Edit":
                    String oldMessage = commandParts[1];
                    String editedMessage = commandParts[2];
                    if (chat.contains(oldMessage)) {
                        int index = chat.indexOf(oldMessage);
                        oldMessage = editedMessage;
                        chat.remove(index);
                        chat.add(index, oldMessage);
                    }

                    break;
                case "Pin":
                    String messageToPin = commandParts[1];
                    if (chat.contains(messageToPin)) {
                        chat.remove(messageToPin);
                        chat.add(messageToPin);
                    }
                    break;
                case "Spam":
                    String[] spamMessages = commandParts;
                    for (int i = 1; i < spamMessages.length; i++) {
                        String currentMessage = spamMessages[i];
                        chat.add(currentMessage);
                    }
                    break;
            }

            line = scanner.nextLine();
        }
        for (String currentLine : chat) {
            System.out.println(currentLine);
        }


    }
}
