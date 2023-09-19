package ConditionaStatementsExercise;

import java.util.Scanner;

public class _04_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tourPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int numOfToys = puzzles + doll + bears + minions + trucks;

        double profit = (puzzles * 2.60) + (doll * 3) + (bears * 4.10) + (minions * 8.20) + (trucks * 2);
        profit = profit - profit * 10 / 100;

        if(numOfToys >= 50) {
            profit = profit - profit * 25 / 100;
        }


        if(tourPrice > profit) {
            System.out.printf("Not enough money! %.02f lv needed.", tourPrice - profit);
        } else {
            System.out.printf("Yes! %.02f lv left.", profit - tourPrice);
        }

    }
}
