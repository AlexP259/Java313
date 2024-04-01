package lesson19.map4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"));
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            // Метод compute() обновляет значение ключа в Map, на основе логики, заданной внутри лямбда-функции
            wordCount.compute(word, (key, count) -> count == null ? 1 : count + 1); // метод позволяет менять ключи и значения

//            // Хотим получить значение из HashMap. Передаем для этого ключ - элемент из ArrayList. Ожидаемо, получаем null, т.к. Map пуст, для ключа нет связанного с ним значения
//            Integer count = wordCount.get(word);
//            // Если count вернул значение, связанное с переданным ему ключом, то новым значением мы вставим count + 1, а если нет, то 1
//            System.out.println(word + " - " + count);
//            wordCount.put(word, count == null ? 1 : count + 1);

        }
        System.out.println("Хеш-коды ключей");
        for (String s : wordCount.keySet()) {
            System.out.println(s + " - " + s.hashCode());
        }
        System.out.println("Хеш-коды ключей - хеш-коды значений");
        for (Map.Entry<String, Integer> stringIntegerEntry : wordCount.entrySet()) {
            int keyHash = stringIntegerEntry.getKey().hashCode();
            int valueHash = stringIntegerEntry.getValue().hashCode();
            System.out.println(keyHash + " - " + valueHash);
        }


        System.out.println(wordCount);
    }
}
