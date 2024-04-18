package practics.my_practics.my_practics_5_multithreading;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        MyThread1 t1 = new MyThread1();
//        t1.setDaemon(true);     // пометили поток как поток демона. Когда все потоки "не демоны" закончат свою работу,
//        // этот поток-демон будет завершен виртуальной машиной
//        t1.setPriority(Thread.MIN_PRIORITY);    // понизили приоритет потока, он стал обращаться к процессору реже и
//        // печатает заметно меньше букв "А". THREAD_PRIORITY_HIGHEST и THREAD_PRIORITY_TIME_CRITICAL - самые высокие
//        // приоритеты в ОС windows. С 6 версии JAVA приоритету Thread.MAX_PRIORITY стал соответствовать только THREAD_PRIORITY_HIGHEST
//        t1.start();
//        int laps = 10000;
//        while (laps > 0) {
//            System.out.print(".");
//            laps--;
//        }


//        int v = new Random().nextInt(10);
//        MyThread2 t2 = new MyThread2(v);
//        t2.setDaemon(true);
//        v = new Random().nextInt(10);
//        MyThread2 t3 = new MyThread2(v);
//        t3.setDaemon(true);
//        t2.start();
//        t3.start();

//        while (t2.isAlive() || t3.isAlive()) {}     // это плохой способ ожидания завершения потоков-демонов, т.к. этот
//        // цикл тратит ресурсы процессора

//        try {
//            Thread.sleep(5000);         // еще один плохой способ дать время потокам-демонам на их выполнение. Теперь
//            // основной поток не тратит ресурсы процессора, но мы не можем точно предсказать, сколько времени надо
//            // потокам-демонам
//        } catch (InterruptedException ex) {
//        }

//        try {
//            t2.join();          // это правильный способ ожидания завершения потока. Метод join() приостанавливает выполнение
//            // того потока, в котором он вызван, до тех пор, пока не завершится работа потока, от имени которого вызван
//            // join(). Можем в скобках ставить лимит ожидания в миллисекундах
//            t3.join();
//        } catch (InterruptedException e) {
//        }


        int v = new Random().nextInt(10,20);
        MyThread3 r4 = new MyThread3(v);
        Thread t4 = new Thread(r4);
        t4.setDaemon(true);
        v = new Random().nextInt(10,20);
        MyThread3 r5 = new MyThread3(v);
        Thread t5 = new Thread(r5);
        t5.setDaemon(true);
        t4.start();
        t5.start();
        t5.interrupt();     // просим поток прекратить работу, тем самым отмечая некий флаг в самом потоке. Поток может
        // проверить флаг и остановиться, если это прописано в нем
        try {
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
        }
    }
}


//class MyThread1 extends Thread {    // это потоковый класс, т.к. наследуется от Thread и переопределяет run()
//    @Override
//    public void run() {     // это потоковый метод. Каждый поток должен иметь его. Поток активен и выполняется, пока
//        // не завершен его потоковый метод
//        while (true) {
//            System.out.print("A");
//        }
//    }
//}


//class MyThread2 extends Thread {
//    private int value;
//
//    public MyThread2(int v) {
//        this.value = v;
//    }
//
//    @Override
//    public void run() {
//        while (this.value >= 0) {
//            System.out.println("*** The thread " + Thread.currentThread().getName() + " started with " + this.value);
//            while (this.value >= 0) {
//                System.out.println("From " + Thread.currentThread().getName() + " value = " + this.value);
//                this.value -= 1;
//                try {
//                    Thread.sleep(300);
//                } catch (InterruptedException ex) {
//                }
//            }
//            System.out.println("*** The thread " + Thread.currentThread().getName() + " has finished");
//        }
//    }
//}


class MyThread3 implements Runnable {
    private int value;

    public MyThread3(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        int limit = this.value / 2;  // минимальное количество итераций, которые поток должен выполнить
        System.out.println("*** The thread " + Thread.currentThread().getName() + " started with " + this.value);
        while (this.value >= 0) {
            System.out.println("From " + Thread.currentThread().getName() + " value = " + this.value + " this thread is " +
                    "interrupted: " + Thread.currentThread().isInterrupted());
            this.value -= 1;
            if (this.value <= limit && Thread.currentThread().isInterrupted()) {     // реакция на interrupt(). На каждой
                // итерации проверяем, выполнено ли минимальное число итераций и не вызвался ли для потока метод interrupt()
                // Если был вызван метод interrupt() и при этом был выставлен флаг внутри потока, то метод isInterrupted()
                // вернет true. При этом поток войдет в тело if, напишет в консоль сообщение «*** The thread is interrupted» и завершит работу
                System.out.println("*** The thread " + Thread.currentThread().getName() + " is interrupted");
                return; // выход из метода run(), следовательно поток прерывается (завершается)
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("*** The thread " + Thread.currentThread().getName() + " has finished");
    }
}





























