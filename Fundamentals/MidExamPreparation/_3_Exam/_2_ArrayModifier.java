package Fundamentals.MidExamPreparation._3_Exam;

import java.util.Scanner;

    public class _2_ArrayModifier {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] intAsString = scanner.nextLine().split(" ");
            int[] numbers = new int[intAsString.length];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(intAsString[i]);
            }

            String command = scanner.nextLine();

            while (!command.equals("end")) {

                String [] commandParts = command.split(" ");

                    if (command.contains("swap")){
                        int index1 = Integer.parseInt(commandParts[1]);
                        int index2 = Integer.parseInt(commandParts[2]);
                        swap(numbers, index1, index2);

                    } else if (command.contains("multiply")) {
                        int index1 = Integer.parseInt(commandParts[1]);
                        int index2 = Integer.parseInt(commandParts[2]);
                        multiply(numbers, index1, index2);

                    }
                    else if (command.contains("decrease")) {
                        for (int i = 0; i < numbers.length; i++) {
                            numbers[i] = numbers[i] - 1;
                        }

                    }
                command = scanner.nextLine();
                }

            printArray(numbers, ", ");
            }
        public static int[] multiply(int[] arr, int index1, int index2) {
            int first = arr[index1] * arr[index2];
            arr[index1] = first;
            return arr;
        }

        public static int[] swap(int[] arr, int index1, int index2) {

            int firstNum = arr[index2];
            int secondNum = arr[index1];
            arr[index1] = firstNum;
            arr[index2] = secondNum;
            return arr;
        }

        public static void printArray(int[] array, String separator) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(separator);
                }
            }
            System.out.println();
        }
    }


