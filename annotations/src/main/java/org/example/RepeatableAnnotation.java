package org.example;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RepeatedAnnotations {
    RepeatableAnnotation[] value() default {};
}

@Repeatable(RepeatedAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RepeatableAnnotation {
    boolean boo();
    String description();
    int value();
}
