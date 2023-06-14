package CardsWithPower;

public enum CardSuit {

    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);
    private int power;

    public int getPower() {
        return power;
    }

    CardSuit(int power) {
        this.power = power;
    }




}
