package Fundamentals.MidExamPreparation._3_Exam;

import java.util.*;

public class _3_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numberAsString = scanner.nextLine().split(" ");
        int[] numbersArr = new int[numberAsString.length];

        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(numberAsString[i]);
        }

        double sum = getSum(numbersArr);
        double average = sum / numbersArr.length;

        List<Integer> topIntegers = new ArrayList<>();

        for (int currentNumber : numbersArr) {
            if (currentNumber > average) {
                topIntegers.add(currentNumber);
            }
        }

        Collections.sort(topIntegers);
        Collections.reverse(topIntegers);

        if (topIntegers.size() > 5) {
            for (int index = 0; index < 5; index++) {
                System.out.print(topIntegers.get(index) + " ");
            }
        } else if (topIntegers.isEmpty()){
            System.out.println("No");
        } else {
            printList(topIntegers, " ");
        }
    }

    private static double getSum(int[] numbersArr) {
        double sum = 0;
        for (int currentNumber : numbersArr) {
            sum += currentNumber;
        }
        return sum;
    }
    private static void printList(List<Integer> topIntegers, String separator) {
        for (int i = 0; i < topIntegers.size(); i++) {
            System.out.print(topIntegers.get(i));
            if (i < topIntegers.size()) {
                System.out.print(separator);
            }
        }
    }
}
