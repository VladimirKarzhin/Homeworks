package ForLoopLab;

import java.util.Scanner;

public class _4_EvenPowersof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // nachalo 0 (0 e validna stepen)
        // krai n
        // promqna 1

//        for (int i = 0; i <= n; i++) {
//            if ( i % 2 == 0) {
//            System.out.println(Math.pow(2, i));
//            }

        for (int i = 0; i <= n; i += 2) {
            System.out.println(Math.pow(2, i));

        }

    }
}
