package lesson14.homeWork_24;

public class Cylinder extends Figure3d{
    private double radius, height;

    {
        this.setName("цилиндр");
    }

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double getRadius(){
        return this.radius;
    }
    public double getHeight(){
        return this.height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double volumeOfTheFigure() {
        return Math.PI * Math.pow(this.radius, 2) * this.height;
    }
}
