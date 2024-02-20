package lesson13.sample;

public class Base {
    public static void main(String[] args) {
        Manager obj1 = new Manager();
        System.out.println("Зарплата менеджера: ");
        printSalary(obj1);

        Secretary obj2 = new Secretary();
        System.out.println("Зарплата секретаря: ");
        printSalary(obj2);
    }

    static void printSalary(Employee e) {
        System.out.println(e.salary());
    }
}


class Employee {
    static int base = 10000;

    int salary() {
        return base;
    }
}

class Manager extends Employee {
    @Override
    int salary() {
        return base + 20000;
    }
}

class Secretary extends Employee{
    @Override
    int salary() {
        return base + 10000;
    }
}
