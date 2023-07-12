package org.example.example;

import lombok.NonNull;

public class Main {
    public static void main(String[] args) {}
    //task 1
    @DayOfWeekAnnotation(Day = 1)
    class DayOfWeek {
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
    class Monday extends DayOfWeek {
        private Boolean b;
        private Integer i;
        private String s;

        public Monday(Boolean b, Integer i, String s) {
            this.b = b;
            this.i = i;
            this.s = s;
        }

        @WatchAnnotation(watch = 12, priority = 1, description = "")
        public DataContainer method(@NonNull Boolean b, @NonNull Integer i, @NonNull String s) {
            DataContainer dataContainer = new DataContainer(b,i,s);
            System.out.println("method otrabotal");
            return dataContainer;
        }

        @WatchAnnotation(watch = 13, priority = 2, description = "")
        public DataContainer method3(@NonNull Boolean b, @NonNull Integer i, @NonNull String s) {
            DataContainer dataContainer = new DataContainer(false,404,"not founded");
            System.out.println("method 3 otrabotal");
            return dataContainer;
        }
    }

    @DayOfWeekAnnotation(Day = 2)
    class Tuesday extends DayOfWeek {
        private final Boolean b;
        private final Integer i;
        private final String s;

        public Tuesday(Boolean b, Integer i, String s) {
            this.b = b;
            this.i = i;
            this.s = s;
        }

        @WatchAnnotation(watch = 15, priority = 1, description = "ok")
        @WatchAnnotation(watch = 15, priority = 2, description = "wait")
        public DataContainer method2(@NonNull Boolean b, @NonNull Integer i, @NonNull String s) {
            DataContainer dataContainer = new DataContainer(b,i,s);
            System.out.println("method 2 otrabotal");
            return dataContainer;
        }
    }
}

