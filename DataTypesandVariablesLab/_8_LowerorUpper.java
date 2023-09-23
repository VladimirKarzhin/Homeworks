import java.util.Scanner;
public class _8_LowerorUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);
        if (Character.isUpperCase(character)) {
            System.out.println("upper-case");
        } else if (Character.isLowerCase(character)) {
            System.out.println("lower-case");
        }
    }
}