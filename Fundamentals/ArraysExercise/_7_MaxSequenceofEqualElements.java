package Fundamentals.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

        public class _7_MaxSequenceofEqualElements {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                int length = 1;
                int maxLength = 0;
                int startIndex = 0;
                int bestIndex = 0;

                for (int i = 1; i <= numbers.length - 1; i++) {
                    if (numbers[i] == numbers[i - 1]) {
                        length++;
                    } else {
                        length = 1;
                        startIndex = i;
                    }

                    if (length > maxLength) {
                        maxLength = length;
                        bestIndex = startIndex;
                    }
                }

                for (int i = bestIndex; i < bestIndex + maxLength; i++) {
                    System.out.print(numbers[i] + " ");
                }
            }
        }


