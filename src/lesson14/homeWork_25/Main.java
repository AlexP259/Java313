package lesson14.homeWork_25;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(100,150);
        rect.info();
        rect.resizeWidth(250);
        rect.resizeHeight(300);
        rect.info();
    }
}
