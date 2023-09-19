package ForLoopLab;

import java.util.Scanner;

public class _5_CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // начало: 0 -> charAt
        // край: дъжлината - 1
        // промяната: 1

        for (int index = 0; index < text.length(); index++ ) {
            System.out.println(text.charAt(index));
        }



    }
}
