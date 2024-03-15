package lesson15.generics.sample_8;

public class Main {
    public static void main(String[] args) {
        Point2D<Integer> p1 = new Point2D<>(1,50,70);
        Point3D<Float> p2 = new Point3D<>(2,10f,20f,30f);

        System.out.println(p1);
        System.out.println(p2);
    }
}


class PointProp{
    int id;

    public PointProp(int id) {
        this.id = id;
    }
}


class Point2D<T2D> extends PointProp{
    T2D x, y;

    public Point2D(int id, T2D x, T2D y) {
        super(id);
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Координаты элемента с id " + this.id + ": (" + this.x + ", " + this.y + ")";
    }
}


class Point3D<T3D> extends PointProp{
    T3D x, y, z;

    public Point3D(int id, T3D x, T3D y, T3D z) {
        super(id);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Координаты элемента с id " + this.id + ": (" + this.x + ", " + this.y +  ", " + this.z + ")";
    }
}