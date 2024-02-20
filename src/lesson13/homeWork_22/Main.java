package lesson13.homeWork_22;

import lesson13.homeWork_22.protected_classes.Aspirant;
import lesson13.homeWork_22.protected_classes.Student;

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("Виктор","Вербов","Gr111",5);
        stud1.displayInfo();

        Student stud2 = new Aspirant("Александр","Невзоров","Gr222",4,
                "Work1");
        stud2.displayInfo();

        Student stud3 = new Aspirant("Антон","Бобров","Gr333",5,"Work2");
        stud3.displayInfo();
    }
}
