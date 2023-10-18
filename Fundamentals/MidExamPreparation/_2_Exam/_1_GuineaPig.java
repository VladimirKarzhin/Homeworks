package MidExamPreparation._2_Exam;

import java.util.Scanner;

public class _1_GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityOfFood = Double.parseDouble(scanner.nextLine()) * 1000;
        double quantityOfHay = Double.parseDouble(scanner.nextLine()) * 1000;
        double quantityCover = Double.parseDouble(scanner.nextLine()) * 1000;
        double PigWeight = Double.parseDouble(scanner.nextLine()) * 1000;

        boolean runOut = false;

        for (int day = 1; day <= 30; day++) {
            quantityOfFood -= 300.0;

            if (quantityOfFood <= 0) {
                runOut = true;
                break;
            }

            if (day % 2 == 0) {
                double quantityHayUsed = quantityOfFood * 0.05;
                quantityOfHay -= quantityHayUsed;
                if (quantityOfHay <= 0) {
                    runOut = true;
                    break;
                }
            }


            if (day % 3 == 0) {
                double quantityCoverUsed = PigWeight / 3;
                quantityCover -= quantityCoverUsed;
                if (quantityCover <= 0 ) {
                    runOut = true;
                    break;
                }
            }

        }

        if (runOut) {
            System.out.println("Merry must go to the pet store!");
        } else {
            double quantityFoodKg = quantityOfFood / 1000;
            double quantityHayKg = quantityOfHay / 1000;
            double quantityCoverKg = quantityCover / 1000;
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", quantityFoodKg, quantityHayKg, quantityCoverKg);
        }

        }
    }
