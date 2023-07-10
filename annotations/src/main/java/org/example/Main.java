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
    @WatchAnnotation(watch = 12, priority = 1, description = "")
    public int method(@NonNull Boolean b, @NonNull Integer i, @NonNull String s){
        return i;
    }
}

@DayOfWeekAnnotation(Day = 2)
class Tuesday extends Monday{
    @WatchAnnotation(watch = 15, priority = 1, description = "ok")
    @WatchAnnotation(watch = 15, priority = 2, description = "wait")
    public boolean method2(@NonNull Boolean b, @NonNull Integer i, @NonNull String s){
        return b;
    }

}


