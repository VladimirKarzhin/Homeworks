package JavaOOP.JavaOOP_Exercises.EncapsulationExercise._3_ShoppingSpree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();
        List<Product> productList = new ArrayList<>();

        String[] peoples = scanner.nextLine().split(";");
        String[] products = scanner.nextLine().split(";");

        for (String people : peoples) {
            String[] peopleInfo = people.split("=");
            Person person = new Person(peopleInfo[0], Double.parseDouble(peopleInfo[1]));
            personList.add(person);
        }

        for (String product : products) {
            String[] productInfo = product.split("=");
            Product currentProduct = new Product(productInfo[0], Double.parseDouble(productInfo[1]));
            productList.add(currentProduct);
        }

        String line = scanner.nextLine();
        while (!line.equals("END")) {
            String[] commandArgs = line.split("\\s+");
            String name = commandArgs[0];
            String product = commandArgs[1];
            for (Person person1 : personList) {
                if (person1.getName().equals(name)) {
                    for (Product product1 : productList) {
                        if (product1.getName().equals(product)) {
                            person1.buyProduct(product1);
                        }
                    }
                }
            }
            line = scanner.nextLine();
        }
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    private static List<String> getCollect(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(";"))
                .collect(Collectors.toList());
    }
}
