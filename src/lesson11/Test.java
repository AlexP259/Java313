package lesson11;

import static java.lang.System.*;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        System.out.println("p1.x:" + p1.x + ", p1.y: " + p1.y);
        System.out.println("p2.x:" + p2.x + ", p2.y: " + p2.y);
        System.out.println(Point.getCount());
        Point.setCount(20);
        System.out.println(Point.getCount());
    }
}

class Point{
    private static int count;
    int x;
    int y;

    static {        // Блок для присваивания начальных значений статическим переменным. Это более правильно
        count = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
    }

    public static int getCount() {   // в статическом методе мы имеем доступ только к статическим свойствам
        return count;
    }

    public static void setCount(int count) {
        Point.count = count;
    }
}
