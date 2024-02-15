package lesson13.shape;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20, "red");
        rect.setWidth(30);
        System.out.println("Ширина: " + rect.getWidth());
        System.out.println("Длина: " + rect.getLength());
        System.out.println("Цвет: " + rect.getColor());
        System.out.println("Площадь: " + rect.area());
    }


}
