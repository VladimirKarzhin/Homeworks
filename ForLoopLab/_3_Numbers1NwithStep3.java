package ForLoopLab;

import java.util.Scanner;

public class _3_Numbers1NwithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // nachalo 1
        // krai n
        // promqna 3
        for (int i = 1; i <= n ; i+=3) {
            System.out.println(i);

        }
    }
}
