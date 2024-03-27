package lesson19.map1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*........................................ Map сортирует по ХЭШ-коду ........................................*/
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(334455, "Михаил Борисов");
        map1.put(778899, "Ринат Зуев");
        map1.put(443366, "Роман Свиридов");
        map1.put(225577, "Анна Полякова");
        System.out.println(map1);
//        map1.put(884466, "Анна Полякова");
//        System.out.println(map1);
//        map1.put(778899, "Денис Жданов");
//        System.out.println(map1);
//        map1.put(null, "Игорь Ладанов");
//        map1.put(338811, null);
//        System.out.println(map1);
//        map1.putIfAbsent(778899, "Денис Жданов");
//        System.out.println(map1);
//        System.out.println(map1.get(778899));  // Обращение по несуществующему ключу выдаст null. Никаких исключений, это хорошо

        /*... Содержится ли: ...*/
        System.out.println(map1.containsValue("Роман Свиридов"));
        System.out.println(map1.containsValue("Валентин"));
        System.out.println(map1.containsKey(225577));

        System.out.println(map1.keySet());  // вернет все ключи
        System.out.println(map1.values());  // вернет все значения
    }
}
