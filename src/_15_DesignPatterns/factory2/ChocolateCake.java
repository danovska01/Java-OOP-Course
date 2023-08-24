package _15_DesignPatterns.factory2;

public class ChocolateCake extends Cake{
    public ChocolateCake() {
        // Initialize chocolate cake properties
    }

    @Override
    public void prepare() {
        System.out.println("Prepare chocolate! ");
    }

    @Override
    public void bake() {
        System.out.println("Bake chocolate! ");
    }

    @Override
    public void box() {
        System.out.println("Box chocolate! ");
    }
}
