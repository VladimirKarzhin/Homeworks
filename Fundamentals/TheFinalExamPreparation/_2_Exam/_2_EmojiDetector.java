package TheFinalExamPreparation._2_Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _2_EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int threshold = getThreshold(text);
        System.out.printf("Cool threshold: %s%n", threshold);

        List<String> emojis = extractEmojis(text);
        System.out.printf("%s emojis found in the text. The cool ones are:%n", emojis.size());

        for (String emoji : emojis) {
            int coolness = 0;
            for (int i = 0; i < emoji.length(); i++) {
                char ch = emoji.charAt(i);
                if (Character.isLetter(ch)) {
                    coolness += ch;
                }
            }
            if (coolness >= threshold) {
                System.out.println(emoji);
            }
        }
    }

    private static List<String> extractEmojis(String text) {
        Pattern pattern = Pattern.compile("(::|\\*\\*)(?<emoji>[A-Z][a-z]{2,})\\1");
        Matcher matcher = pattern.matcher(text);

        List<String> emojis = new ArrayList<>();
        while (matcher.find()) {
            String emoji = matcher.group();
            emojis.add(emoji);
        }
        return emojis;
    }

    private static int getThreshold(String text) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(text);

        int sum = 1;
        while (matcher.find()) {
            String digit = matcher.group();
            sum *= Integer.parseInt(digit);
        }
        return sum;
    }
}
