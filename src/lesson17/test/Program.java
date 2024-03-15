package lesson17.test;

public class Program {
    public static void main(String[] args) {
        int x = 5, y = 3;

//        CalcInterface sum = new Calculate();
//        CalcInterface sum = new CalcInterface(){
//            @Override
//            public void calculate(int a, int b) {
//                System.out.println(a + b);
//            }
//        };

        /*........................Лямбда-выражения работают только с интерфейсами.................................*/

        CalcInterface sum = (a, b) -> a + b;        // принимаемые значения -> возвращаемый результат
        CalcInterface sub = (a, b) -> a - b;
        CalcInterface mul = (a, b) -> a * b;

        int res = sum.calculate(x, y);
        int res2 = sub.calculate(x, y);
        int res3 = mul.calculate(x, y);

        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
}

// функциональный интерфейс (предполагает 1 метод в интерфейсе без реализации. Не считая статических методов
// и методов по-умолчанию, т.е. тех методов, у которых есть реализация)
interface CalcInterface {
    int calculate(int a, int b);        // тип данных для лямбда-выражения берется отсюда
}

//class Calculate implements CalcInterface{
//    @Override
//    public void calculate(int a, int b) {
//        System.out.println(a + b);
//    }
//}
