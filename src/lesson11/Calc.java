package lesson11;


//  перегрузка методов
public class Calc {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        //  1. по количеству параметров
        obj.calculate(1, 2);
        obj.calculate(1, 2, 3);
        //  2. по типам параметров
        obj.calculate(2.5, 3.4);
        //  3. по порядку параметров
        obj.calculate(2.5, 3);
    }
}

class Calculator{
    public void calculate(int a, int b){
        System.out.println("Сумма двух целых чисел: " + (a + b));
    }

    public void calculate(int a, int b, int c){
        System.out.println("Сумма трёх целых чисел: " + (a + b + c));
    }

    public void calculate(double a, double b){
        System.out.println("Сумма двух вещественных чисел: " + (a + b));
    }

    public void calculate(double a, int b){
        System.out.println("Сумма вещественного числа и целого: " + (a + b));
    }

}
