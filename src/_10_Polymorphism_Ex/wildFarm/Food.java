package _10_Polymorphism_Ex.wildFarm;

public abstract class Food {
    private int quantity = 0;

    public Food(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
