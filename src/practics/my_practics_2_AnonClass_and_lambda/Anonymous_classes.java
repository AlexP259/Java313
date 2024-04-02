package practics.my_practics_2_AnonClass_and_lambda;

public class Anonymous_classes {
    public static void main(String[] args) {
        /*....................................... Анонимные классы ..................................................*/
        /*..................................... и НЕ абстрактный класс ..............................................*/
        MyClass class1 = new MyClass() {
            @Override
            int nonAbstractMethodSum(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Переопределенный в анонимном классе неабстрактный метод: " + class1.nonAbstractMethodSum(3, 6));


        /*....................................... Анонимные классы ..................................................*/
        /*....................................... и абстрактный класс ...............................................*/
        // Статические методы нельзя переопределить, а НЕ абстрактные методы будут ссылаться на реализацию в родителе.
        AbsClass abs1 = new AbsClass() {
            @Override
            int abstractMethodSum(int a, int b) {
                return a + b;
            }

            @Override
            int nonAbstractMethodSum(int a, int b) {
                return super.nonAbstractMethodSum(a, b);
            }
        };
        System.out.println("Реализованный в анонимном классе абстрактный метод: " + abs1.abstractMethodSum(2, 4));
        System.out.println("Переопределенный в анонимном классе неабстрактный метод: " + abs1.nonAbstractMethodSum(2, 4));


        /*....................................... Анонимные классы ..................................................*/
        /*......................................... и интерфейсы ....................................................*/
        MyInterface interface1 = new MyInterface() {
            @Override
            public int abstractMethodSum(int a, int b) {
                return a + b;
            }
            @Override
            public int defaultMethodSum(int a, int b) {
                return MyInterface.super.defaultMethodSum(a, b);
            }
        };
        System.out.println("Реализованный в анонимном классе абстрактный метод: " + interface1.abstractMethodSum(3, 4));
        System.out.println("Переопределенный в анонимном классе дефолтный метод: " + interface1.defaultMethodSum(3, 4));
    }
}


/*......................................... Не абстрактный класс ....................................................*/
class MyClass {
    int nonAbstractMethodSum(int a, int b) {
        return a + b;
    }

    static int staticMethodSum(int a, int b) {
        return a + b;
    }
}


/*........................................... Абстрактный класс .....................................................*/
abstract class AbsClass {
    abstract int abstractMethodSum(int a, int b);

    int nonAbstractMethodSum(int a, int b) {
        return a + b;
    }

    static int staticMethodSum(int a, int b) {
        return a + b;
    }
}


/*............................................... Интерфейс .........................................................*/
interface MyInterface {
    int abstractMethodSum(int a, int b);
    default int defaultMethodSum(int a, int b) {
        return a + b;
    }
}


