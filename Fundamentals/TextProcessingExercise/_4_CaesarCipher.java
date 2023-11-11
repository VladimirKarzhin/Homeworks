package Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class _4_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text =  scanner.nextLine();
        StringBuilder encryptText = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            char encryptSymbol = (char) (symbol + 3);
            //System.out.print(encryptSymbol);
            encryptText.append(encryptSymbol);
        }
        //System.out.println();
        System.out.println(encryptText);
    }
}
