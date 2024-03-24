package lesson18.collection8;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        /*.............................................. LinkedHashSet ..............................................*/
        // Выводит в том порядке, в котором добавили элементы (и String и Integer). LinkedHashSet нужен тогда,
        // когда надо запомнить последовательность. Дубли всё так же не допускаются
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(7);
        lhs.add(3);
        lhs.add(1);
        lhs.add(4);
        lhs.add(9);
        System.out.println(lhs);    // [7, 3, 1, 4, 9]
        lhs.remove(4);
        System.out.println(lhs);    // [7, 3, 1, 9]
        System.out.println(lhs.contains(4));    // false
        System.out.println(lhs.contains(3));    // true
        System.out.println(lhs.removeIf(x -> x > 5));   // Удаляет элемент по условию. Принимает предикат (функц.интерфейс, с которым мы работаем через лямбды)
        System.out.println(lhs);     // [3, 1]


    }
}
