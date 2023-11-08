package Fundamentals.TextProcessingLab;

import java.util.Scanner;

public class _3_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String text = scanner.nextLine();

        while (true) {
            int indexOf = text.indexOf(word);
            if (indexOf == -1) {
                break;
            }

            String leftSubString = text.substring(0, indexOf);
            String rightSubString = text.substring(indexOf + word.length());

            text = leftSubString + rightSubString;

        }
        System.out.println(text);

    }
}
