package _11_Reflection;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;

public class _03_HighQualityMistakes {
    public static void main(String[] args) {

        Class clazz = ReflectionExample.class;

        // Check and print access modifier mistakes for fields
        Field[] fields = clazz.getDeclaredFields();
        Arrays.stream(fields)
                .sorted(Comparator.comparing(Field::getName))
                .forEach(field -> {
                    if (!Modifier.isPrivate(field.getModifiers())) {
                        System.out.printf("%s must be private!%n", field.getName());
                    }
                });

        // Check and print access modifier mistakes for getters
        Method[] methods = clazz.getDeclaredMethods();
        Arrays.stream(methods)
                .filter(method -> method.getName().startsWith("get") && method.getParameterCount() == 0)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(method -> {
                    if (!Modifier.isPublic(method.getModifiers())) {
                        System.out.printf("%s have to be public!%n", method.getName());
                    }
                });

        // Check and print access modifier mistakes for setters
        Arrays.stream(methods)
                .filter(method -> method.getName().startsWith("set") && method.getParameterCount() == 1)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(method -> {
                    if (!Modifier.isPrivate(method.getModifiers())) {
                        System.out.printf("%s have to be private!%n", method.getName());
                    }
                });
    }
}
