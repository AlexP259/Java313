package lesson13.area_box;

public class Box {
    private double width;
    private double height;


    Box(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getArea() {
        return this.width * this.height;
    }


    public double getHeight() {

        return height;
    }
    public double getWidth() {
        return width;
    }


    public void setHeight(int height) {
        if (height > 0)
            this.height = height;
    }
    public void setWidth(int width) {
        if (width > 0)
            this.width = width;
    }
}
