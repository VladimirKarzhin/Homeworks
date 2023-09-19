package exam;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = 1;
        int climbedMeters = 5364;

        String input = scanner.nextLine();

        while (!input.equals("END") && days <= 5 && climbedMeters < 8848) {
            String overNight = input;
            int metersClimbed = Integer.parseInt(scanner.nextLine());

            if (overNight.equals("Yes")) {
                days++;
            }

            if (days > 5) {
                break;
            }

            climbedMeters += metersClimbed;

            if (climbedMeters >= 8848) {
                System.out.printf("Goal reached for %d days!", days);
                return;
            }

            input = scanner.nextLine();
        }

        if (climbedMeters >= 8848) {
            System.out.printf("Goal reached for %d days!", days);
        } else {
            System.out.println("Failed!");
            System.out.println(climbedMeters);
        }
    }
}

