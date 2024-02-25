package lesson14.homeWork_24;

public class Main {
    public static void main(String[] args) {
        Figure3d a = new Ball(4.5);
        a.displayInfo();

        Figure3d b = new Cylinder(2, 2);
        b.displayInfo();

        Figure3d c = new Pyramid(5,12,13,200);
        c.displayInfo();
    }
}
