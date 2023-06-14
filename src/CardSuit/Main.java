package CardSuit;

public class Main {
    public static void main(String[] args) {
        CardSuit[] cardSuits = CardSuit.values();

        System.out.println("Card Suits:");
        for (CardSuit cardSuit : cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuit.ordinal(), cardSuit);
        }
    }
}
