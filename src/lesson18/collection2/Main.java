package lesson18.collection2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;


public class Main {
    public static void main(String[] args) {
        /*................................................ LinkedList ................................................*/
        // В отличие от ArrayList, который обычно хранит один тип данных, LinkedList может хранить всё что угодно
        Student st1 = new Student("Victor", 2);
        Student st2 = new Student("Anna", 3);
        Student st3 = new Student("Irina", 1);
        Student st4 = new Student("Igor", 3);
        Student st5 = new Student("Roman", 2);

        LinkedList<Student> stLL = new LinkedList<>();
        stLL.add(st1);
        stLL.add(st2);
        stLL.add(st3);
        stLL.add(st4);
        stLL.add(st5);
//        System.out.println("LinkedList = " + stLL);
//        System.out.println(stLL.get(2));
//        Student st6 = new Student("Maria",2);
//        Student st7 = new Student("Sergey",1);
//        stLL.add(st6);
//        stLL.add(1,st7);
//        stLL.addFirst(st6);
//        stLL.addLast(st7);      // явным образом добавляем в конец
//        Student st8 = new Student("Vlad",3);
//        stLL.set(1,st8);
//        stLL.remove(3);
//        stLL.removeFirst();
//        stLL.removeLast();
//        System.out.println("LinkedList = " + stLL);
//        for (Student student : stLL) {
//            System.out.println(student);
//        }
//        for (int i = 0; i < stLL.size(); i++) {
//            System.out.println("Элемент по индексу " + i + ": " + stLL.get(i));
//        }

//        Object first_element = stLL.getFirst();
//        System.out.println("Первый элемент: " + first_element);
//        Object last_element = stLL.getLast();
//        System.out.println("Последний элемент: " + last_element);

//        stLL.clear();
//        System.out.println("LinkedList = " + stLL);
//        System.out.println("Пустой список? " + stLL.isEmpty());
        System.out.println("LinkedList = " + stLL);
//        Collections.swap(stLL,0,2);
//        System.out.println("LinkedList = " + stLL);

        Iterator it = stLL.listIterator();     // listIterator() можно указать с какого индекса начать
//        Iterator it = stLL.descendingIterator();    // descendingIterator() разворачивает список
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("=============================================");
        ListIterator<Student> listIterator = stLL.listIterator();
        System.out.println("Итерация прямого направления: ");
        while(listIterator.hasNext()){

            System.out.println("Index = " + listIterator.nextIndex() + ", Element = " + listIterator.next());
        }
        System.out.println("Итерация в обратном направлении: ");
        while(listIterator.hasPrevious()){
            System.out.println("Index = " + listIterator.previousIndex() + ", Element = " + listIterator.previous());
        }




    }
}


class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student(name='" + this.name + "', course='" + this.course + "')";
    }
}