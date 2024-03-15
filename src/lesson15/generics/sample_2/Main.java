package lesson15.generics.sample_2;

public class Main {
    public static void main(String[] args) {
//        Point<Double> pt = new Point<>(1.2,2.5);
//        double max = pt.getMax();
//        System.out.println(max);


        Point<Integer> pt = new Point<>(1,2);
        Point<Double> pt2 = new Point<>(1.2,2.5);


        System.out.println(pt.equalsPoint(pt2));
    }
}


class Point<T extends Number>{
    private T x, y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

     boolean equalsPoint(Point<?> pt){
        return this.x.doubleValue() == pt.x.doubleValue() &&
                this.y.doubleValue() == pt.y.doubleValue();
    }

    double getMax(){
        double xd = this.x.doubleValue();
        double yd = this.y.doubleValue();
        return (xd < yd) ? yd : xd;
    }
}