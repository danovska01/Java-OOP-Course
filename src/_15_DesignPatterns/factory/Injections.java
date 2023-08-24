package _15_DesignPatterns.factory;

public class Injections implements IMedicine{
    @Override
    public void heal() {
        System.out.println("Injections prescribed.");
    }
}
