package FirstStepsInCoding;

import java.io.PrintStream;
import java.util.Scanner;

public class _9_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int sqrMeters = Integer.parseInt(scanner.nextLine());
        double amount = sqrMeters * 7.61;
        double discount = amount * 0.18;

        double sumAfterDiscount = amount - discount;

        System.out.printf("The final price is: %2f lv.%n", sumAfterDiscount);
        System.out.printf("The discount is: %2f lv", discount); }}

