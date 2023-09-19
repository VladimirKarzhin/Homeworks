package exam;

import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rollsOfPaper = Integer.parseInt(scanner.nextLine());
        int rollsOfFabric = Integer.parseInt(scanner.nextLine());
        double litersOfGlue = Double.parseDouble(scanner.nextLine());
        int discountPercentage = Integer.parseInt(scanner.nextLine());

        double paperCost = rollsOfPaper * 5.80;
        double fabricCost = rollsOfFabric * 7.20;
        double glueCost = litersOfGlue * 1.20;

        double totalCost = paperCost + fabricCost + glueCost;
        double discount = totalCost * discountPercentage / 100;
        double finalCost = totalCost - discount;

        System.out.printf("%.3f", finalCost);
    }
}

