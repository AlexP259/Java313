package lesson20.test4;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> people1 = Stream.of("Виктор", "Екатерина", "Дмитрий");
        Stream<String> people2 = Stream.of("Александр", "Виктория", "Дмитрий");

        Stream.concat(people1, people2).distinct().forEach(n -> System.out.println(n)); //
//        Stream.concat(people1, people2).distinct().forEach(n -> System.out.println(n)); // distinct удалит дубликаты
//        Stream.concat(people1, people2).forEach(n -> System.out.println(n));


//        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
//        numbers.sorted().dropWhile(n -> n < 0).forEach(n -> System.out.println(n)); // dropWhile - берет элементы пока они НЕ СООТВЕТСТВУЮТ условию
//        numbers.sorted().takeWhile(n -> n < 0).forEach(n -> System.out.println(n));
//        numbers.takeWhile(n -> n < 0).forEach(n -> System.out.println(n));    // будет выбирать элементы, пока условие дает true
//        numbers.filter(n -> n < 0).forEach(n -> System.out.println(n));     // фильтр по условию возьмет все элементы
    }
}
