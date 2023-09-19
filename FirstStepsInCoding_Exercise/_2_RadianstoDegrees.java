package FirstStepsInCoding_Exercise;
import java.util.Scanner;
public class _2_RadianstoDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Radians = Double.parseDouble(scanner.nextLine());
        double Degrees = Radians * 180 / Math.PI;
        System.out.println(Degrees);}}
