package TheFinalExamPreparation._1_Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _2_MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        Pattern pattern = Pattern.compile("(\\#|\\@)(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(inputText);

        int pairsFound = 0;
        List<String> mirrorWords = new ArrayList<>();
        while (matcher.find()) {
            pairsFound++;
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            String reversedWord = "";

            for (int i = secondWord.length() - 1; i >= 0; i--) {
                String letter = String.valueOf(secondWord.charAt(i));
                reversedWord += letter;
            }

            if (firstWord.equals(reversedWord)) {
                mirrorWords.add(firstWord + " <=> " + secondWord);
            }
        }
        if (pairsFound > 0) {
            System.out.printf("%s word pairs found!%n", pairsFound);
        } else {
            System.out.println("No word pairs found!");
        }
        if (mirrorWords.size() > 0) {
            System.out.println("The mirror words are:");
        } else {
            System.out.println("No mirror words!");
        }
        System.out.println(String.join(", ", mirrorWords));
    }
}
