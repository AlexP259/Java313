package lesson19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeWork_33 {
    public static void main(String[] args) {
        HashMap<String, Color> map = new HashMap<String, Color>(10);

        map.put("blue", new Color("blue"));
        map.put("black", new Color("black"));
        map.put("gray", new Color("gray"));
        map.put("aqua", new Color("aqua"));
        map.put("pink", new Color("pink"));
        map.put("brown", new Color("brown"));
        map.put("yellow", new Color("yellow"));
        map.put("white", new Color("white"));
        map.put("red", new Color("red"));
        map.put("orange", new Color("orange"));

//        for (Map.Entry<String, Color> s : map.entrySet()) {
//            System.out.println(Color.getCount() + ") " + s.getKey() + ": " + s.getValue());
//        }


        // entrySet() вернет Set всех элементов Map в виде объектов Map.Entry. Каждый объект Map.Entry - это пара "ключ - значение" в Map
        List<Map.Entry<String, Color>> entryList = new ArrayList<>(map.entrySet()); // Создаем новый список List, который содержит Map.Entry, который содержит String и Color. Заполняем его содержимым коллекции map
        for (int i = 0; i < map.size(); i++) {
            Map.Entry<String, Color> entry = entryList.get(i);  // создаем объект "ключ - значение" entry и присваиваем ему из списка объекты Map.Entry
            String key = entry.getKey();    // из очередного entry извлекаем ключ...
            Color value = entry.getValue();     // ...и значение
            System.out.println((i + 1) + ") " + key + ": " + value);        // понимаю теперь, зачем нужен цикл foreach
        }

    }
}


class Color{
    String name;
    static int count = 1;

    public Color(String name) {
        this.name = name.toUpperCase();
    }

    public static int getCount() {      // вернет счетчик, потом увеличит его на 1
        return count++;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
