package Fundamentals.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _9_PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        while (numbers.size() > 0) {

            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= numbers.size() - 1) {

                int removedElement = numbers.get(index);
                numbers.remove(index);
                sum += removedElement;

                modifyList(numbers, removedElement);
            } else if (index < 0) {

                int removedElement = numbers.get(0);
                numbers.remove(0);
                int lastElement = numbers.get(numbers.size() - 1);
                numbers.add(0 , lastElement);
                sum += removedElement;

                modifyList(numbers, removedElement);
            } else if (index > numbers.size() - 1){

                int removedElement = numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                int firstElement = numbers.get(0);
                numbers.add(firstElement);
                sum += removedElement;

                modifyList(numbers, removedElement);
            }
        }

        System.out.println(sum);
    }

    private static void modifyList(List<Integer> numbers, int removedElement) {

        for (int index = 0; index <= numbers.size() - 1; index++) {

            int currentNumber =numbers.get(index);

            if (currentNumber <= removedElement) {
                currentNumber += removedElement;
            } else {
                currentNumber -= removedElement;
            }

         numbers.set(index, currentNumber);
        }
    }
}
