package Fundamentals.DataTypesandVariablesLab;

import java.util.Scanner;

public class _1_ConvertMeterstoKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int meters = Integer.parseInt(scanner.nextLine());
        double kilometers = meters / 1000.0;

        System.out.printf("%.2f", kilometers);
    }
}
