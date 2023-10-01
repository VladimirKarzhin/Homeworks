package Fundamentals.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Wagons = Integer.parseInt(scanner.nextLine());
        int [] countPeople = new int[Wagons];
        int sum = 0;

        for (int wagon = 0; wagon < Wagons; wagon++) {
            int people = Integer.parseInt(scanner.nextLine());
            //countPeople[] = people;
            countPeople[wagon] += people;

            sum += people;
            }
        for (int number : countPeople) {
            System.out.print(number + " ");
        }
        System.out.println();
        int sums = sum;
        System.out.println(sums);
    }
}
