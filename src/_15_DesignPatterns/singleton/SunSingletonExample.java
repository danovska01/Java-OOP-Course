package _15_DesignPatterns.singleton;

public class SunSingletonExample {
    private int temperature;
    private static SunSingletonExample theOnlySun = null;

    private SunSingletonExample (){
        temperature = (int)(Math.random()*2000) + 6000;
    }

    static SunSingletonExample getInstance(){
        if(theOnlySun==null){
            theOnlySun=new SunSingletonExample();
        }
        return theOnlySun;
    }
}
