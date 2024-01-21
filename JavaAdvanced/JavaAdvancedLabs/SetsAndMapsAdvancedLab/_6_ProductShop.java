package JavaAdvanced.JavaAdvancedLabs.SetsAndMapsAdvancedLab;

import java.util.*;

public class _6_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String, Double>> productShop = new TreeMap<>();

        String line = scanner.nextLine();
        while (!"Revision".equals(line)) {
            String[] commandParts = line.split(", ");
            String shop = commandParts[0];
            String product = commandParts[1];
            Double price = Double.parseDouble(commandParts[2]);

            productShop.putIfAbsent(shop, new LinkedHashMap<>());
            LinkedHashMap<String, Double> shopData = productShop.get(shop);
            shopData.putIfAbsent(product, price);

            line = scanner.nextLine();
            }
        for (Map.Entry<String, LinkedHashMap<String, Double>> kvp : productShop.entrySet()) {
            System.out.printf("%s->%n", kvp.getKey());
            for (Map.Entry<String, Double> entry : kvp.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", entry.getKey(), entry.getValue());
            }
        }
    }
}