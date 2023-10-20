package Fundamentals.MidExamPreparation._4_Exam;

import java.util.Scanner;

public class _1_BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double days = Double.parseDouble(scanner.nextLine());
        double dailyPlunder = Double.parseDouble(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalPlunder = 0;

            for (int day = 1; day <= days; day++) {
                totalPlunder += dailyPlunder;

                if (day % 3 == 0) {
                    totalPlunder += dailyPlunder / 2;
                }
                if (day % 5 == 0) {
                    totalPlunder *= 0.7;
                }
            }


        if (totalPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        } else {
            calculatePercentage(expectedPlunder, totalPlunder);
        }


    }
    public static double calculatePercentage(double expectedNumber, double actualNumber) {

        double percent = (actualNumber / expectedNumber) * 100;
        System.out.printf("Collected only %.2f%% of the plunder.", percent);
        return (actualNumber / expectedNumber) * 100;
    }
}