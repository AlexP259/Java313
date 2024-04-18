package practics.my_practics.my_practics_5_multithreading;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main2 implements Serializable {
    public  static int counter = 0;
    public static Object locker = new Object();     // монитор должен быть именно объектом. Пока поток работает с ним
    // другой поток не может выполнять с ним действия
    public static void main(String[] args) {
        int limit = 100000;
        IncThread t6 = new IncThread(limit);
        DecThread t7 = new DecThread(limit);
        t6.start();
        t7.start();
        try {
            t6.join();
            t7.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("counter = " + counter);
    }
}


class IncThread extends Thread{
    int limit;

    public IncThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 0; i < limit; i++) {
            synchronized (Main2.locker) {
                Main2.counter++;
            }
        }
    }
}


class DecThread extends Thread{
    int limit;

    public DecThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 0; i < limit; i++) {
            synchronized (Main2.locker) {
                Main2.counter--;
            }
        }
    }
}




















