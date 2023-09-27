package Fundamentals.DataTypeandVariablesExercise;

import java.util.Scanner;

public class _9_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalAmount = 0;

        while (startingYield >= 100) {
            days++;
            int spicePerDay = startingYield - 26;
            totalAmount += spicePerDay;
            startingYield -= 10;
        }
        totalAmount -= 26;

        if (totalAmount < 0) {
            totalAmount = 0;
        }
        System.out.println(days);
        System.out.println(totalAmount);
    }
}
