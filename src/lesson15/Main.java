package lesson15;

public class Main {


    public static void main(String[] args) {
        for (Seasons s : Seasons.values()) {
            System.out.println(s);
        }
        Seasons arg = Seasons.SPRING;
        switch (arg) {
            case WINTER:
                System.out.println("Сейчас зима");
                break;
            case SUMMER:
                System.out.println("Сейчас лето");
                break;
            case SPRING:
                System.out.println("Сейчас весна");
                break;
            case AUTUMN:
                System.out.println("Сейчас осень");
                break;
        }
        System.out.println(Seasons.WINTER);


    }
}

enum Seasons {
    /* public static final. для отображения блока с константами должны быть созданы соответствующие конструкторы.
    WINTER,SUMMER,SPRING,AUTUMN, каждая из этих констант является объектом типа Seasons */

    WINTER("зима"),
    SUMMER,
    SPRING,
    AUTUMN;


    Seasons(String a) {
    }
    Seasons() {
    }


}