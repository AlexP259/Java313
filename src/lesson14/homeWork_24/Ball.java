package lesson14.homeWork_24;

public class Ball extends Figure3d{
    private double radius;

    {
        this.setName("шар");
    }

    public Ball(double radius){
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public double volumeOfTheFigure() {
        return (4d / 3) * Math.PI * Math.pow(this.radius, 3);
    }

}
