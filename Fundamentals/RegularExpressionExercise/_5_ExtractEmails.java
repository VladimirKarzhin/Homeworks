package Fundamentals.RegularExpressionExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _5_ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regexUsername = "[A-Za-z0-9_]+[.\\-_]?[A-Za-z0-9]+";
        String regexHost = "[A-Za-z]+-?[A-Za-z]+(\\.[A-Za-z]+-?[A-Za-z]+)+";
        String fullRegex = regexUsername + "@" + regexHost;

        Pattern pattern = Pattern.compile(fullRegex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
