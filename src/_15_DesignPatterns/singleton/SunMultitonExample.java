package _15_DesignPatterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class SunMultitonExample {

    private static final int MAX_SUNS = 2;
    private static List<SunMultitonExample> instances = new ArrayList<>();

    private int temperature;

    private SunMultitonExample() {
        temperature = (int) (Math.random() * 2000) + 6000;
    }

    public static synchronized SunMultitonExample getInstance() {
        if (instances.size() < MAX_SUNS) {
            SunMultitonExample sun = new SunMultitonExample();
            instances.add(sun);
            return sun;
        }
//        return instances.get(instances.size() - 1);
//        Return the last sun instance if limit reached

//        return a random sun from the list
        int randomIndex = (int) (Math.random() * instances.size());
        return instances.get(randomIndex);
    }

    public int getTemperature() {
        return temperature;
    }
}
