package org.example.task2;

public class CircleExample {
    int radius;
    String color;

    public CircleExample(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter(){
        return 2* Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area='" + this.area() + '\'' +
                ", perimeter='" + this.perimeter() + '\'' +
                '}';
    }
}

