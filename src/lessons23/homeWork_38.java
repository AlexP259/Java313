package lessons23;

public class homeWork_38 {
    public static void main(String[] args) {
        Thread thread = new Thread(new TrafficLight());
        thread.start();
    }
}


enum Colors {
    RED,
    YELLOW,
    GREEN;
}


class TrafficLight implements Runnable {
    @Override
    public void run() {
        while (true) {
            for (Colors color : Colors.values()) {
                System.out.println(color);
                try {
                    Thread.sleep(color != Colors.YELLOW ? 3000 : 1000);
                } catch (InterruptedException e){
                    System.out.println("Поток прерван: " + e);
                }
            }
        }
    }
}