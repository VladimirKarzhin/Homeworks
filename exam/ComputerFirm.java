package exam;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double totalSales = 0; // Променено на double
        double totalRating = 0;

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            int rating = input % 10;
            int sales = input / 10;

            double salesPercentage = 0;
            switch (rating) {
                case 2:
                    salesPercentage = 0;
                    break;
                case 3:
                    salesPercentage = 0.5;
                    break;
                case 4:
                    salesPercentage = 0.7;
                    break;
                case 5:
                    salesPercentage = 0.85;
                    break;
                case 6:
                    salesPercentage = 1.0;
                    break;
            }

            double actualSales = sales * salesPercentage;
            totalSales += actualSales;
            totalRating += rating;
        }

        double averageRating = totalRating / n;
        System.out.printf("%.2f%n%.2f", totalSales, averageRating);
    }
}











