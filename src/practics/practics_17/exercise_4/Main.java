package practics.practics_17.exercise_4;

public class Main {
    public static void main(String[] args) {
        Rectangle a = new Rectangle(3,4);
        System.out.printf("Площадь прямоугольника со сторонами %d и %d равна %.2f%n", a.getSideA(), a.getSideB(),
                a.area());
        Circle b = new Circle(4);
        System.out.printf("Площадь круга с радиусом %d равна %.2f%n", b.getRadius(), b.area());
        RightTriangle c = new RightTriangle(3,4);
        System.out.printf("Площадь прямоугольного треугольника со сторонами %d и %d равна %.2f%n", c.getSideA(),
                c.getSideB(), c.area());
        Trapezoid d = new Trapezoid(3,4, 7);
        System.out.printf("Площадь трапеции со сторонами %d, %d и высотой %d равна %.2f%n", d.getSideA(), d.getSideB(),
                d.getHeight(), d.area());
    }
}
