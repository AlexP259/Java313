package lessons23.test1;

public class Main {
    public static void main(String[] args) {
        Concurrency thread1 = new Concurrency(1);
        Concurrency thread2 = new Concurrency(2);

        thread1.start();        // у метода start() внутри прописано, что он запустит run()
        thread2.start();

    }
}


class Concurrency extends Thread {      // наш класс расширяет класс Threat, т.е. наш класс сам становится потоком после вызова метода start()
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