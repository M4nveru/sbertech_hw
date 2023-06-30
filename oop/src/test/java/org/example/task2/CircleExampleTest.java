package org.example.task2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleExampleTest {

    @Test
    public void area() {
        CircleExample circle = new CircleExample(10,"red");
        double result = circle.area();
        Assert.assertEquals(result,Math.PI*100, 0.001);
    }

    @Test
    public void perimeter() {
        CircleExample circle = new CircleExample(25,"black");
        double result = circle.perimeter();
        Assert.assertEquals(result, Math.PI*50,0.001);
    }
}