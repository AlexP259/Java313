package lesson14.shape;

public abstract class Shape {
    private String color;

    public Shape(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getPerimetr();

    public abstract double getArea();

    public abstract void draw();

    public abstract void info();


}
