package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.example.Main.countEvenNumberElements;
import static org.example.Main.swapElements;

public class MainTest {

    @Test
    public void countElementsTest() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        int result1 = countEvenNumberElements(list);
        Assert.assertEquals(1, result1);

        List<Double> list2 = new ArrayList<>(Arrays.asList(2.0, 3.5, 3.0, 7.5, 4.0, 12.0));
        int result2 = countEvenNumberElements(list2);
        Assert.assertEquals(3, result2);
    }

    @Test
    public void swapElementsTest() {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Collection<Integer> newCollection = (Collection<Integer>) swapElements(collection, 0,1);

        Assert.assertEquals(new ArrayList<Integer>(Arrays.asList(2,1,3,4,5)), newCollection);
    }


}