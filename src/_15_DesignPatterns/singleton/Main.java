package _15_DesignPatterns.singleton;

public class Main {
    public static void main(String[] args) {

        callSingleton();

//        callMultiton();


    }

    private static void callMultiton() {
        System.out.println(System.currentTimeMillis());
        SunMultitonExample sun1 = SunMultitonExample.getInstance();
        System.out.println(sun1);
        System.out.println(System.currentTimeMillis());

        SunMultitonExample sun2 = SunMultitonExample.getInstance();
        System.out.println(sun2);
        System.out.println(System.currentTimeMillis());

        SunMultitonExample sun3 = SunMultitonExample.getInstance();
        System.out.println(sun3);
        System.out.println(System.currentTimeMillis());

        SunMultitonExample sun4 = SunMultitonExample.getInstance();
        System.out.println(sun4);
        System.out.println(System.currentTimeMillis());


    }

    private static void callSingleton() {
        System.out.println(System.currentTimeMillis());
        SunSingletonExample instance = SunSingletonExample.getInstance();
        System.out.println(instance);

        System.out.println(System.currentTimeMillis());

        SunSingletonExample instance2 = SunSingletonExample.getInstance();
        System.out.println(instance2);
        System.out.println(System.currentTimeMillis());

        System.out.println(System.currentTimeMillis());

        SunSingletonExample instance3 = SunSingletonExample.getInstance();
        System.out.println(instance3);
        System.out.println(System.currentTimeMillis());
    }

}
