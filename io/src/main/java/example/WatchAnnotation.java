package example;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(WatchAnnotations.class)
public @interface WatchAnnotation {
    int watch();
    int priority();
    String description();
}