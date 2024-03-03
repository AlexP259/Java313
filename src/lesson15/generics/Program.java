package lesson15.generics;

public class Program {
    public static void main(String[] args) {
//        Point<Integer> pt = new Point<Integer>();     // в старых версиях писать так
        Point<Integer, String> pt = new Point<>(1,2, "point_1");
//        pt.x = 10;
//        pt.y = 20;
        System.out.println(pt.getId() + ": " + pt.getX() + " " + pt.getY());

        Point<Double, Integer> pt2 = new Point<>(10.5,20.6, 1);
//        pt2.x = 15.7;
//        pt2.y = 30.5;
        System.out.println(pt2.getId() + ": " + pt2.getX() + " " + pt2.getY());
    }
}


class Point<T, V>{     //  обобщенный или параметризованный класс
    private T x, y;
    private V id;


    public Point(T x, T y, V id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }


    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public V getId() {
        return id;
    }
}
