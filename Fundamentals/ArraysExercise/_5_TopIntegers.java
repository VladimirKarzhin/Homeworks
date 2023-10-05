package Fundamentals.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _5_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index < numbers.length - 1; index++) {
            int currentNumber = numbers[index];

            boolean isBigger = true;

            for (int i = index + 1; i <= numbers.length - 1 ; i++) {
                int afterNumber = numbers[i];

                if (currentNumber <= afterNumber) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(currentNumber + " ");
            }
        }
        System.out.print(numbers[numbers.length - 1]);
    }
}
