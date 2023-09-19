package FirstStepsInCoding_Exercise;
import java.util.Scanner;
public class _3_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double rate = Integer.parseInt(scanner.nextLine());
        double ratePerMonth = deposit * (rate / 100) / 12;
        double result = deposit + (period * ratePerMonth);
        System.out.println(result);}}
