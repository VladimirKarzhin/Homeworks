package Fundamentals.MethodsLab;

import java.util.Scanner;

public class _7_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        String result = repeatingString(text, count);
        System.out.println(result);
    }
    public static String repeatingString(String text, int count) {
        String [] result = new String[count];

        for (int i = 0; i < count ; i++) {
            result[i] = text;
        }
        
        return String.join("", result);
    }
}
