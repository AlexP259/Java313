package lesson18.compar;


// Для компаратора создаем отдельный класс, который будет реализовывать его.
// Comparator — это интерфейс, входящий в пакет java.util, поэтому импортируем!
// 1) Он должен возвращать целое число положительное значение Positive(+ve), если первый объект больше второго объекта.
// 2) Он должен возвращать целое отрицательное значение Negative(-ve), если первый объект меньше второго объекта.
// 3) Он должен возвращать Zero(0), если оба объекта равны.
// Может работать с несколькими атрибутами

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class Program {
    public static void main(String[] args) {
        University un1 = new University("Университет", 300);
        University un2 = new University("Начальная школа", 150);
        University un3 = new University("Средняя школа", 357);
        University un4 = new University("Высшая школа", 246);
        University un5 = new University("Музыкальная школа", 789);

        SortUniversity sortUniversity = new SortUniversity();
        int res = sortUniversity.compare(un1,un2);
        switch(res){
            case -1 -> System.out.println(un2.getName() + " больше");
            case 1 -> System.out.println(un1.getName() + " больше");
            case 0 -> System.out.println("Два учебных заведения одинаковы");
        }
        System.out.println("\nСортировка по имени:");
        SortNameUniversity sortNameUniversity = new SortNameUniversity();
        ArrayList<University> list = new ArrayList<>(Arrays.asList(un1,un2,un3,un4,un5));
        Collections.sort(list, sortNameUniversity);
        for (University name : list) {
            System.out.println(name.getName() + " " + name.getNumOfStudents());
        }
        System.out.println("\nСортировка по количеству:");
        Collections.sort(list, sortUniversity);
        for (University name : list) {
            System.out.println(name.getName() + " " + name.getNumOfStudents());
        }
    }
}


class University{
    private String name;
    private int numOfStudents;

    public University(String name, int numOfStudents) {
        this.name = name;
        this.numOfStudents = numOfStudents;
    }

    public String getName() {
        return name;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }
}


class SortUniversity implements Comparator<University>{
    @Override
    public int compare(University o1, University o2) {
        if (o1.getNumOfStudents() == o2.getNumOfStudents()) {
            return 0;
        } else
            return o1.getNumOfStudents() > o2.getNumOfStudents() ? 1 : -1;
    }
}


class SortNameUniversity implements Comparator<University>{
    @Override
    public int compare(University o1, University o2) {
        return o1.getName().compareTo(o2.getName());
    }
}