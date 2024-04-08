package lesson20.test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int sum = Stream.of("Язык", "программирования", "Java")
                .map(s -> s.length())   // [4, 16, 4]
                .reduce(0, Integer::sum);   // ноль как инициализация некой переменной
        System.out.println(sum);



//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.addAll(Arrays.asList(6,7,1,2,3,4,5,8));
//        Optional<Integer> result = numbers.stream().reduce((x, y) -> x + y);
//        System.out.println(result.get());
//
////        Stream<Integer> num = Stream.of(5,4,7,8,6,1,2,3);
////        Optional<Integer> res = num.reduce((x, y) -> x + y);
////        System.out.println(res.get());
//
//        Stream<String> wordStream = Stream.of("Язык", "программирования", "Java");
////        Optional<String> sentence = wordStream.reduce((x, y) -> x + " " + y);
//        String sentence = wordStream.reduce("Результат:", (x, y) -> x + " " + y); // identity - все равно выведется
//        System.out.println(sentence);


//        Optional<Integer> min = numbers.stream().min(Integer::compare); // compare сортирует
//        Optional<Integer> max = numbers.stream().max(Integer::compare); // compare сортирует
//        if (min.isPresent() || max.isPresent()) {
//            System.out.println(min.get());
//            System.out.println(max.get());
//        } else {
//            System.out.println("Список пуст");
//        }


//        Stream<String> people1 = Stream.of("Виктор", "Екатерина", "Дмитрий");
//        Stream<String> people2 = Stream.of("Александр", "Виктория", "Дмитрий");
//
//        Stream.concat(people1, people2).distinct().forEach(n -> System.out.println(n)); //
//        Stream.concat(people1, people2).distinct().forEach(n -> System.out.println(n)); // distinct удалит дубликаты
//        Stream.concat(people1, people2).forEach(n -> System.out.println(n));


//        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
//        numbers.sorted().dropWhile(n -> n < 0).forEach(n -> System.out.println(n)); // dropWhile - берет элементы пока они НЕ СООТВЕТСТВУЮТ условию
//        numbers.sorted().takeWhile(n -> n < 0).forEach(n -> System.out.println(n));
//        numbers.takeWhile(n -> n < 0).forEach(n -> System.out.println(n));    // будет выбирать элементы, пока условие дает true
//        numbers.filter(n -> n < 0).forEach(n -> System.out.println(n));     // фильтр по условию возьмет все элементы
    }
}
