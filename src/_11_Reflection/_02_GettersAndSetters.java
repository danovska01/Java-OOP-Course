package _11_Reflection;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;

public class _02_GettersAndSetters {
    public static void main(String[] args) {
        //Using reflection to get all Reflection methods.
        // Then prepare an algorithm that will recognize,
        // which methods are getters and setters. Sort each collection alphabetically by methods names.

        Class clazz = ReflectionExample.class;

        Field []fields = clazz.getDeclaredFields();
        Arrays.stream(fields)
                .filter(field -> !Modifier.isPrivate(field.getModifiers()))
                .forEach(field -> System.out.printf("%s%n", field.getName()));



        // Filter and sort getter methods alphabetically
        Method[] methods = clazz.getDeclaredMethods();
        Arrays.stream(methods)
                .filter(method -> method.getName().startsWith("get") && method.getParameterCount()==0)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(method -> System.out.printf("%s will return %s%n", method.getName(), method.getReturnType()));


        // Filter and sort setter methods alphabetically
        Arrays.stream(methods)
                .filter(method -> method.getName().startsWith("set") && method.getParameterCount()==1)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(method -> System.out.printf("%s will return %s%n", method.getName(), method.getParameterTypes()[0].getName()));

    }
}
