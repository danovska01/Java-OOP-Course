package _11_Reflection;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class _01_Reflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class reflection = ReflectionExample.class;

        System.out.println(reflection);

        Class superClass= reflection.getSuperclass();
        System.out.println(superClass);

        Class[]interfaces= reflection.getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);

        Object reflectionObject = reflection.getDeclaredConstructor().newInstance();
        System.out.println(reflectionObject);


    }
}
