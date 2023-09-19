package FirstStepsInCoding_Exercise;
import java.util.Scanner;
public class _8_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pricePerYear = Integer.parseInt(scanner.nextLine());
        double trainers = pricePerYear - (pricePerYear * 40 / 100.0);
        double suit = trainers - ( trainers * 20 / 100);
        double ball = suit / 4;
        double acc = ball / 5;
        double sum = trainers + suit + ball + acc + pricePerYear;
        System.out.println(sum);}}
