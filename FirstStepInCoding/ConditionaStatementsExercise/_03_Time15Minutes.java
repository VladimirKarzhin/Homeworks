package ConditionaStatementsExercise;

import java.util.Scanner;

public class _03_Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());

        minute = minute + 15;
        hour = hour + minute / 60;
        minute = minute % 60;

        if(hour == 24) {
            hour = 0;
        }

        System.out.printf("%d:%02d", hour, minute);

 //       if (minute < 10) {
 //           System.out.printf("%s:0%d", hour, minute);
 //       } else {
 //           System.out.printf("%s:%d", hour, minute);
 //       }
    }
}
