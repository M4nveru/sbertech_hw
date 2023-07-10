package org.example.task6;

public class Triangle extends Figure implements Drawable{

    private final Point p1;
    private final Point p2;
    private final Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public double area() {
        return 0.5 * Math.abs((p2.getX()-p1.getX())*(p3.getY()-p1.getY())-(p3.getX()-p1.getX())*(p2.getY()-p1.getY()));
    }

    @Override
    public double perimeter() {
        return Math.sqrt(Math.pow(p2.getX()-p1.getX(),2)+Math.pow(p2.getY()-p1.getY(),2)) +
                Math.sqrt(Math.pow(p3.getX()-p2.getX(),2)+Math.pow(p3.getY()-p2.getY(),2)) +
                Math.sqrt(Math.pow(p3.getX()-p1.getX(),2)+Math.pow(p3.getY()-p1.getY(),2));
    }

    @Override
    public void draw() {
        System.out.println("Нарисован черный треугольник с координатами (" +
                p1.getX()  + ", " + p1.getY() +"), (" +
                p2.getX()  + ", " + p2.getY() +"), (" +
                p3.getX()  + ", " + p3.getY()+").");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован квадрат. Цвет: " + color.getCode() + ", координаты первой точки: (" +
                p1.getX()  + ", " + p1.getY() +
                "), координаты второй точки: (" +
                p2.getX()  + ", " + p2.getY() +
                "), координаты третьей точки: (" +
                p3.getX()  + ", " + p3.getY()+").");
    }
}
