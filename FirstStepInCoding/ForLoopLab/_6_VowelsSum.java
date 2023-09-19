package ForLoopLab;

import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class _6_VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int sumOfVowels = 0;

        for (int index = 0; index < text.length(); index++) {
            char currentSymbol = text.charAt(index);

            switch (currentSymbol) {
                case 'a':
                    sumOfVowels = sumOfVowels + 1;
                    break;
                case 'e':
                    sumOfVowels = sumOfVowels + 2;
                    break;
                case 'i':
                    sumOfVowels = sumOfVowels +3;
                    break;
                case 'o':
                    sumOfVowels = sumOfVowels + 4;
                    break;
                case 'u':
                    sumOfVowels = sumOfVowels +5;
                    break;




            }

        }
           System.out.println(sumOfVowels);
    }
}
