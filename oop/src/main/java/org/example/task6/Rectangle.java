package org.example.task6;

public class Rectangle extends Figure implements Drawable{
    private Point p1;
    private Point p2;

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public double area() {
        return Math.abs(p1.getX() - p2.getX()) * Math.abs(p1.getY() - p2.getY());
    }

    @Override
    public double perimeter() {
        return (Math.abs(p1.getX() - p2.getX()) + Math.abs(p1.getY() - p2.getY())) * 2;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован черный прямоугольник с координатами (" +
                p1.getX()  + ", " + p1.getY() +"), (" +
                p2.getX()  + ", " + p2.getY()+").");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован прямоугольник. Цвет: " + color.getCode() + ", координаты первой точки: (" +
                p1.getX()  + ", " + p1.getY() +"), координаты второй точки: (" +
                p2.getX()  + ", " + p2.getY()+").");
    }
}
