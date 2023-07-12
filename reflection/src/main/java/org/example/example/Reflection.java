package org.example.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Reflection {
    // task 1
    public static List<Object> createInstance(int day, Boolean b, Integer i, String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {

        List<Class> classes = new ArrayList<>(List.of(Class.forName("org.example.example.Main").getDeclaredClasses()));
        List<Object> objects = new ArrayList<>();

        for (Class claz : classes
        ) {
            if (!claz.getName().equals("org.example.example.Main$DayOfWeek")) {
                Annotation anno = claz.getAnnotation(DayOfWeekAnnotation.class);
                if (anno instanceof DayOfWeekAnnotation && ((DayOfWeekAnnotation) anno).Day() == day) {
                    objects.add(claz.getDeclaredConstructor(Main.class, Boolean.class, Integer.class, String.class).newInstance(new Main(), b, i, s));
                }
            }
        }
        return objects;
    }

    // task 2,3
    public static void callMethods(List<Object> objectList) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Comparator<Map.Entry<Integer, Method>> entryComparator = Comparator.comparing(Map.Entry::getKey);
        for (Object object : objectList
        ) {

            Class cl = object.getClass();
            List<Map.Entry<Integer, Method>> pairList = new ArrayList<>();

            for (Method method : cl.getDeclaredMethods()
            ) {

                Annotation[] list = method.getAnnotationsByType(WatchAnnotation.class);

                for (Annotation a : list
                ) {
                    pairList.add(new AbstractMap.SimpleEntry<>(((WatchAnnotation) a).priority(), method));
                }
            }
            Collections.sort(pairList, entryComparator);

            for (Map.Entry<Integer, Method> in : pairList
            ) {
                Method m = in.getValue();
                DataContainer dc = (DataContainer) m.invoke(object, true, 123, "go go go");

                System.out.println(dc.getClass().getMethod("toString").invoke(dc));
            }
        }

    }
}
