package lesson11.number;

public class Main {
    public static void main(String[] args) {
        System.out.println("Максимальное число: " + Number.max(3, 5, 7, 9));
        System.out.println("Минимальное число: " + Number.min(3, 5, 7, 9));
        System.out.println("Среднее арифметическое число: " + Number.average(3, 5, 7, 9));
        System.out.println("Факториал числа: " + Number.factorial(5));
    }
}
