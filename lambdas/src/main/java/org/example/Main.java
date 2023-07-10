package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        // task 3
        List<Sounding> list = new ArrayList<>();

        list.add(new Cat());
        list.add(new Dog());
        list.add(new Duck());
        list.add(new Pig());
        list.add(new Bear());

        // task 5
        Sounding sounding = new Sounding() {
            @Override
            public void sound() {
                System.out.println("anonimous sound");
            }
        };
        list.add(sounding);

        // task 6
        list.add(() -> {
            System.out.println("lambda sound");
        });

        // task 7
        list.add(System.out::println);
        list.add(Clazz::printSomething);

        // task 4
        for (Sounding obj : list) {
            obj.sound();
        }

        // task 8
        list.forEach(Sounding::sound);
    }
}
