package lesson18.collection7;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Iterator;

public class Programm {
    public static void main(String[] args) {
        TreeSet<Student>  treeSet = new TreeSet<>(new MyComparator());
        Student st1 = new Student("Виктор", 5);
        Student st2 = new Student("Герман", 3);
        Student st3 = new Student("Ольга", 1);
        Student st4 = new Student("Ирина", 4);
        Student st5 = new Student("Михаил", 2);

        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);
        // Методы first и last есть у TreeSet, важно создать переменную, хранящую ссылку на объект, именно
        // с типом TreeSet, а не просто Set, т.к. у Set такого метода нет
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        Student st6 = new Student("Алена", 3);
        System.out.println(treeSet.headSet(st6));   // вернет TreeSet с эл-ми, которые меньше указанного
        System.out.println(treeSet.tailSet(st6));   // вернет TreeSet с эл-ми, которые больше или равны указанному
        Student st7 = new Student("Игорь", 23);
        Student st8 = new Student("Владимир", 23);
        treeSet.add(st7);
        treeSet.add(st8);
        System.out.println(treeSet);
        System.out.println(treeSet.subSet(st7, st8));   // вернет TreeSet с эл-ми начальной позиции до конечной (не включительно)
        System.out.println("============================================");
        Iterator<Student> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("============================================");

        Iterator<Student> iterator2 = treeSet.descendingIterator(); // итератор начинает с последнего элемента
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }



    }
}


class Student /*implements Comparable<Student>*/{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

//    @Override
//    public int compareTo(Student o) {
//        // Если результат вычитания отрицательный, то this.course должен быть расположен перед o.course, если результат
//        // нулевой - объекты равны, и если результат положительный - this.course должен быть расположен после o.course.
//        // Сортировка отработает сразу при добавлении объекта в TreeSet, поэтому мы не вызываем сортировку сами
//        return this.course - o.course;
//    }

    @Override
    public String toString() {
        return  "Student(name = '" + this.name + "', course = '" + this.course + "')";
    }
}


class MyComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.course - o2.course;
    }
}
