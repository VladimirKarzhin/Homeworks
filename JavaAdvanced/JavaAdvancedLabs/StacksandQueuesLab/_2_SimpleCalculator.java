package JavaAdvanced.JavaAdvancedLabs.StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _2_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> calculator = new ArrayDeque<>();

        String[] mathString = scanner.nextLine().split("\\s+");

        calculator.addAll(Arrays.asList(mathString));

        while (calculator.size() > 1) {
            int firstNum = Integer.parseInt(calculator.pop());
            String operator = calculator.pop();
            int secondNum = Integer.parseInt(calculator.pop());

            if (operator.equals("+")) {
                int result = firstNum + secondNum;
                String stringResult = String.valueOf(result);
                calculator.push(stringResult);
            } else if (operator.equals("-")) {
                int result = firstNum - secondNum;
                String stringResult = String.valueOf(result);
                calculator.push(stringResult);
            }
        }
        System.out.println(calculator.peek());
    }
}
