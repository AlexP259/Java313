package lesson19.map4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> bookPhone = new HashMap<>();    // Ключи - ФИО, значения - список номеров телефонов этого человека
        System.out.println(bookPhone);      // {}
        addNumber("Зотов", 778899, bookPhone);
        addNumber("Зотов", 112233, bookPhone);
        addNumber("Калинкин", 449988, bookPhone);
        addNumber("Романов", 889922, bookPhone);
        addNumber("Зотов", 445577, bookPhone);
        addNumber("Калинкин", 116655, bookPhone);
        System.out.println(bookPhone);  // {Романов=[889922], Калинкин=[449988, 116655], Зотов=[778899, 112233, 445577]}
        printBook(bookPhone);
    }

    public static void printBook(HashMap<String, ArrayList<Integer>> mao){
        for (Map.Entry<String, ArrayList<Integer>> entry : mao.entrySet()) {    // entry - это тип данных пара "ключ-значение", мы проходимся по множеству Set, хранящим такие пары
            String phones = "";
            int i = 0;
            for (int el : entry.getValue()) {   // el - это тип данных целое число, мы проходимся им по Списку, который является значением в паре entry
                phones = phones + el + (entry.getValue().size() - 1 == i ? "" : ", ");  // добавляем новые значения. После последнего в списке, нам не нужна запятая
                i++;
            }
            System.out.printf("%1$s: %2$s%n", entry.getKey(), phones);
        }
    }

    public static void addNumber(String key, int value, HashMap<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);    // Вызываем по ключу некий элемент, а этот элемент - список. С помощью add добавим в список еще один номер телефона
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

}
