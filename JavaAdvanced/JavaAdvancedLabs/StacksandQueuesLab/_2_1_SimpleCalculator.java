package JavaAdvanced.JavaAdvancedLabs.StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _2_1_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String line = scanner.nextLine();
        String[] arr = line.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            String calculatorParts = arr[i];
            stack.push(calculatorParts);
        }

        while (stack.size() > 1) {
            Integer firstNum = Integer.parseInt(stack.pop());
            String comparator = stack.pop();
            Integer secondNum = Integer.parseInt(stack.pop());

            switch (comparator) {
                case "+":
                 int result1 = firstNum + secondNum;
                 stack.push(String.valueOf(result1));
                    break;
                case "-":
                    int result2 = firstNum - secondNum;
                    stack.push(String.valueOf(result2));
                    break;
            }
        }
        System.out.println(stack.pop());
    }
}
