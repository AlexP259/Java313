package lesson13.sample.show_rect;

public class RectFon extends Rect {
    private String fon;

    public RectFon(int width, int height, String fon) {
        super(width, height);
        this.fon = fon;
    }

    @Override
    void showRect() {
        super.showRect();
        System.out.println("\nФон: " + this.fon + "\n");
    }
}
