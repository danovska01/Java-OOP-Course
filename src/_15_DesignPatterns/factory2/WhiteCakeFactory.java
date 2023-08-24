package _15_DesignPatterns.factory2;

public class WhiteCakeFactory implements CakeFactory{
    @Override
    public Cake createCake() {
        return new WhiteCake();

    }




}
