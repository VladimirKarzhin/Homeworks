package Fundamentals.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _9_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                      //повтаряме: въвеждаме команди
                      //стоп: въведем "end"
                      //продължаваме: въведеното != "end"
        String command = scanner.nextLine();
                 //command != "end" -> валидна команда
        while (!command.equals("end")) {
            //1. command = "swap 1 2".split(" ") -> ["swap", "1", "2"]
            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber = numbers[index1];
                int secondIndexNumber = numbers[index2];

                numbers [index1] = secondIndexNumber;
                numbers [index2] = firstIndexNumber;

            } else if (command.contains("multiply")) {
                //2. command = "multiply 0 1".split(" ") -> ["multiply", "0", "1"]
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber = numbers[index1];
                int secondIndexNumber = numbers[index2];

                int product = firstIndexNumber * secondIndexNumber;
                numbers [index1] = product;

            } else if (command.contains("decrease")) {
                //3. command = "decrease"
                //обхождаме всички елементи ->  -1
                for (int index = 0; index <= numbers.length - 1; index++) {
                    numbers[index]--;
                }

            }
            command = scanner.nextLine();
        }
        System.out.println(Arrays.toString(numbers)
                .replace("[", "")
                .replace("]", ""));

             //отпечатваме числата разделени с ", "
             //1-ви начин

    }
}