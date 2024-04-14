package lessons23.test4;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {        // задать поток через анонимный класс
            @Override
            public void run() {
                for (int i = 1; i <= 5 ; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Поток 1, итерация: " + i);
                }
            }
        });

        // задать поток через анонимный класс
        Thread thread2 = new Thread(() -> {     // через лямбду мы тоже обращаемся к run() интерфейса Runnable. Это функциональный интерфейс
            for (int i = 1; i <= 5 ; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Поток 2, итерация: " + i);
            }
        });

        thread1.start();
        thread2.start();
    }
}
