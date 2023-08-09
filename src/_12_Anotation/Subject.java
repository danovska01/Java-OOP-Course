package _12_Anotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Subject {
    String[] categories();

    //Create annotation Subject with a String[] element called categories, that:
    //    • Should be available at runtime
    //    • Can be placed only on types


    // In this code:
    //
    //    @Retention(RetentionPolicy.RUNTIME) specifies that the annotation should be available at runtime.
    //    @Target(ElementType.TYPE) restricts the annotation to be placed only on types (classes, interfaces, enums, and annotations).
    //    String[] categories(); defines the single element named categories of type String[].
}
