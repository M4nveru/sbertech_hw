package org.example.task6;

public class Circle extends Figure implements Drawable{
    private final Point center;
    private final int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован черный круг с координатами центра (" +
                center.getX()  + ", " + center.getY() +") и радиусом" + radius);
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован круг. Цвет: " + color.getCode() + ", координаты центра: (" +
                center.getX()  + ", " + center.getY() +"), радиус:" + radius);
    }
}
