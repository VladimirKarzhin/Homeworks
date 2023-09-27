package Fundamentals.DataTypeandVariablesExercise;

import java.util.Scanner;

public class _3_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacityPeople = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= capacityPeople - capacityPeople + 1; i++) {
                int elevatedNumberOfPeople = (int) Math.ceil((double) numberOfPeople / capacityPeople);
                System.out.println(elevatedNumberOfPeople);
        }
    }
}
