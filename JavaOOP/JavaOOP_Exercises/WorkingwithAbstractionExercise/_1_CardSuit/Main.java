package JavaOOP.JavaOOP_Exercises.WorkingwithAbstractionExercise._1_CardSuit;

public class Main {
    public static void main(String[] args) {

        CardSuits1[] cardSuit = CardSuits1.values();
        System.out.println("Card Suits:");

        for (CardSuits1 cardSuits : cardSuit) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuits.ordinal(), cardSuits.name());
        }
    }
}
