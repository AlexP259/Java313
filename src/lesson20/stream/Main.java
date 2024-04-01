package lesson20.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //        String[] aarr = new String[]{"Сочи", "Москва", "Калининград"};
//        Arrays.stream(aarr).forEach(s -> System.out.println(s));

//        Stream<String> cityStream = Arrays.stream(new String[]{"Сочи", "Москва", "Калининград"});   // Создаем поток данных из обычного массива
//        cityStream.forEach(s -> System.out.print(s + " "));     // cityStream.forEach(System.out::print); - Передается ссылка на статический метод
//        System.out.println();

        // под примитивные типы есть свои стримы - IntStream, LongStream, DoubleStream
        // Для boolean, byte, short и char специальных стримов не придумали, но вместо них можно использовать IntStream,
        // а затем приводить к нужному типу
//        IntStream intStream = Arrays.stream(new int[]{1,2,3,4,5,6,7});
//        intStream.forEach(i -> System.out.print(i + " "));
//        System.out.println();
//
//        LongStream longStream = Arrays.stream(new long[]{100,200,33523,4647547,5235326,624125236,732141});
//        longStream.forEach(i -> System.out.print(i + " "));
//        System.out.println();
//        /*........................................ Другой синтаксис записи ...........................................*/
//
//        DoubleStream doubleStream = DoubleStream.of(3.4, 4.5, 6.2, 4.5, 7.3, 15.2);


//        String[] arguments = {"one", "first", "two", "second", "three", "third", "four", "fourth", "five", "fifth"};
//        Map<String, String> aMap = new LinkedHashMap<>(arguments.length / 2);
//        for (int i = 0; i < arguments.length; i+=2) {
//            aMap.put(arguments[i], arguments[i+1]);
////            System.out.println(arguments[i] + ": " + aMap.get(arguments[i]));
//        }
//        aMap.forEach((k, v) -> System.out.printf("%s: %s%n", k, v));


//        Stream<String> cityStream = Stream.of("Сочи", "Москва", "Калининград");
//        cityStream.filter(s -> s.length() >= 6).forEach(System.out::println);  // Метод фильтр не может изменить исходный вариант. Может только вернуть элементы, которые выдали true


//        int[] nums = {-5, 0, 1, 2, 3, -4, 4, -3, -2, -1, 5};
//        int count = 0;
//        for (int i : nums) {
//            if (i > 0) count++;
//        }
//        System.out.println(count);  // 5


//        long count = IntStream.of(-5, 0, 1, 2, 3, -4, 4, -3, -2, -1, 5)
//                .filter(w -> w > 0)
//                .count();
//        System.out.println(count);


        List<String> colors = Arrays.asList("Красный", "Кремовый", "Синий", "Зеленый", "Коричневый");
        System.out.println("Исходный список цветов: " + colors);
        char start = 'К';
        long ctr = colors.stream().filter(s -> s.startsWith(String.valueOf(start))).count();
        System.out.println("\nКоличество цветов, которые начинаются с '" + start + "': " + ctr);

        char start1 = 'С';
        int ctr1 = (int) colors.stream().filter(s -> s.startsWith(String.valueOf(start1))).count();
        System.out.println("\nКоличество цветов, которые начинаются с '" + start1 + "': " + ctr1);

    }
}












