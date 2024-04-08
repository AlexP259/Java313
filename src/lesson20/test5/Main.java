package lesson20.test5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.addAll(Arrays.asList(
                new Phone("Pixel 2",500),
                new Phone("iPhone X",600),
                new Phone("Nokia",150),
                new Phone("iPhone 8",450)
        ));

        Map<String, Integer> phoneMap = phones.stream().collect(Collectors.toMap(p -> p.getName(), t -> t.getPrice()));
        phoneMap.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println(phoneMap.getClass().getSimpleName());

//        Phone min = phones.stream().min(Phone::compare).get();
//        Phone max = phones.stream().max(Phone::compare).get();
//        System.out.printf("MIN: name = %s, price = %d%n", min.getName(), min.getPrice());
//        System.out.printf("MAX: name = %s, price = %d%n", max.getName(), max.getPrice());
    }
}

class Phone{
    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    public static int compare(Phone p1, Phone p2){
        if (p1.price > p2.price) {
            return 1;
        }
        return -1;
    }

}
