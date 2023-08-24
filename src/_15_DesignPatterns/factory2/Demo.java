package _15_DesignPatterns.factory2;

public class Demo {
    public static void main(String[] args) {


        CakeFactory chocolateCakeFactory = new ChocolateCakeFactory();
        CakeFactory strawberryCakeFactory = new StrawberryCakeFactory();
        CakeFactory whiteCakeFactory = new WhiteCakeFactory();

        Cake chocolateCake = chocolateCakeFactory.createCake();
        Cake strawberryCake = strawberryCakeFactory.createCake();
        Cake whiteCake = whiteCakeFactory.createCake();

        chocolateCake.prepare();
        chocolateCake.bake();
        chocolateCake.box();

        strawberryCake.prepare();
        strawberryCake.bake();
        strawberryCake.box();

        whiteCake.prepare();
        whiteCake.bake();
        whiteCake.box();



    }
}


