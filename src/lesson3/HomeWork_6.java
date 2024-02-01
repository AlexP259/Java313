package lesson3;

import java.util.Scanner;

public class HomeWork_6 {
    public static void main(String[] args) {
        int a, min = Integer.MAX_VALUE, max = 0, count = 0, sum = 0;
        double avrg;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число: ");
            a = input.nextInt();
            if (a == 0) {
                break;
            } else  {
                if (a > max) {
                    max = a;
                }
                if (a < min) {
                    min = a;
                }
                count++;
                sum += a;
            }
        }
        avrg = (double) sum / count;
        System.out.printf("Среднее арифметическое: %.2f%n", avrg);
        System.out.println("Минимальное число " + min);
        System.out.println("Максимальное число " + max);
        input.close();
    }
}
