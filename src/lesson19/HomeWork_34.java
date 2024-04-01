package lesson19;

import java.util.LinkedHashMap;
import java.util.Map;

public class HomeWork_34 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("X", 1);
        map1.put("Y", 2);
        map1.put("Z", 3);
        System.out.println("Исходный Map: " + map1);
        System.out.println("Измененный Map: " + keyValueReverse(map1));
    }

    static <K, V> Map<V, K> keyValueReverse(Map<K, V> mapOriginal) {
        try {
            Map<V, K> mapReverse = mapOriginal.getClass().newInstance();
            for (Map.Entry<K, V> kvEntry : mapOriginal.entrySet()) {
                mapReverse.put(kvEntry.getValue(), (K)("[" + kvEntry.getKey() + "]"));
            }
            return mapReverse;
        } catch (InstantiationException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
