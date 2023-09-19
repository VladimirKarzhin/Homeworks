package ForLoolExercise;

import java.util.Scanner;

public class _2_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            // sum += num;
            sum = sum + num;

            if(num > max) {
                max = num;
            }
        }

        sum = sum - max;

        if(sum == max) {
            System.out.printf("Yes%nSum = %d", sum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sum - max));
        }
    }
}

