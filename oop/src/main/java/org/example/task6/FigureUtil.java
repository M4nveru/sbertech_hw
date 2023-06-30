package org.example.task6;

public class FigureUtil{

    private FigureUtil() {
    }

    static double area(Figure figure){
        return figure.area();
    }

    static double perimeter(Figure figure){
        return figure.perimeter();
    }

    static void draw(Drawable figure){
        figure.draw();
    }

    static void draw(Drawable figure, Color color){
        figure.draw(color);
    }
}
