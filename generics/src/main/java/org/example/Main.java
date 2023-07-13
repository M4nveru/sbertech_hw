package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    }

    //task 1
    public static <T extends Number> int countEvenNumberElements(Collection<T> collection) {
        int count = 0;
        for (T element : collection
        ) {
            if (element.intValue() % 2 == 0) count++;
        }
        return count;
    }

    // task 2
    public static <T> Collection<? extends T> swapElements(Collection<? extends T> collection, int index1, int index2) {

        List<T> listOfElements = new ArrayList<T>(collection);
        if (listOfElements.isEmpty()
                || index1 < 0 || index2 < 0
                || index1 >= listOfElements.size() || index2 >= listOfElements.size()
        ) throw new IndexOutOfBoundsException("Invalid index");

        T element1 = listOfElements.get(index1);
        T element2 = listOfElements.get(index2);

        listOfElements.set(index2, element1);
        listOfElements.set(index1, element2);

        collection.clear();
        collection.addAll((Collection) listOfElements);
        return collection;
    }
}
