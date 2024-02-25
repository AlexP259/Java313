package lesson14.base;

public class Base {
    public static void main(String[] args) {
        final int N = 3;
        Shape[] geom = new Shape[N];
        geom[0] = new Line(5,"red",1,2,3,4);
        geom[1] = new Rectangle(2,"yellow",10);
        geom[2] = new Triangle(3,"green",10);

        for (Shape g: geom) {
            g.draw();
        }

    }
}

abstract class Shape{
    private int width;
    private String color;


    public Shape(int width, String color) {
        this.width = width;
        this.color = color;
    }


    abstract void draw();


    public int getWidth() {
        return width;
    }
    public String getColor() {
        return color;
    }
}



class Line extends Shape{
    private int x1, x2, y1, y2;

    public Line(int width, String color, int x1, int x2, int y1, int y2) {
        super(width, color);
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    void draw() {
        System.out.println("Рисование линии");
    }
}



class Rectangle extends Shape{
    private int height;

    public Rectangle(int width, String color, int height) {
        super(width, color);
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Рисование прямоугольника");
    }

//    public int getSquare() {
//        return ;
//    }
}

class Triangle extends Shape{
    private int height;

    public Triangle(int width, String color, int height) {
        super(width, color);
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Рисование треугольника");
    }
}