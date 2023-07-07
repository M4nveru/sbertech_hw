package org.example;

import java.lang.annotation.*;

// task 2
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface WatchAnnotations{
    WatchAnnotation[] value() default {};
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(WatchAnnotations.class)
public @interface WatchAnnotation {
    int watch();
    int priority();
    String description();
}