package lesson13.homeWork_23;

class Main {
    public static void main(String[] args) {
        Figure[] array = new Figure[3];
        array[0] = new Figure(10, 20);
        array[1] = new Rectangle(10, 20);
        array[2] = new Triangle(10, 20);

        for (int i = 0; i < 3; i++) {
            array[i].printArea();
        }
    }
}
