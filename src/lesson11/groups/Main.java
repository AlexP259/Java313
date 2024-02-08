package lesson11.groups;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        Student[] students = new Student[n];
        students[0] = new Student("Петров", "И.О.", 1);
        students[1] = new Student("Петров", "К.Н.", 1);
        students[2] = new Student("Иванов", "Е.П.", 2);
        students[3] = new Student("Шишкин", "Ж.П.", 2);
        students[4] = new Student("Репин", "К.К.", 2);
        students[5] = new Student("Кекин", "П.П.", 3);
        students[6] = new Student("Пекин", "М.В.", 3);
        students[7] = new Student("Мекин", "К.Р.", 3);
        students[8] = new Student("Пуськин", "А.С.", 3);
        students[9] = new Student("Куськин", "А.Е.",4);

        System.out.println("Все студенты: ");
        for (int s = 0; s < students.length; s++) {
            students[s].print();
        }
    }
}
