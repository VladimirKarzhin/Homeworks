package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class _6_ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        switch (country) {
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Argentina":
            case "Mexico":
            case "Spain":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;

        }
    }
}

