package MidExamPreparation._2_Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = Arrays.stream(scanner.nextLine()
                        .split("!"))
                .collect(Collectors.toList());

            String command = scanner.nextLine();
            while (!command.equals("Go Shopping!")) {

                String[] commandParts = command.split(" ");
                String commandName = commandParts[0];
                String product = commandParts[1];

            switch (commandName) {
                case "Urgent":
                    if (!products.contains(product)) {
                        products.add(0, product);
                    }
                    break;
                case "Unnecessary":
                    if (products.contains(product)) {
                        products.remove(product);
                    }
                    break;
                case "Correct":
                    String newProduct = commandParts[2];
                    if (products.contains(product)) {
                        int indexProduct = products.indexOf(product);
                        products.remove(product);
                        products.add(indexProduct, newProduct);
                    }
                    break;
                case "Rearrange":
                    if (products.contains(product)) {
                        products.remove(product);
                        products.add(product);
                    }
                    break;

            }
                command = scanner.nextLine();
        }
        System.out.println(products.toString()
                .replace("[", "")
                .replace("]", ""));
    }
}
