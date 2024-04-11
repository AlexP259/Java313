package practics.my_practics.my_practics_2_AnonClass_and_lambda;

public class Lambda_expressions  {
    public static void main(String[] args) {
        /*....................................... Лямбда-выражения ..................................................*/
        /*..................................... и НЕ абстрактный класс ..............................................*/
        // НЕ РАБОТАЮТ


        /*....................................... Лямбда-выражения ..................................................*/
        /*..................................... и абстрактный класс .................................................*/
        // НЕ РАБОТАЮТ


        /*....................................... Лямбда-выражения ..................................................*/
        /*............................. и интерфейс (только ФУНКЦИОНАЛЬНЫЙ!!!) ......................................*/
        MyInterface2 interface2 = (x, y) -> x + y;
        System.out.println("Реализованный абстрактный метод: " + interface2.abstractMethodSum(1,2));

    }
}


/*......................................... Не абстрактный класс ....................................................*/
class MyClass2 {
    int nonAbstractMethodSum(int a, int b) {
        return a + b;
    }

    static int staticMethodSum(int a, int b) {
        return a + b;
    }
}


/*........................................... Абстрактный класс .....................................................*/
abstract class AbsClass2 {
    abstract int abstractMethodSum(int a, int b);

    int nonAbstractMethodSum(int a, int b) {
        return a + b;
    }

    static int staticMethodSum(int a, int b) {
        return a + b;
    }
}


/*............................................... Интерфейс .........................................................*/
interface MyInterface2 {
    int abstractMethodSum(int a, int b);
    default int defaultMethodSum(int a, int b) {
        return a + b;
    }
}
















