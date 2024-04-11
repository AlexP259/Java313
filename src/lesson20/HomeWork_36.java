package lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork_36 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(11, 20, 33, 45, 52));
        int multiple4 = list.stream()
                .filter(x -> x % 4 == 0)    // фильтруем, оставляем в потоке те элементы, которые нацело делятся на 4 без остатка
                .map(x -> x * 2)        // обрабатываем каждый элемент. Здесь - умножаем на два
                .reduce(0, (x, y) -> x + y);    // складываем все получившиеся элементы, просто сливаем в один элемент.
        // Этим начальным элементом будет 0, чтобы результат был целым числом, а не Optional
        System.out.println(list + ": " + multiple4);
    }
}
