package org.example;

import java.util.ArrayList;
import java.util.List;
import java.lang.Object;


public class Main {
    public static void main(String[] args) {

        List<Sounding> list = new ArrayList<>();

        list.add(new Cat());
        list.add(new Dog());
        list.add(new Duck());
        list.add(new Pig());
        list.add(new Bear());



        Sounding sounding = new Sounding() {
            @Override
            public void sound() {
                System.out.println("anonimous sound");
            }
        };
        list.add(sounding);

        list.add(() -> {
            System.out.println("lambda sound");
        });

        list.add(System.out::println);
        list.add(Clazz::printSomething);

        for (Sounding obj:list){
            obj.sound();
        }

        list.forEach(Sounding::sound);
    }
}
