package example;

import java.lang.annotation.*;

// task 1
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DayOfWeekAnnotation {
    public int Day();
}
