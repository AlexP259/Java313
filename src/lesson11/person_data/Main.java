package lesson11.person_data;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Юля", "23.05.1986", "45-46-98", "Россия", "Москва", "Чистопрудный бульвар");
        h1.printInfo();
        h1.setName("Юлия");
        h1.setBirthday("26.05.1985");
        System.out.println(h1.getBirthday());
        System.out.println(h1.getName());
        h1.printInfo();
    }
}
