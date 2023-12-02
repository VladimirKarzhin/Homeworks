package TheFinalExamPreparation._5_Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        String line = scanner.nextLine();
        while (!line.equals("Done")) {
            String[] commandParts = line.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "TakeOdd":
                    List<Integer> indexes = new ArrayList<>();
                    for (int index = 0; index <= inputText.length() - 1; index++) {
                        if (index % 2 != 0) {
                            indexes.add(index);
                        }
                    }
                    for (int currentIndex : indexes) {
                        char currentChar = inputText.charAt(currentIndex);
                        sb.append(currentChar);
                    }
                    inputText = sb.toString();
                    System.out.println(sb);
                    break;
                case "Cut":
                    int indexOfStart = Integer.parseInt(commandParts[1]);
                    int length = Integer.parseInt(commandParts[2]);

                    String left = inputText.substring(0, indexOfStart);
                    String right = inputText.substring(indexOfStart + length);
                    String cuttedSubString = left + right;
                    inputText = cuttedSubString;
                    System.out.println(cuttedSubString);
                    break;
                case "Substitute":
                    String subString = commandParts[1];
                    String substitute = commandParts[2];

                    if (inputText.contains(subString)) {
                        String replacedString = inputText.replaceAll(subString, substitute);
                        inputText = replacedString;
                        System.out.println(replacedString);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            line = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", inputText);
    }
}
