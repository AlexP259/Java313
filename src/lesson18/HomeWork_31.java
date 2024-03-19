package lesson18;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class HomeWork_31 {
    public static void main(String[] args) {
        LinkedList<String> rainbow = new LinkedList<>(Arrays.asList("Красный", "Оранжевый",  "Желтый", "Зеленый",
                "Голубой", "Синий", "Фиолетовый"));

        System.out.println(rainbow);

        ListIterator<String> iterator = rainbow.listIterator();
        System.out.println("Список итераторов в прямом направлении: ");
        while (iterator.hasNext()) {
            System.out.println("Индекс = " + iterator.nextIndex() + ", Элемент = " + iterator.next());
        }

        iterator = rainbow.listIterator(rainbow.size());
                System.out.println("\nСписок итераторов в обратном направлении: ");
        while (iterator.hasPrevious()) {
            System.out.println("Индекс = " + iterator.previousIndex() + ", Элемент = " + iterator.previous());
        }
    }
}
