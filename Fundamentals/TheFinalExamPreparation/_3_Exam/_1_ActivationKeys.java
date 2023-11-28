package TheFinalExamPreparation._3_Exam;

import java.util.Scanner;

public class _1_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        String rawActivationKey = inputText;

        String line = scanner.nextLine();
        while (!line.equals("Generate")) {
            String[] commandParts = line.split(">>>");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Contains":
                    String subString = commandParts[1];
                    if (inputText.contains(subString)) {
                        System.out.printf("%s contains %s%n", inputText, subString);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLowerCase = commandParts[1];
                    int startIndexFlip = Integer.parseInt(commandParts[2]);
                    int endIndexFlip = Integer.parseInt(commandParts[3]);

                    if (upperOrLowerCase.equals("Upper")) {
                        String left = inputText.substring(0, startIndexFlip);
                        String right = inputText.substring(endIndexFlip);
                        String middle = inputText.substring(startIndexFlip, endIndexFlip).toUpperCase();

                        String resultUpper = left + middle + right;
                        System.out.println(resultUpper);
                        inputText = resultUpper;

                    } else if (upperOrLowerCase.equals("Lower")) {
                        String left = inputText.substring(0, startIndexFlip);
                        String right = inputText.substring(endIndexFlip);
                        String middle = inputText.substring(startIndexFlip, endIndexFlip).toLowerCase();

                        String resultLower = left + middle + right;
                        System.out.println(resultLower);
                        inputText = resultLower;

                    }
                    break;
                case "Slice":
                    int startIndexSlice = Integer.parseInt(commandParts[1]);
                    int endIndexSlice = Integer.parseInt(commandParts[2]);

                    String left = inputText.substring(0, startIndexSlice);
                    String right = inputText.substring(endIndexSlice);
                    String resultSlice = left + right;
                    System.out.println(resultSlice);
                    inputText = resultSlice;
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", inputText);
    }
}
