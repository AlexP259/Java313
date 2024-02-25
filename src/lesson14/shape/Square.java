package lesson14.shape;

public class Square extends Shape{
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getPerimetr() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public void info() {
        System.out.printf("=== Квадрат ===%nСторона: %d%nЦвет: %s%nПлощадь: %.1f%nПериметр: %.1f%n", side,
                getColor(), getArea(), getPerimetr());
        draw();
    }
}
