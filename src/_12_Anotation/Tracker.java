package _12_Anotation;

import java.lang.reflect.Method;

public class Tracker {
    //In this example, the Tracker class contains the printMethodsByAuthor method that takes a Class parameter
    // and prints out the methods annotated with Author. The main method demonstrates how to use the printMethodsByAuthor method with the Tracker class.
    public static void printMethodsByAuthor(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Author.class)) {
                Author author = method.getAnnotation(Author.class);
                System.out.println("Method: " + method.getName() + " - Author: " + author.name());
            }
        }
    }

    // Example method with the Author annotation
    @Author(name = "John Doe")
    public void someMethod() {

    }
    @Author(name = "Doe john")
    public void someMethod2() {
    }

    public static void main(String[] args) {
        Tracker.printMethodsByAuthor(Tracker.class);
    }
}
