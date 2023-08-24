package _15_DesignPatterns.factory2;

public class ChocolateCakeFactory implements CakeFactory{
    @Override
    public Cake createCake() {
        return new ChocolateCake();
    }
}
