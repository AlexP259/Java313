package lesson18.compar;

public class Student {
    public static void main(String[] args) {
        Person e1 = new Person("Александр", 25);
        Person e2 = new Person("Светлана", 25);
        int res = e1.compareTo(e2);
        switch (res) {
            case 0 -> System.out.println("Одинаковый возраст");
            case -1 -> System.out.println(e2.getName() + " старше");
            case 1 -> System.out.println(e1.getName() + " старше");
        }

    }
}


// Класс, реализующий интерфейс Comparable, сравнивает себя с другими объектами. Comparable входит в пакет
// java.lang, поэтому его не надо импортировать. Метод int CompareTo(T var1) должен быть переопределен так, чтобы:
// 1) Он должен возвращать целое положительное значение Positive(+ve), если этот объект больше объекта сравнения.
// 2) Он должен возвращать целое отрицательное значение Negative(-ve), если этот объект меньше объекта сравнения.
// 3) Он должен вернуть Zero(0), если этот и сравниваемый объект равны.
// Сравнивает 1 атрибут


class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age == o.age) {
            return 0;
        } else
            return this.age > o.age ? 1 : -1;
    }

}
