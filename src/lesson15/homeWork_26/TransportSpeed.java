package lesson15.homeWork_26;

public enum TransportSpeed {
    CAR(65),
    TRUCK(55),
    AIRPLANE(600),
    TRAIN(70),
    BOAT(22);

    private final int speed;

    TransportSpeed(int speed) {
        this.speed = speed;
    }

    public void speedInfo(){
        System.out.printf("%1$s типичная скорость составляет %2$d миль в час%n", this.name(), this.speed);
    }
}
