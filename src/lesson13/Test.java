package lesson13;

public class Test {
    public static void main(String[] args) {
        Line l1 = new Line();
//        l1.setId(6);
        System.out.println(l1.getId());
        System.out.println(l1.id);


//        l1.color = "red";
//        l1.width = 5;
//        l1.x1 = l1.x2 = 0;
//        l1.y1 = l1.y2 = 10;
//        l1.showProp();
//        l1.show();
//        Properties p = l1;
//        p.color = "yellow";
//        p.width = 1;
//        p.showProp();
//        p.show();     не отработает
//        p.x1 = 20;    нет доступа к дочерним методам и свойствам
//        l1.showId();
//        Object g1 = new Line();
//        Object g2 = new Triangle();
//        Object g3 = new Properties();

//        Line l1 = (Line) g1;
//        Line l2 = (Line) g2;    //  g2 не имеет отношения к Line, поэтому не сработает. ClassCastException
//        Triangle l2 = (Triangle) g2;

//        System.out.println(g1 instanceof Line);     //  true
//        System.out.println(g2 instanceof Line);     //  false
//
//        Line l11 = null, l22 = null;
//        if(g1 instanceof Line)
//            l11 = (Line) g1;
//
//        if(g2 instanceof Line)
//            l22 = (Line) g2;
    }
}




class Properties {
    int width;
    String color;
    final private int id = 1;

    public Properties() {
        System.out.println("Конструктор Properties");
    }

    public Properties(int width, String color) {
        this.width = width;
        this.color = color;
        System.out.println("Конструктор Properties(width, color)");

    }

    void show() {
        System.out.println("Ширина - " + this.width + "px, цвет - " + this.color);
    }

    public int getId() {
        return id;
    }

//    final protected void setId(int id) {
//        if (id > 0){
//            this.id = id;
//        }
//    }
}




class Line extends Properties {
    double x1, y1;
    double x2, y2;
    int id = 2;

    public Line() {
        super(0, "orange");
        System.out.println("Конструктор Line");
    }

    @Override
    void show() {
        super.show();
        System.out.println("Координаты линии - x1: " + this.x1 + ", x2: " + this.x2 + ", y1: " + this.y1 + ", y2: " + this.y2);
    }

    void showId(){
        System.out.println("id = " + this.getId() + ", родительский id = " + super.getId());
    }
}




class Triangle {
    double x1, y1;
    double x2, y2;
    double x3, y3;

}