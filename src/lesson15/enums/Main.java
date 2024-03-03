package lesson15.enums;

public class Main {
    public static void main(String[] args) {
        for (Seasons s : Seasons.values()) {
//            System.out.println(s);
            System.out.println(s.name());
        }
        int summersIndex = Seasons.SUMMER.ordinal();
        System.out.println(summersIndex);
    }
}

enum Seasons {
    WINTER("Зима"),     // public static final
    SUMMER("Лето"),
    SPRING("Весна"),
    AUTUMN("Осень");

    private String title;

    Seasons(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return "Seasons{title='" + this.title + "'}";
    }
}
