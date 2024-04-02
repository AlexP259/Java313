package lesson20;

import java.util.stream.Stream;

public class HomeWork_35 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(3, 4, 2, 5, 1);
        stream                                // forEach вернет void, поэтому с новой строки и никуда не присваиваем.
                .skip(1)
                .limit(3)
                .forEach(i -> System.out.println(i * 2));
        ;
    }
}
