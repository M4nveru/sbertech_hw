package org.example;

import java.lang.annotation.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

// task 1
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface DayOfWeekAnnotation {
    public int Day ();
}
