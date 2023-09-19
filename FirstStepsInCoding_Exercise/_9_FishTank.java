package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class _9_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = l * w * h;
        double volumeLitters = volume / 1000;

        double result = volumeLitters * (1 - percent / 1000);

        System.out.println(result);
    }
}
