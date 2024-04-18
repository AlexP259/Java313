package practics.my_practics.my_practics_5_multithreading;

import lesson11.Test;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestSynchro {
    public static String line;

    public static void main(String[] args) {
        Object locker = new Object();   // синхронизируемый объект используется для синхронизации потоков в Java
        MyReader reader = new MyReader("src\\practics\\my_practics\\my_practics_5_multithreading\\" +
                "testSynchroLines.txt", locker);
        MyWriter writer = new MyWriter("src\\practics\\my_practics\\my_practics_5_multithreading\\" +
                "testSynchroLines_Out.txt", locker);
        Thread t1 = new Thread(reader);
        Thread t2 = new Thread(writer);
        t1.setDaemon(true);
        t2.setDaemon(true);
        t2.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Logger.getLogger(TestSynchro.class.getName()).log(Level.SEVERE, null, e);
        }
        t1.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Logger.getLogger(TestSynchro.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}


class MyReader implements Runnable {
    Object locker;
    FileReader fr = null;

    public MyReader(String fileForRead, Object locker) {
        try {
            this.fr = new FileReader(fileForRead);
            this.locker = locker;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Logger.getLogger(TestSynchro.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void run() {
        int lineCounter = 0;
        String str = "";
        BufferedReader br = new BufferedReader(fr);
        try {
            while ((str = br.readLine()) != null) {
                System.out.println("Reader: " + str);
                if ((lineCounter++) % 2 == 0) {
                    synchronized (locker) {
                        TestSynchro.line = str;
                        locker.notify();  // выполняется активация потока писателя,
                        locker.wait();  // после чего поток читателя засыпает.
                    }
                }
            }
            synchronized (locker) {
                TestSynchro.line = "exit";
                locker.notify();
                locker.wait();
            }
        } catch (IOException e) {
            e.printStackTrace();
            Logger.getLogger(TestSynchro.class.getName()).log(Level.SEVERE, null, e);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Logger.getLogger(TestSynchro.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
                Logger.getLogger(TestSynchro.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}


class MyWriter implements Runnable {
    Object locker;
    FileWriter fw = null;

    public MyWriter(String FileForWrite, Object locker) {
        try {
            this.fw = new FileWriter(FileForWrite, true);
            this.locker = locker;
        } catch (IOException e) {
            e.printStackTrace();
            Logger.getLogger(TestSynchro.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void run() {
        synchronized (locker) {
            while (TestSynchro.line != "exit") {
                try {
                    locker.wait();
                    if (TestSynchro.line != "exit") {
                        fw.write(TestSynchro.line + System.getProperty("line.separator"));
                    }
                    System.out.println("*** Written line: " + TestSynchro.line);
                    locker.notify();
                } catch (IOException e) {
                    e.printStackTrace();
                    Logger.getLogger(TestSynchro.class.getName()).log(Level.SEVERE, null, e);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Logger.getLogger(TestSynchro.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
        try {
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
            Logger.getLogger(TestSynchro.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}




















