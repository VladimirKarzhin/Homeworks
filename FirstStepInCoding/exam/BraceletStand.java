package exam;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dailyPocketMoney = Double.parseDouble(scanner.nextLine());
        double dailyEarnings = Double.parseDouble(scanner.nextLine());
        double totalExpenses = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double totalSavings = dailyPocketMoney * 5 + dailyEarnings * 5;
        double totalMoney = totalSavings - totalExpenses;

        if (totalMoney >= giftPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", totalMoney);
        } else {
            double neededMoney = giftPrice - totalMoney;
            System.out.printf("Insufficient money: %.2f BGN.", neededMoney);
        }
    }
}

