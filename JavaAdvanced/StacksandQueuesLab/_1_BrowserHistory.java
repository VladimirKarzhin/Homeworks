package JavaAdvanced.StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _1_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browserHistory = new ArrayDeque<>();

        String line = scanner.nextLine();

        while (!line.equals("Home")) {
            if (line.equals("back")) {
                if (browserHistory.size() == 1 || browserHistory.size() == 0) {
                    System.out.println("no previous URLs");
                } else {
                    browserHistory.pop();
                    System.out.println(browserHistory.peek());
                }
            } else {
                System.out.println(line);
                browserHistory.push(line);
            }

            line = scanner.nextLine();
        }
    }
}
