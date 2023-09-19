package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class _5_SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pensNumbers = Integer.parseInt(scanner.nextLine());
        int markersNumbers = Integer.parseInt(scanner.nextLine());
        int prepLittersNumbers = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        double pensPrice = pensNumbers * 5.80;
        double markersPrice = markersNumbers * 7.20;
        double prepPrice = prepLittersNumbers * 1.20;
        double sum = pensPrice + markersPrice + prepPrice;
        double result = sum - (sum * percent / 100);
        System.out.println(result);}}
