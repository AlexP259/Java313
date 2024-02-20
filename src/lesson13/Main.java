package lesson13;

public class Main {
    public static void main(String[] args) {
//        Animal[] arr = new Animal[2];
//        arr[0] = new Cat("Пушок", 2);
//        arr[1] = new Dog("Мухтар", 4);
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i].info();
//            arr[i].make_sound();
//        }

        Animal an = new Animal("Терри", 5);
        System.out.println(an);
        System.out.println(an.toString());

        Cat cat = new Cat("Пушок", 2);
        System.out.println(cat.toString());
    }
}

class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void info(){
        System.out.println("Информация о животном");
    }
    void make_sound(){
        System.out.println("Звук животного");
    }

    @Override
    public String toString() {
        return "Животное: " + this.name;
    }


    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void info() {
        System.out.printf("Я кот. Меня зовут %s. Мой возраст %d%n", getName(), getAge());
    }

    @Override
    void make_sound() {
        System.out.printf("%s мяукает%n", getName());
    }

    @Override
    public String toString() {
        return "Котэ: " + getName();
    }
}



class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void info() {
        System.out.printf("Я собака. Меня зовут %s. Мой возраст %d%n", getName(), getAge());
    }

    @Override
    void make_sound() {
        System.out.printf("%s гавкает%n", getName());
    }
}
