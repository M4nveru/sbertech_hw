package org.example.task6;

public class Square extends Figure implements Drawable{
    private Point p1;
    private Point p2;

    public Square(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public double area() {
        return (Math.pow(p2.getX() - p1.getX(),2) + Math.pow(p2.getY() - p1.getY(),2))/2;
    }

    @Override
    public double perimeter() {
        return 4 * Math.sqrt(area());
    }

    @Override
    public void draw() {
        System.out.println("Нарисован черный квадрат с координатами (" +
                p1.getX()  + ", " + p1.getY() +"), (" +
                p2.getX()  + ", " + p2.getY()+").");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован квадрат. Цвет: " + color.getCode() + ", координаты первой точки: (" +
                p1.getX()  + ", " + p1.getY() +"), координаты второй точки: (" +
                p2.getX()  + ", " + p2.getY()+").");
    }
}
