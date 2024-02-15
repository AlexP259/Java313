package lesson12.calc;

public class Test {
    public static void main(String[] args) {
        int a = 20, b = 10;
        MyCalculation calc = new MyCalculation();
        calc.multiplication(a, b);
        calc.addition(a, b);
        calc.subtraction(a, b);
        System.out.println(calc.z);
    }
}
