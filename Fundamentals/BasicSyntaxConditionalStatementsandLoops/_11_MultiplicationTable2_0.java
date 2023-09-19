package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class _11_MultiplicationTable2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        //int nTimes = Integer.parseInt(scanner.nextLine());
        //int counter = 1;
        if (numberTwo > 10) {
            int result = number * numberTwo;
            System.out.printf("%d X %d = %d%n", number, numberTwo, result);
            numberTwo += 1;}
        while (numberTwo <= 10) {
            int result = number * numberTwo;
            System.out.printf("%d X %d = %d%n", number, numberTwo, result);
            numberTwo += 1;
         }
        }

    }

