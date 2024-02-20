package lesson13.sample.show_rect;

public class Main {
    public static void main(String[] args) {
        RectFon shape1 = new RectFon(400,200,"yellow");
        shape1.showRect();
        Rect shape2 = new RectBorder(400,200,"1px solid red");
        shape2.showRect();
    }
}


