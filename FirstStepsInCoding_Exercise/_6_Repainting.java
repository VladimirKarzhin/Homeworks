package FirstStepsInCoding_Exercise;
import java.util.Scanner;
public class _6_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine()) + 2;
        int paint = Integer.parseInt(scanner.nextLine());
        int razr = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double nylonPrice = nylon * 1.50;
        double paintPrice = paint * 14.5;
        paintPrice = paintPrice + (paintPrice * 10 / 100);
        double razrPrice = razr * 5;
        double sum = nylonPrice + paintPrice + razrPrice + 0.4;
        double workers = hours * (sum * 30.0 / 100);
        double result = sum + workers;
        System.out.println(result);}}
