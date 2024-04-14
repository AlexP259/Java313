package lessons23.test3;

public class Main {
    public static void main(String[] args) {
        Concurrency thread1 = new Concurrency(1);
        Concurrency thread2 = new Concurrency(2);

        thread1.start();
        thread2.start();

    }
}


class Concurrency implements Runnable {      // наш класс реализует интерфейс Runnable, т.е. наш класс сам становится потоком
    private int num;        // номер потока
    private Thread t;

    public Concurrency(int num) {
        this.num = num;
    }

    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

    @Override
    public void run() {          // метод run() определяет точку входа в поток. Этот метод будет вызван методом start(), который запускает поток
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Цикл " + this.num + ", итерация: " + i);
        }
    }
}