package Fundamentals.AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _3_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        Map<String, Integer> productsQuantity = new LinkedHashMap<>();
        Map<String, Double> productsPrice = new LinkedHashMap<>();

        while (!data.equals("buy")) {
            String[] commandParts = data.split(" ");
            String productName = commandParts[0];
            double productPrice = Double.parseDouble(commandParts[1]);
            int productQuantity = Integer.parseInt(commandParts[2]);

            if (!productsQuantity.containsKey(productName)) {
                productsQuantity.put(productName, productQuantity);
                productsPrice.put(productName, productPrice);
            } else {
                int currentQuantity = productsQuantity.get(productName);
                productsQuantity.put(productName, currentQuantity + productQuantity);
                productsPrice.put(productName, productPrice);
            }

            data = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> kvp : productsQuantity.entrySet()) {
            String productName = kvp.getKey();
            double finalSum = productsQuantity.get(productName) * productsPrice.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}
