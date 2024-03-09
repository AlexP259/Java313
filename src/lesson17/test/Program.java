package lesson17.test;

public class Program {
    public static void main(String[] args) {
        int x = 5, y = 3;
        CalcInterface sum = new CalcInterface(){
            @Override
            public void calculate(int a, int b) {
                System.out.println(a + b);
            }
        };
        sum.calculate(x, y);
    }
}


interface CalcInterface {
    void calculate(int a, int b);
}

//class Calculate implements CalcInterface{
//    @Override
//    public void calculate(int a, int b) {
//        System.out.println(a + b);
//    }
//}
