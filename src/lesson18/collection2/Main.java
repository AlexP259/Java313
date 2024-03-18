package lesson18.collection2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*................................................ LinkedList ................................................*/
        // В отличие от ArrayList, который обычно хранит один тип данных, LinkedList может хранить всё что угодно
        Student st1 = new Student("Victor",2);
        Student st2 = new Student("Anna",3);
        Student st3 = new Student("Irina",1);
        Student st4 = new Student("Igor",3);
        Student st5 = new Student("Roman",2);

        LinkedList<Student> stLL = new LinkedList<>();
        stLL.add(st1);
        stLL.add(st2);
        stLL.add(st3);
        stLL.add(st4);
        stLL.add(st5);
        System.out.println("LinkedList = " + stLL);
        System.out.println(stLL.get(2));
    }
}


class Student{
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