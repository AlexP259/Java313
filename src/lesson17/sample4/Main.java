package lesson17.sample4;

import java.util.Scanner;
import java.util.function.Predicate;        // Предикат. Принимает один аргумент. Возвращает ИСТИНУ или ЛОЖЬ
import java.util.function.Function;         // Функция. Принимает один тип, а возвращает другой
import java.util.function.Supplier;         // Поставщик. НЕ принимает аргументов, но возвращает
import java.util.function.Consumer;         // Потребитель. Принимает аргумент, но НЕ возвращает
import java.util.function.UnaryOperator;    // Унарный оператор. Принимает и возвращает аргумент одного типа. Наследуется от Function

public class Main {
    public static void main(String[] args) {

        /* ....................................... Predicate ........................................................*/
//        Predicate<Integer> isPositive = x -> x > 0;
//        System.out.println(isPositive.test(5));
//        System.out.println(isPositive.test(-5));


//        Predicate<String> isPalindrome = str -> {
//            String reversed = new StringBuilder(str).reverse().toString();
//            return str.equals(reversed);
//        };
//        String word1 = "мадам";
//        boolean res = isPalindrome.test(word1);
//        System.out.println(res);


//        Predicate<String> isEmptyString = str -> str.isEmpty();
//        String str1 = "";
//        String str2 = "Содержит текст!";
//        boolean isEmpty1 = isEmptyString.test(str1);
//        boolean isEmpty2 = isEmptyString.test(str2);
//        System.out.println("Строка 1: " + str1);
//        System.out.println("Строка 1 пустая: " + isEmpty1);
//        System.out.println("Строка 2: " + str2);
//        System.out.println("Строка 2 пустая: " + isEmpty2);
        /* ........................................ Function ........................................................*/
//        Function<Integer, String> convert = i -> String.valueOf(i) + " долларов";
//        System.out.println(convert.apply(5));


//        Function<Double, Long> function = d -> Math.round(d);
//        System.out.println(function.apply(5.7));
        /* ........................................ Supplier ........................................................*/
//        String t = "One";
//        Supplier<String> stringSupplier = () -> t.toUpperCase();
//        System.out.println(stringSupplier.get());


//        Supplier<User> userSupplier = () -> {
//            Scanner input = new Scanner(System.in);
//            System.out.print("Введите имя: ");
//            String name = input.nextLine();
//            return new User(name);
//        };
//        User user1 = userSupplier.get();
//        User user2 = userSupplier.get();
//        System.out.println("Имя пользователя 1: " + user1.getName());
//        System.out.println("Имя пользователя 2: " + user2.getName());
        /* ........................................ Consumer ........................................................*/
//        Consumer<Integer> printer = x -> System.out.printf("%d hundred bucks%n", x);
//        printer.accept(3);


//        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
//        printUpperCase.accept("Hello");
        /* ..................................... UnaryOperator ......................................................*/
//        UnaryOperator<Integer> unaryOperator = UnaryOperator.identity();        // тут без лямбда-выражения
//        int x = 5;
//        int result = unaryOperator.apply(x);
//        System.out.println(result);


        // Короче, интерфейс содержит статический метод + наследуется от Function, поэтому обращаемся к apply
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));
    }
}


//class User{       // Класс для демонстрации работы с Supplier
//    private String name;
//
//    public User(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}



