package lesson15.generics.sample_2;

public class Main {
    public static void main(String[] args) {
        Point<Integer> pt = new Point<>(1,2);

        double max = pt.getMax();
        System.out.println(max);
    }
}


class Point<T extends Number>{
    public T x, y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    double getMax(){
        double xd = this.x.doubleValue();
        double yd = this.y.doubleValue();
        return (xd < yd) ? yd : xd;
    }
}
