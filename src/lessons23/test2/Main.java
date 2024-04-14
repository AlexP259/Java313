package lessons23.test2;

public class Main {
    public static void main(String[] args) {
        Concurrency concurrency1 = new Concurrency(1);
        Concurrency concurrency2 = new Concurrency(2);

        Thread thread1 = new Thread(concurrency1);
        Thread thread2 = new Thread(concurrency2);

        thread1.start();
        thread2.start();
    }
}


class Concurrency implements Runnable{      // наш класс реализует интерфейс Runnable, т.е. наш класс сам становится потоком
    private int num;        // номер потока

    public Concurrency(int num) {
        this.num = num;
    }

    @Override
    public void run() {          // метод run() определяет точку входа в поток. Этот метод будет вызван методом start(), который запускает поток
        for (int i = 1; i <= 5 ; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Цикл " + this.num + ", итерация: " + i);
        }
    }
}