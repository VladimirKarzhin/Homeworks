package Fundamentals.DataTypeandVariablesExercise;

import java.util.Scanner;

public class _4_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSymbols = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= countSymbols; i++) {
            char symbol = scanner.nextLine().charAt(0);
            int code = (int) symbol;
            sum += code;
        }
        System.out.printf("The sum equals: %d", sum);


    }
}
