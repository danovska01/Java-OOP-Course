package _15_DesignPatterns.factory2;

public class StrawberryCakeFactory implements CakeFactory{
    @Override
    public Cake createCake() {
        return new StrawberryCake();
    }
}
