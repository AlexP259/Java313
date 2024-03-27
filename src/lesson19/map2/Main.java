package lesson19.map2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        /*.............................................. Map .......................................................*/
        // Хэш-коды формируются автоматически. Карты представляют собой пару "Ключ - значение"
        // HashMap хранит: int - хэш, K - ключ, V - значение, Node - ссылка на след-й элемент. По-умолчанию размер 16 эл-ов
        Student st1 = new Student("Виктор", "Борисов", 2);
        Student st2 = new Student("Анна", "Полякова", 3);
        Student st3 = new Student("Ирина", "Ринатова", 1);
        Map<Student, Double> map = new HashMap<>();
        map.put(st1, 8.6);
        map.put(st2, 7.9);
        map.put(st3, 9.3);
        System.out.println(map);    // {Student(name='Ирина', surname='Ринатова', course=1)=9.3, Student(name='Анна', surname='Полякова', course=3)=7.9, Student(name='Виктор', surname='Борисов', course=2)=8.6}
        Student st4 = new Student("Виктор", "Борисов", 2);  // ключ повторяться не может
//        boolean res = map.containsKey(st4);
        // res выведет true, если правильно переопределен метод equals(). Такой ключ существует. И без hashCode()
        // тоже отработает некорректно - выведет false
//        System.out.println("res = " + res);
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());

        for (Map.Entry<Student, Double> entry : map.entrySet()) {           // Student(name='Ирина', surname='Ринатова', course=1): 9.3
            System.out.println(entry.getKey() + ": " + entry.getValue());   // Student(name='Анна', surname='Полякова', course=3): 7.9
        }                                                                   // Student(name='Виктор', surname='Борисов', course=2): 8.6

        System.out.println();

        for (Student student : map.keySet()) {      // Student(name='Ирина', surname='Ринатова', course=1)
            System.out.println(student);            // Student(name='Анна', surname='Полякова', course=3)
        }                                           // Student(name='Виктор', surname='Борисов', course=2)

        System.out.println();

        for (Double value : map.values()) {     // 9.3
            System.out.println(value);          // 7.9
        }                                       // 8.6
    }
}


class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);   // берется метод хэш и у каждого объекта выведет свой хэш-код
        // помимо Objects.hash, вы также можете использовать Arrays.hashCode() для массивов объектов и
        // Objects.hashCode() для вычисления хэш-кода одиночного объекта
    }

//    @Override
//    public int hashCode() {
//        return name.length() + surname.length() + course;   // считаем хэш-код своим способом
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=  obj.getClass()) return false;
        Student student = (Student) obj;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public String toString() {
        return "Student(name='" + this.name + "', surname='" + this.surname + "', course=" + this.course + ")";
    }
}