package JavaOOP.JavaOOP_Exercises.WorkingwithAbstractionExercise._3_CardsWithPower;

public class Card {
    private final CardRanks cardRank;
    private final CardSuits cardSuit;

    public Card(CardRanks cardRank, CardSuits cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    public int calculatePower() {
        return this.cardSuit.getValue() + this.cardRank.getValue();
    }
}
