package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class _12_EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean IsEvenFound = false;
        while (!IsEvenFound) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                IsEvenFound = true;
                System.out.printf("The number is: %d", number);
            } else {
                System.out.println("Please write an even number.");
            }
        }
    }
}
