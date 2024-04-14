package lessons23;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Цикл 1, итерация: " + i);
        }

        for (int i = 1; i <= 5 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Цикл 2, итерация: " + i);
        }
    }
}
