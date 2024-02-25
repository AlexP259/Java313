package lesson14.shape;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimetr() {
        return (width + height) * 2;
    }

    @Override
    public double getArea() {
        return width + height;
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public void info() {
        System.out.printf("=== Прямоугольник ===%nШирина: %d%nВысота: %d%nЦвет: %s%nПлощадь: " +
                "%.1f%nПериметр: %.1f%n", width, height, getColor(), getArea(), getPerimetr());
        draw();
    }
}
