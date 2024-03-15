package lesson17.sample;

public class Programm {
//    static int x = 10;
//    static int y = 20;

    public static void main(String[] args) {
//        // Использование локальной переменной делает эту переменную final, т.е. неизменяемой
//        int x = 10;
//        int y = 20;
//        Calc operation = () -> {
//            return x + y;
//        };
//        x = 30;
//        System.out.println(x);
//        System.out.println(operation.calculate());

//        Calc operation = (x, y) -> {
//            if (y == 0) {
//                return 0;
//            } else {
//                return x / y;
//            }
//        };
//        System.out.println(operation.calculate(20, 10));
//        System.out.println(operation.calculate(20, 0));
        Calc<Integer> operation1 = (x, y) -> x + y;
        Calc<String> operation2 = String::concat;

        System.out.println(operation1.calculate(2,2));
        System.out.println(operation2.calculate("Hello, ", "World!"));

    }
}

interface Calc <T>{
    T calculate(T x, T y);
}

//interface Calc {
//    int calculate(int x, int y);
//}

//interface Calc {
//    int calculate();
//}


