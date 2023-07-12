package org.example.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// task 2
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface WatchAnnotations{
    WatchAnnotation[] value() default {};
}
