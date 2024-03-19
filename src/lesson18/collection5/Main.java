package lesson18.collection5;

// Set - набор уникальных значений, дубликаты просто не добавятся. Индексов нет. Элементы хранятся по очереди хэша,
// который формируется автоматически. Может хранить null. Напрямую доступа нет, т.к. нет индексов


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Валентин");
        set.add("Николай");
        set.add("Григорий");
        set.add("Александр");
        set.add("Александр");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
        set.remove("Александр");
        System.out.println();
        set.add(null);
        for (String s : set) {
            System.out.println(s);
        }
//        System.out.println(set.size());
//        System.out.println(set.contains("Григорий"));
    }
}
