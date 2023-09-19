package ConditionalStatementsLab;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary = 0;

        String currentDay = "Monday";
        if (currentDay.equals("Monday")){
            salary = Double.parseDouble(scanner.nextLine());
        }

        System.out.println(salary);

    }//System.out.printf("%.3f", area);
}
