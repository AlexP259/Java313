package lesson14.shape;

public class Triangle extends Shape{
    private int side;

    public Triangle(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getPerimetr() {
        return side * 3;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3)/4 * Math.pow(side, 2);
    }

    @Override
    public void draw() {
        for (int i = 0; i < side; i++) {
            for (int j = i; j < side; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }
    }

    @Override
    public void info() {
        System.out.printf("=== Равносторонний треугольник ===%nСторона: %d%nЦвет: %s%nПлощадь: %.1f%n" +
                "Периметр: %.1f%n", side, getColor(), getArea(), getPerimetr());
        draw();
    }
}
