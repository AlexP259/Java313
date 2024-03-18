package lesson18.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        /*................................................ ArrayList ................................................*/
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Валерий");
        arrayList1.add("Ирина");
        arrayList1.add("Игорь");
        System.out.println(arrayList1);     // [Валерий, Ирина, Игорь]


//        ArrayList<String> arrayList2 = new ArrayList<>(3);  // помогаем выделить память на 3 элемента, будет работать быстрее
//        arrayList2.add("Валерий");
//        arrayList2.add("Ирина");
//        arrayList2.add("Игорь");
//        System.out.println(arrayList2.size());
//        System.out.println(arrayList2);     // [Валерий, Ирина, Игорь]
//
//
//        List<String> arrayList3 = new ArrayList<>();
//        arrayList3.add("Валерий");
//        arrayList3.add("Ирина");
//        System.out.println(arrayList3);     // [Валерий, Ирина]
//
//
//        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
//        System.out.println(arrayList4);     // [Валерий, Ирина, Игорь]
//        arrayList4.add("Владимир");
//        System.out.println(arrayList4);     // [Валерий, Ирина, Игорь, Владимир]
//        System.out.println(arrayList1);     // [Валерий, Ирина, Игорь]
//
//
//        ArrayList arrayList5 = new ArrayList();
//        arrayList5.add("Валерий");
//        arrayList5.add(7);
//        arrayList5.add(true);
//        System.out.println(arrayList5);     // [Валерий, 7, true]


        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("!!!");
        arrayList6.add("???");
//        arrayList6.addAll(arrayList1);
//        System.out.println(arrayList6);     // [!!!, ???, Валерий, Ирина, Игорь]
        arrayList6.addAll(1, arrayList1);
        System.out.println(arrayList6);     // [!!!, Валерий, Ирина, Игорь, ???]
//        arrayList1.set(2,"Александр");
//        System.out.println(arrayList1);     // [Валерий, Ирина, Александр]
//        arrayList6.removeAll(arrayList1);
//        System.out.println(arrayList6);     // [!!!, ???]

//        arrayList6.retainAll(arrayList1);   // оставил в arrayList6 То, что есть в arrayList1
//        System.out.println(arrayList6);     // [Валерий, Ирина, Игорь]

//        List<String> myList = arrayList6.subList(0, 3);     // берет диапазон элементов из массива
//        System.out.println(myList);     // [!!!, Валерий, Ирина]
//        myList.add("Борис");
//        System.out.println(myList);     // [!!!, Валерий, Ирина, Борис]
//        System.out.println(arrayList6); // [!!!, Валерий, Ирина, Борис, Игорь, ???]

////        String[] simpleArray = arrayList6.toArray(new String[8]);   // !!! Валерий Ирина Борис Игорь ??? null null
//        String[] simpleArray = arrayList6.toArray(new String[0]);
//        for (String s : simpleArray) {
//            System.out.print(s + " ");
//        }
        /*..................................... Класс Collections и его методы .....................................*/
//        Collections.sort(arrayList6);       // Сортировать
//        System.out.println(arrayList6);

//        Collections.shuffle(arrayList6);       // Перемешать
//        System.out.println(arrayList6);

//        Collections.reverse(arrayList6);       // Развернуть
//        System.out.println(arrayList6);

//        Collections.swap(arrayList6, 1, 4);       // Поменять местами 2 элемента
//        System.out.println(arrayList6);
        /*..................................... Интерфейс Iterator и его методы .....................................*/
        Iterator<String> iterator = arrayList6.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");    // Перебор элементов arrayList6, пока есть следующий элемент
//        }
        while (iterator.hasNext()) {
            iterator.next();    // берет следующий элемент
            iterator.remove();  // удаляет текущий элемент
        }
        System.out.println(arrayList6);


    }
}













