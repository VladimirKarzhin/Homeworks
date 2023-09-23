package Fundamentals.DataTypesandVariablesLab;

import java.util.Scanner;

public class _2_PoundstoDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        1 British Pound = 1.36 Dollars
        double britishPounds = Double.parseDouble(scanner.nextLine());
        double dollars = britishPounds * 1.36;

        System.out.printf("%.3f", dollars);
    }
}
