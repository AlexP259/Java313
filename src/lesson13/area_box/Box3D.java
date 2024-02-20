package lesson13.area_box;

public class Box3D extends Box {
    private double depth;


    Box3D(double width, double height, double depth) {
        super(width, height);
        this.depth = depth;
    }


    public String get3DInfo() {
        return "Объект Box3D (ширина = " + this.getWidth() + ", высота = " +
                this.getHeight() + ", глубина = " + this.getDepth() + ")";
    }

    public double get3DArea(){
        double area2D = getArea();
        System.out.print("Объём: ");
        return area2D * getDepth();
    }


    public double getDepth() {
        return depth;
    }

    public void setDepth(double length) {
        if (depth > 0)
            this.depth = length;
    }
}
