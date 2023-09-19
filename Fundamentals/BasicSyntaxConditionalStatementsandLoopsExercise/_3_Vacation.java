package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class _3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfTheGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0;

        //	Friday	Saturday	Sunday
        //Students	8.45	9.80	10.46
        //Business	10.90	15.60	16
        //Regular	15	20	22.50
        if (typeOfTheGroup.equals("Students")) {
            if (dayOfWeek.equals("Friday")) {
                price = 8.45;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 9.80;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 10.46; }
                if (numberOfPeople >= 30) {
                    price = price * 0.85;
                }
        } else if (typeOfTheGroup.equals("Business")) {
            if (dayOfWeek.equals("Friday")) {
                price = 10.90;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 15.60;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 16;
            } if (numberOfPeople >= 100) {
                    price = price - 10;
              }
        } else if (typeOfTheGroup.equals("Regular")) {
            if (dayOfWeek.equals("Friday")) {
                price = 15;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 20;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 22.50;
            } if (numberOfPeople >= 10 && numberOfPeople <= 20){
        price=price*0.95;
            }
        }
        double totalPrice = numberOfPeople * price;
        System.out.printf("Total price: %.2f", totalPrice);
    }
 }
