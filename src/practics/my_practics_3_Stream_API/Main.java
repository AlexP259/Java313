package practics.my_practics_3_Stream_API;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Мы создали класс Person, а также класс Data. Дата создает экземпляр списка ArrayList, заполняет его
        // инстансами класса Person и через статический метод getPersons мы запрашиваем этот список в метод main

        List<Person> persons = Data.getPersons();

        // stream() - мы создаем поток. Далее надо применять методы.  Методы потоков делятся на 2 категории:
        // "конвейерные" и "терминальные"
        // 1) Конвейерные методы позволяют производить какие-то действия с потоком, например, применять какие-то методы к
        // КАЖДОМУ элементу этого потока, что-то изменять в данных или фильтровать данные. После применения
        // конвейерного метода, данные останутся в состоянии потока! Что бы вернуть их в нормальное состояние нужны
        // терминальные методы
        // 2) Терминальные - возвращают данные из состояния потока. Можно применить только 1 такой метод для потока

        /*.............................................. Терминальные .............................................*/
        /*................................................ forEach ................................................*/
        // выполняет действие для каждого элемента в потоке, возвращает void
//        Stream<Person> personStream = Stream.of(persons.toArray(new Person[0]));
//        personStream.forEach(System.out::println);

        /*................................................ collect ................................................*/
//        Stream<Person> personStream = persons.stream();
//        Set<Person> personSet = personStream.collect(Collectors.toCollection(HashSet::new));
//        personSet.forEach(System.out::println);

        /*................................................ reduce .................................................*/
        // reduce(T identity, BinaryOperator accumulator) — преобразовывает все элементы стрима в один объект
        // (посчитать сумму всех элементов, либо найти минимальный элемент), cперва берётся объект identity и первый
        // элемент стрима, применяется функция accumulator и identity становится её результатом. Затем всё продолжается
        // для остальных элементов. Короче, последовательно выполняет действие с объектами

//        Stream<Integer> intStream = Stream.of(1,2,5);  // ЗДЕСЬ СУММА - 8
////        // Если не указываем исходного значения в методе reduce, то результат храним в Optional
//        Optional<Integer> result = intStream.reduce((x, y) -> (x + y) + 2);  // ЗДЕСЬ СУММА - 12, т.к. первое действие (1 + 2) + 2
////        // Если указываем исходное значение в reduce, то результат храним в том же типе данных. Тут
//////        int result = intStream.reduce(0, (x, y) -> (x + y) + 2);  // ЗДЕСЬ СУММА - 14, т.к. первое действие (0 + 1) + 2, по итогу будет на 1 действие больше
//        System.out.println(result);
//
//        // Теперь всё то же самое, но вместо Stream использую класс IntStream
//        IntStream intStream1 = IntStream.of(1,2,5);
//        OptionalInt result1 = intStream1.reduce((x, y) -> x * y);
//        System.out.println(result1.get());

        /*................................................ count .................................................*/
        // Возвращает количество элементов в потоке
//        Stream<Person> personStream = persons.stream();
//        long count = personStream.count();
//        System.out.println(count);

        /*................................................ anyMatch .................................................*/
//        Set<String> stringSet = new HashSet<>(Arrays.asList("Бробус", "Чопус", "Актус", "Гетрус", "Агнус", "Мериборус",
//                "Квинтус", "Септима", "Кондориус"));
//        // Проверим, есть ли хоть один элемент, длина которого меньше 6
//        boolean lengthLessThan6 = stringSet.stream().anyMatch(x -> x.length() < 6);
//        System.out.println(lengthLessThan6);

        /*............................................... noneMatch .................................................*/
//        Set<String> stringSet = new HashSet<>(Arrays.asList("Бробус", "Чопус", "Актус", "Гетрус", "Агнус", "Мериборус",
//                "Квинтус", "Септима", "Кондориус"));
//        // Проверим, что заданному условию НЕ УДОВЛЕТВОРЯЕТ ни один элемент
//        boolean lengthLessThan5 = stringSet.stream().noneMatch(x -> x.length() < 5);
//        System.out.println(lengthLessThan5);

        /*................................................. min ....................................................*/
//        Set<String> stringSet = new HashSet<>(Arrays.asList("Бробус", "Чопус", "Актус", "Гетрус", "Агнус", "Мериборус",
//                "Квинтус", "Септима", "Кондориус"));
//        // Проверим, у какого элемента наименьшая длина
//        Optional<String> minElement = stringSet.stream().min((o1, o2) -> o1.length() - o2.length());
//        System.out.println(minElement);



        /*.............................................. Конвейерные ...............................................*/
        /*............................................. filter и map ...............................................*/
//        Set<String> stringSet = new HashSet<>(Arrays.asList("Бробус", "Чопус", "Актус", "Гетрус", "Агнус", "Мериборус",
//                "Квинтус", "Септима", "Кондориус"));
//        // Сделаем несколько преобразований с помощью методов filter и map:
//        // Возьмем только те строки, длина которых меньше 6 символов, а потом добавим каждому погоняло Большезуб.
//        // Сохраним всё это дело в коллекцию TreeSet. Потом TreeSet выведем на экран
//        Set<String> stringSet1 = stringSet.stream().filter(x -> x.length() < 6).map(x -> x + " Большезуб").collect(Collectors.toCollection(TreeSet::new));
//        for (String s : stringSet1) {
//            System.out.println(s);
//        }



    }
}
