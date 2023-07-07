package org.example;

import lombok.NonNull;

public class Main {
    public static void main(String[] args) {}
}

//task 1
@DayOfWeekAnnotation(Day = 1)
class Monday{
}

//task 2
class CustomClass{
    @WatchAnnotation(watch = 10, priority = 1, description = "ok")
    @WatchAnnotation(watch = 10, priority = 2, description = "wait")
    public static void tt(){
        System.out.println("something");
    }
}

//task 4,5,6
class SecondMonday extends Monday{
    @RepeatableAnnotation(boo = false, description = "not true statement", value = 404)
    public int method(@NonNull Boolean b, @NonNull Integer i){
        return i;
    }
}

@DayOfWeekAnnotation(Day = 2)
class Tuesday extends Monday{
    @RepeatableAnnotation(boo = true, description = "not true", value = 1)
    @RepeatableAnnotation(boo = false, description = "true", value = 0)
    public boolean method2(@NonNull Boolean b, @NonNull double d, @NonNull String s){
        return b;
    }

}


