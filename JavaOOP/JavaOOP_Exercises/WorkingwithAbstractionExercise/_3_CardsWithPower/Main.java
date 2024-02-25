package JavaOOP.JavaOOP_Exercises.WorkingwithAbstractionExercise._3_CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine();
        String suit = scanner.nextLine();

        Card card = new Card(CardRanks.valueOf(rank), CardSuits.valueOf(suit));

        System.out.printf("Card name: %s of %s; Card power: %d", rank, suit, card.calculatePower());

    }
}
