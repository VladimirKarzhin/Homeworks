package Fundamentals.MethodsLab;

import java.util.Scanner;

public class _9_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valueType =  scanner.nextLine();

        switch (valueType) {
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                int maxInt = getMaxInt(firstNum, secondNum);
                System.out.println(maxInt);
                break;
            case "char":
                char firstChar = scanner.next().charAt(0);
                char secondChar = scanner.next().charAt(0);
                char maxChar = getMaxChar(firstChar, secondChar);
                System.out.println(maxChar);
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                String maxString = getMaxString(firstString, secondString);
                System.out.println(maxString);
                break;
        }
    }
    public static int getMaxInt(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        }
        return secondNum;
    }
    public static char getMaxChar(char firstChar, char secondChar) {
        if (firstChar > secondChar) {
            return firstChar;
        }
        return secondChar;
    }
    public static String getMaxString(String firstString, String secondString) {
        if (firstString.compareTo(secondString) >= 0) {
            return firstString;
        }
        return secondString;
    }
}
