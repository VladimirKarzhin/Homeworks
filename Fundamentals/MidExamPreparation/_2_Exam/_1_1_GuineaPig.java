package MidExamPreparation._2_Exam;

import java.util.Scanner;

public class _1_1_GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityFoodInKg = Double.parseDouble(scanner.nextLine());
        double quantityHayInKg = Double.parseDouble(scanner.nextLine());
        double quantityCoverInKg = Double.parseDouble(scanner.nextLine());
        double pigWeightInKg = Double.parseDouble(scanner.nextLine());

        double quantityFoodInGrams = quantityFoodInKg * 1000;
        double quantityHayInGrams = quantityHayInKg * 1000;
        double quantityCoverInGrams = quantityCoverInKg * 1000;
        double pigWeightInGrams = pigWeightInKg * 1000;

        boolean runOut = false;

        for (int day = 1; day <= 30; day++) {
            quantityFoodInGrams -= 300;

            if (quantityFoodInGrams < 0) {
                runOut = true;
                break;
            }

            if (day % 2 == 0) {
                double neededHay = 0.05 * quantityFoodInGrams;
                quantityHayInGrams -= neededHay;
            }
            if (quantityHayInGrams < 0) {
                runOut = true;
                break;
            }

            if (day % 3 == 0) {
                double neededCover = pigWeightInGrams / 3;
                quantityCoverInGrams -= neededCover;
            }

            if (quantityCoverInGrams < 0) {
                runOut = true;
                break;
            }

        }

        if (runOut) {
            System.out.println("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f."
                    , quantityFoodInGrams / 1000
                    , quantityHayInGrams / 1000
                    , quantityCoverInGrams / 1000);
        }
    }
}
