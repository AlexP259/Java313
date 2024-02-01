package lesson1;

public class HomeWork_1 {
    public static void main(String[] args) {
        int a = 1, b = 2;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Меняем местами");
        a = a + b;  //   1 = 1 + 2              a == 3
        b = a - b;  //   2 = 3 - 2              b == 1
        a = a - b;  //   3 = 3 - 1              a == 2
        System.out.println("a = " + a + ", b = " + b);
    }
}
