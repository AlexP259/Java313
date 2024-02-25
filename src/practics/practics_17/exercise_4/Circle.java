package practics.practics_17.exercise_4;

public class Circle extends Figure{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
