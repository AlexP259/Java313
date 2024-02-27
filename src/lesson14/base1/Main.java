package lesson14.base1;

public class Main {
    public static void main(String[] args) {
        Line line = new Line(10,20,30,40);
//        line.info();
//        line.setCoord(50,60,70,80);
//        line.info();
//        GeomInterface.showInterval();
//        line.draw();
        System.out.println("Площадь линии: " + line.setSquare());
    }
}

interface MathGeom{
    default double setSquare(){
        return 0;
    }
}

interface GeomInterface{
    int MIN_COORD = 0;          // public static final
    int MAX_COORD = 1000;

    static void showInterval(){
        System.out.println("[" + MIN_COORD + "; " + MAX_COORD + "]");
    }
}

//class InterfaceGroup{
//    private interface Interface_1{
//        void method_1();
//    }
//    interface Interface_2 extends Interface_1{
//        void method_2();
//    }
//}
//
//
//class ReleaseInterface implements InterfaceGroup.Interface_2{
//    public void method_1() {   }
//    public void method_2() {   }
//}


class Line implements GeomInterface, MathGeom{
    int x1, x2, y1, y2;

    public Line(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    void draw() {
        System.out.println("Рисование линии");
        GeomInterface.showInterval();
    }

    private boolean isCheck(int x) {
        return MIN_COORD <= x && x <= MAX_COORD;
    }

    void setCoord(int x1, int y1, int x2, int y2) {
        if (isCheck(x1) && isCheck(y1) && isCheck(x2) && isCheck(y2)) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }
    }

    public void info(){
        System.out.println("Координаты линии: " + this.x1 + " " + this.x2 + " " + this.y1 + " " + this.y2 + "\n");

    }
}
