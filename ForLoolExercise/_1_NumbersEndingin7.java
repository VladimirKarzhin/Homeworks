package ForLoolExercise;

import java.util.Scanner;

public class _1_NumbersEndingin7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int number = 1; number <= 1000; ++number) {
            if (number % 10 == 7) {
                System.out.println(number);
            }
        }
    }
}
