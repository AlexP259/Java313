package lesson17.test;

public class Main {
    public static void main(String[] args) {
        int x = 5, y = 3;
        Calc sum = new Calc();
        sum.calculate(x, y);        // 8

        Calc mul = new Calc(){
            @Override
            public void calculate(int a, int b) {
                System.out.println(a * b);
            }
        };
        mul.calculate(x, y);
    }
}


class Calc{
    public void calculate(int a, int b){
        System.out.println(a + b);
    }
}


//class CalcElse extends Calc{
//    @Override
//    public void calculate(int a, int b) {
//        System.out.println(a * b);
//    }
//}