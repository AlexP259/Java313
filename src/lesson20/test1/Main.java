package lesson20.test1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of("A", "B", "C").flatMap(s -> Stream.of(s, s.toLowerCase())).forEach(System.out::print);

//        Map<String, Integer> ages = new HashMap<>();
//        ages.put("Виктор", 30);
//        ages.put("Марина", 25);
//        ages.put("Роман", 40);
//        ages.put("Сергей", 35);
//
//        int result = ages.entrySet().stream().filter(entry -> entry.getValue() > 30).mapToInt(entry -> entry.getValue()).sum();
//        System.out.println(result);
    }
}
