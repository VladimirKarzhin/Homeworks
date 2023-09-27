package Fundamentals.DataTypeandVariablesExercise;

import java.util.Scanner;

public class _1_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        int number4 = Integer.parseInt(scanner.nextLine());

        // ((ПЪРВОТО + ВТОРОТО) / ТРЕТО) * ЧЕТВЪРТО
        System.out.println(((number1 + number2) / number3) * number4);

    }
}
