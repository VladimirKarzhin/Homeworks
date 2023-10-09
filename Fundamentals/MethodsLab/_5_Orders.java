package Fundamentals.MethodsLab;

import java.util.Scanner;

public class _5_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        double quantity =  Integer.parseInt(scanner.nextLine());

        if (product.equals("coffee")) {
            coffeeSum(quantity);
        } else if (product.equals("water")) {
            waterSum(quantity);
        } else if (product.equals("coke")) {
            cokeSum(quantity);
        } else if (product.equals("snacks")) {
            snacksSum(quantity);
        }
    }
    public static void coffeeSum(double quantity) {
        double oneCoffee = 1.50;
        double productSum = oneCoffee * quantity;
        System.out.printf("%.2f", productSum);
    }
    public static void waterSum(double quantity) {
        double oneWater = 1.00;
        double productSum = oneWater * quantity;
        System.out.printf("%.2f", productSum);
    }
    public static void cokeSum(double quantity) {
        double oneCoke = 1.40;
        double productSum = oneCoke * quantity;
        System.out.printf("%.2f", productSum);
    }
    public static void snacksSum(double quantity) {
        double oneSnacks = 2.00;
        double productSum = oneSnacks * quantity;
        System.out.printf("%.2f", productSum);
    }

}
