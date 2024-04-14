package lessons23.test6;

public class Main {
    public static void main(String[] args) {
        // нам надо отправить сообщение и зарегистрировать этот процесс сам по себе
        Messenger sender = new Messenger();

        ThreadMessenger thread1 = new ThreadMessenger("Hello", sender);
        thread1.setName("Поток 1");     // устанавливаем имя потока

        ThreadMessenger thread2 = new ThreadMessenger("Bye", sender);
        thread2.setName("Поток 2");     // устанавливаем имя потока

        thread1.start();
        thread2.start();        // пока что потоки отрабатываю как получится, может раньше 1 поток или второй - предсказать нельзя. ПОКА не синхронизирован метод sendMessage

        try {
            thread1.join();     // ничего не дало
            thread2.join();     // тоже не дало, потоки хаотичны. Надо синхронизировать метод sendMessage() !
        } catch (InterruptedException e) {
            System.out.println("Поток прерван: " + e);
        }

        System.out.println("Если выше по коду хоть к одному потоку thread применен метод join(), то эта запись, относящаяся к основному потоку (метод main)" +
                " выведется только после выполнения потоков thread1 и thread2.\nЕсли join() был применен ниже по коду или вообще не был применен, то эта запись " +
                "всегда выведется перед записями из других потоков. У всех потоков приоритет 5");


    }
}


class Messenger extends Thread{     // это класс для отправки сообщения
    public void sendMessage(String msg){        // этот метод и выполняет отправку сообщения. Синхронизируем synchronized работу этого метода.
        // То есть пока метод в потоке 1 полностью не отработает, на поток 2 не переключится
        System.out.println(Thread.currentThread().getName() + ", отправка сообщения: " + msg);   // выводит имя текущего потока

        try {
          Thread.sleep(500);        // задержка
        } catch (InterruptedException ex) {
            System.out.println("Поток прерван: " + ex);
        }

        System.out.println(Thread.currentThread().getName() + ", сообщение отправлено");
    }
}


class ThreadMessenger extends Thread {      // этот класс будет осуществлять функции потока
    private String msg;     // само сообщение
    Messenger sender;       // выбор мессенджера

    public ThreadMessenger(String msg, Messenger sender) {
        this.msg = msg;
        this.sender = sender;
    }

    @Override
    public void run() {
        synchronized (sender) {     // блок для синхронизации только части кода
            this.sender.sendMessage(this.msg);
        }
    }
}

























