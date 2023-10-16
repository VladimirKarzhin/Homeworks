package Fundamentals.ListsLab.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _8_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > names.size() - 1) {
                    endIndex = names.size() - 1;
                }

                if (startIndex >= 0 && startIndex <= names.size() - 1 && endIndex >= 0 && endIndex <= names.size() - 1) {

                    String MergedString = "";

                    for (int index = startIndex; index <= endIndex; index++) {
                        String current = names.get(index);
                        MergedString += current;
                    }

                    for (int index = startIndex; index <= endIndex; index++) {
                        names.remove(startIndex);
                    }
                    names.add(startIndex, MergedString);
                   }
                } else if (command.contains("divide")) {
                    int index = Integer.parseInt(command.split(" ")[1]);
                    int parts = Integer.parseInt(command.split(" ")[2]);

                    if (index >= 0 && index <= names.size() - 1) {
                        String textForDivide = names.get(index);
                        names.remove(index);

                        int countSymbolsPerPart = textForDivide.length() / parts;

                        int beginIndex = 0;
                        for (int part = 1; part < parts; part++) {
                            String textPerPart = textForDivide.substring(beginIndex, beginIndex +  countSymbolsPerPart);
                            names.add(index, textPerPart);
                            index++;
                            beginIndex += countSymbolsPerPart;
                        }
                        String textLastParts = textForDivide.substring(beginIndex, textForDivide.length());
                        names.add(index, textLastParts);
                    }
                }


            command = scanner.nextLine();
        }
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
