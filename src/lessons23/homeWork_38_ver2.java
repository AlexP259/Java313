package lessons23;

public class homeWork_38_ver2 {
    public static void main(String[] args) {
        Thread threadR = new Thread(new TrafficLight2(Colors2.RED));
        Thread threadY = new Thread(new TrafficLight2(Colors2.YELLOW));
        Thread threadG = new Thread(new TrafficLight2(Colors2.GREEN));

        threadR.start();
        threadY.start();
        threadG.start();
    }
}


enum Colors2 {
    RED,
    YELLOW,
    GREEN;
}


class TrafficLight2 implements Runnable {
    private Colors2 color;

    public TrafficLight2(Colors2 color) {
        this.color = color;
    }

    @Override
    public synchronized void run() {
        while (true) {
            try {
                wait();
                System.out.println(color);
                Thread.sleep(color != Colors2.YELLOW ? 3000 : 1000);
            } catch (InterruptedException e) {
                System.out.println("Поток прерван: " + e);
            }
            notify();
        }
    }
}