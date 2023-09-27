package Fundamentals.DataTypeandVariablesExercise;
import java.util.Scanner;
public class _10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int startPower = power;
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int countPoked = 0;

        while (power >= distance) {
            power -= distance;
            countPoked++;

            if (power == startPower / 2) {
                if (exhaustionFactor != 0) {
                    power /= exhaustionFactor;
                }
            }
        }
        System.out.println(power);
        System.out.println(countPoked);
    }
}
