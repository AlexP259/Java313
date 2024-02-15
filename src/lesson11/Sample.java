package lesson11;

public class Sample {

    public static void main(String[] args) {
        Dog d1 = new Dog("Шарик");
        Dog d2 = new Dog("Найда");
        d1.run();
        d2.run();
    }
}

class Dog{
    private String name;
    private Foot foot;      //  класс Dog имеет поле типа Foot. Сам класс Foot - вложенный класс класса Dog

    public Dog(String name) {
        this.name = name;
        this.foot = new Foot();     //  инициализируем поле foot новым объектом класса Foot
        System.out.println("Работает конструктор класса Dog. Экземпляр класса Foot был создан");
    }

    void run(){     //  метод run внешнего класса Dog вызывает метод run вложенного класса Foot
        foot.run();
    }

    //  вложенный класс Foot - "стопа" ...
    class Foot{
        void run(){     //  ... имеет метод run, который нам сообщает, что собака бежит
            String name = "Foot";
            System.out.println("Собака " + Dog.this.name + " бежит...");
        }
    }
}



