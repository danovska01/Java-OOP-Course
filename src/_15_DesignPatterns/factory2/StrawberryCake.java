package _15_DesignPatterns.factory2;

public class StrawberryCake extends Cake{

    public StrawberryCake() {
        // Initialize strawberry cake properties
    }

    @Override
    public void prepare() {
        System.out.println("Prepare strawberry cake! ");
    }

    @Override
    public void bake() {
        System.out.println("Bake strawberry cake! ");
    }

    @Override
    public void box() {
        System.out.println("Box strawberry cake! ");
    }
}
