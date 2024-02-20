package lesson13.sample.show_rect;

public class RectBorder extends Rect{
    private String border;


    public RectBorder(int width, int height, String border) {
        super(width, height);
        this.border = border;
    }

    @Override
    void showRect() {
        super.showRect();
        System.out.println("\nРамка: " + this.border + "\n");
    }
}
