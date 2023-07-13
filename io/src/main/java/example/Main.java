package example;

import lombok.NonNull;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {
    private static final String ROOT_DIRECTORY = "./log";

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
            logger("method otrabotal");
            return dataContainer;
        }

        @WatchAnnotation(watch = 13, priority = 2, description = "")
        public DataContainer method3(@NonNull Boolean b, @NonNull Integer i, @NonNull String s) {
            DataContainer dataContainer = new DataContainer(false,404,"not founded");
            logger("method 3 otrabotal");
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
            logger("method 2 otrabotal");
            return dataContainer;
        }
    }

    // task 3
    private static void logger(String str){
        Date date = new Date();
        String filePath = ROOT_DIRECTORY + String.format("/logger_%d_%d_%d.txt", date.getHours(), date.getMinutes(), date.getSeconds());
        File file = new File(filePath);

        if (file.exists()){
            try {
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write("\n" + str);
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            try {
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write(str);
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // task 4
        File logFolder = new File(ROOT_DIRECTORY);
        File[] files = logFolder.listFiles();
        if (files.length > 2){
            for (File f : files) {
                f.delete();
            }
        }
    }
}

