package exam;

import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        String serviceType = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());

        double pricePerKilometer = 0.0;

        if (weight < 1) {
            pricePerKilometer = 0.03;
        } else if (weight <= 10) {
            pricePerKilometer = 0.05;
        } else if (weight <= 40) {
            pricePerKilometer = 0.10;
        } else if (weight < 90) {
            pricePerKilometer = 0.15;
        } else if (weight < 150) {
            pricePerKilometer = 0.20;
        }

        if (serviceType.equals("express")) {
            double expressSurcharge = 0.0;
            if (weight < 1) {
                expressSurcharge = 0.8;
            } else if (weight <= 10) {
                expressSurcharge = 0.4;
            } else if (weight <= 40) {
                expressSurcharge = 0.05;
            } else if (weight > 90) {
                expressSurcharge = 0.02;
            } else if (weight <= 150) {
                expressSurcharge = 0.01;
            }


        }

        double totalPrice = pricePerKilometer * distance;

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",
                weight, totalPrice);
    }
}