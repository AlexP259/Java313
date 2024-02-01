package lesson1;

public class HomeWork_2 {
    public static void main(String[] args) {
        int sc, a, b, c, d, e, mltply;
        float avrg;
        System.out.println("Введите пятизначное число: 97531");
        sc = 97531;
        a = sc % 10;
        b = sc / 10 % 10;
        c = sc / 100 % 10;
        d = sc / 1000 % 10;
        e = sc / 10000 % 10;
        mltply = a * b * c * d * e;
        avrg = (a + b + c + d + e) / 5f;
        System.out.printf("Произведение цифр числа %d: %d %nСреднее арифметическое числа %d: %.1f", sc, mltply, sc, avrg);
    }
}
