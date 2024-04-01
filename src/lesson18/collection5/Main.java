package lesson18.collection5;

// Set - набор уникальных значений, дубликаты просто не добавятся. Индексов нет. Элементы хранятся по очереди хэша,
// который формируется автоматически. Может хранить null. Напрямую доступа нет, т.к. нет индексов. Важно переопределить
// compareTo, если имеем дело с хранением в Set инстансов созданных нами классов. Т.к. уже на этапе добавления первого
// элемента Set должен знать как эти элементы сравнивать. Повторы сравниваемого поля он не принимает

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Валентин");
        set.add("Николай");
        set.add("Григорий");
        set.add("Александр");
        set.add("Александр");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s + " " + s);
        }



        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());     // отсортировали по алфавиту в обратном порядке
        Set<String> set2 = new LinkedHashSet<>(list);
        Iterator<String> iter = set2.iterator();
        for (int i = 0; i < set2.size(); i++) {
            System.out.println(iter.next());
        }
//        set.remove("Александр");
//        System.out.println();
//        set.add(null);
//        for (String s : set) {
//            System.out.println(s);
//        }
//        System.out.println(set.size());
//        System.out.println(set.contains("Григорий"));
        /*..........................................Методы HashSet..................................................*/
//        Set<Integer> a = new HashSet<>();
//        Set<Integer> b = new HashSet<>();
//        a.addAll(Arrays.asList(1,2,3,4,5,6,7));
//        b.addAll(Arrays.asList(5,6,7,8,9));
//        System.out.println(a);
//        System.out.println(b);
//
//        HashSet<Integer> union = new HashSet<>(a);
//        System.out.println(union);
//        union.addAll(b);
//        System.out.println(union);
//
//        HashSet<Integer> intersect = new HashSet<>(a);
//        intersect.retainAll(b);
//        System.out.println(intersect);
//
//        HashSet<Integer> subtract = new HashSet<>(a);
//        subtract.removeAll(b);
//        System.out.println(subtract);
        /*..........................................................................................................*/
//        Set<Integer> num = new HashSet<>();
//        num.add(21);
//        num.add(54);
//        num.add(24);
//        num.add(43);
//        num.add(31);
//        System.out.println(num);
//
////        Integer max = null;
////        for (Integer i : num) {
////            if (max == null) {
////                max = i;
////            } else if (max < i) {
////                max = i;
////            }
////        }
////        System.out.println("Max: " + max);
//
//        System.out.println("Max collections: " + Collections.max(num));
//        System.out.println("Min collections: " + Collections.min(num));

//        int[] arr = {2, 5, 2, 4, 8, 8, 10};
//        System.out.println("Исх. массив: " + Arrays.toString(arr));
////        int[] arr2 = arr.clone();
////        System.out.println(arr2);
////        Set<Integer> setArray = new HashSet<>();
////        setArray.addAll(Arrays.asList(arr));                      !!!!!!!!!!!
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            set.add(arr[i]);
//        }
//        System.out.println("Формат Set: " + set);
//        int[] uniqueArr = new int[set.size()];
//        int i = 0;
//        for (int num : set) {
//            uniqueArr[i++] = num;
//        }
//        System.out.println("Массив без дубликатов: " + Arrays.toString(uniqueArr));



    }
}
