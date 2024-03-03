package lesson15.homeWork_26;

public class Main {
    public static void main(String[] args) {
        System.out.println("Скорости транспортных средств:");
        for (int i = 0; i < TransportSpeed.values().length; i++) {
            TransportSpeed.values()[i].speedInfo();
        }
    }
}
