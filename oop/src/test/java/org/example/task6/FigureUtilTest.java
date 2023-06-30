package org.example.task6;

import org.junit.Test;

import static org.junit.Assert.*;

public class FigureUtilTest {
    Figure circle = new Circle(new Point(0,0), 5);
    Figure rect = new Rectangle(new Point(0,0), new Point(2,3));
    Figure sq = new Square(new Point(0,0), new Point(2,2));
    Figure tr = new Triangle(new Point(-2,3), new Point(4,3), new Point(2,5));

    @Test
    public void area() {
        assertEquals(Math.PI*25,circle.area(),0.001);
        assertEquals(4,sq.area(),0.001);
    }

    @Test
    public void perimeter() {
        assertEquals(10, rect.perimeter(),0.001);
        assertEquals(13.3, tr.perimeter(), 0.1);
    }

}