package practics.my_practics.my_practics_5_multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main3 {
    public static void main(String[] args) {
        MyResource counter = new MyResource();
        Thread t1 = new MyThread(counter);
        Thread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Logger.getLogger(Main3.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Counter = " + counter.getCounter());        // верный результат - 160400
    }
}


class MyResource {
    long counter;

    public synchronized void add (long value) {     // Синхронизировали метод add.
        this.counter += value;
    }

    public long getCounter() {
        return counter;
    }
}


class MyThread extends Thread {
    protected MyResource counter = null;

    public MyThread(MyResource counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 400; i++) {
            counter.add(i);
        }
    }
}





































