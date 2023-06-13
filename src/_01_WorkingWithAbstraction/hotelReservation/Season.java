package _01_WorkingWithAbstraction.hotelReservation;

public enum Season {


    Autumn (1),
    Spring (2),
    Winter (3),
    Summer (4);



    private int multiplier;

    public int getMultiplier() {
        return multiplier;
    }

    Season(int multiplier) {
        this.multiplier = multiplier;
    }









}
