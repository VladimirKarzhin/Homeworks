package Fundamentals.MethodsLab.MethodsMoreExercise;

import java.util.Scanner;

public class _1_DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        if (command.equals("int")) {

            int number = Integer.parseInt(scanner.nextLine());
            System.out.println(printingInt(number));

        } else if (command.equals("real")) {

            double number = Double.parseDouble(scanner.nextLine());
            double result = (printingDouble(number));
            System.out.printf("%.2f", result);

        } else if (command.equals("string")) {

            String text = scanner.nextLine();
            System.out.printf(printingString(text));
        }
    }
    public static int printingInt (int number) {
        return number * 2;
    }

    public static double printingDouble (double number) {
        return number * 1.5;
    }
    public static String printingString (String text) {
        //System.out.println("$" + text + "$");
        return  "$" + text + "$";
    }

}
