package Fundamentals.MidExamPreparation._3_Exam;

import java.util.Scanner;

public class _1_SofUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int howManyStudentsCanHandleFirstEmployee = Integer.parseInt(scanner.nextLine());
        int howManyStudentsCanHandleSecondEmployee = Integer.parseInt(scanner.nextLine());
        int howManyStudentsCanHandleThirdEmployee = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());


        int hoursCount = 0;

        while (studentsCount > 0) {

                studentsCount -=howManyStudentsCanHandleFirstEmployee;
                studentsCount -=howManyStudentsCanHandleSecondEmployee;
                studentsCount -=howManyStudentsCanHandleThirdEmployee;
                hoursCount++;


            if (hoursCount % 4 == 0) {
                hoursCount++;
                }

        }
            System.out.printf("Time needed: %dh.", hoursCount);
        }
}



