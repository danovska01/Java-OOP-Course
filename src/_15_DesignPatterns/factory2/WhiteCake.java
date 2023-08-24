package _15_DesignPatterns.factory2;

public class WhiteCake extends Cake {

    public WhiteCake(){

    }
    @Override
    public void prepare() {
        System.out.println("Prepare the white cake! ");

    }

    @Override
    public void bake() {
        System.out.println("Bake the white cake!");
    }

    @Override
    public void box() {
        System.out.println("Box the white cake!");
    }


}
