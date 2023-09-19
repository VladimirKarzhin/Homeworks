package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class _7_TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        switch (typeOfDay) {
            case "Weekday":
                if ( age >= 0 && age <= 18 ){
                    System.out.println("12$");
                }
                if ( age > 18 && age <= 64 ) {
                    System.out.println("18$");
                }
                if (64 < age && age <= 122) {
                    System.out.println("12$");
                }
                else if (age < 0 || age > 122) {
                    System.out.println("Error!");
                }
                break;
            case "Weekend":
                if ( age >= 0 && age <= 18 ){
                    System.out.println("15$");
                }
                if ( age > 18 && age <= 64 ) {
                    System.out.println("20$");
                }
                if ( 64 < age && age <= 122 ) {
                    System.out.println("15$");
                }
                else if (age < 0 || age > 122) {
                    System.out.println("Error!");
                }
                break;
            case "Holiday":
                if ( age >= 0 && age <= 18 ){
                    System.out.println("5$");
                }
                if ( age > 18 && age <= 64 ) {
                    System.out.println("12$");
                }
                if ( 64 < age && age <= 122 ) {
                    System.out.println("10$");
                } else if (age < 0 || age > 122) {
                    System.out.println("Error!");
                }
                break;

        }
    }
}
