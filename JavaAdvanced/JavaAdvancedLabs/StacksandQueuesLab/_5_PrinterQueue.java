package JavaAdvanced.JavaAdvancedLabs.StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _5_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        String line = scanner.nextLine();

        while (!line.equals("print")) {

            if (line.equals("cancel")) {
                if (printerQueue.size() == 0) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled" + " " + printerQueue.peek());
                    printerQueue.pop();
                }
            } else {
                printerQueue.offer(line);
            }
            line = scanner.nextLine();
        }

        while (!printerQueue.isEmpty()) {
            System.out.println(printerQueue.pop());
        }
    }
}
