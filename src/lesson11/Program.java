package lesson11;

public class Program {
    public static void main(String[] args) {

//        Каждый класс должен выноситься в отдельный файл

        Person p1 = new Person();   // создали объект (экземпляр класса, instance)
        p1.displayInfo();

//        p1.name = "Виктор";
//        p1.age = 14;
//        p1.displayInfo();

//        Person p2 = new Person("Игорь");
//        p2.displayInfo();

        Person p3 = new Person("Валентин", 25);
        p3.displayInfo();

        Person p4 = new Person( 23);
        p4.displayInfo();

        





    }
}


// класс
class Person {
    // поля класса и константы
    private String name;
    private int age;


    // инициализатор имеет код общий для всех конструкторов, а выполняется ДО них
    {
        name = "Первоначальное значение";
        age = 100;
    }


    // конструкторы класса
    public Person(){
        this.name = "неизвестно";
        this.age = 18;
    }
    public Person(String n){
        name = n;
    }
    public Person(int a){
        age = a;
    }
    public Person(String n, int a){
        name = n;
        age = a;
    }


    // методы класса
    void displayInfo(){
        System.out.printf("Name: %s%nAge: %d%n", name, age);
    }


    // геттеры и сеттеры полей класса
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age > 0 && age < 110){
            this.age = age;
        }
    }
}


