package lesson5;

import java.util.Scanner;

public class HomeWork_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.print("Вычисление площади фигур\n\nВыбор фигуры:\n1 - треугольник\n2 - прямоугольник\n3 - круг\n: ");
        choice = input.nextInt();
        if (choice == 1){
            triangleArea(input);
        } else if (choice == 2){
            rectangle(input);
        } else if (choice == 3){
            circle(input);
        } else System.out.print("Введено неверное значение");
        input.close();
    }

    public static void triangleArea(Scanner input) {
        System.out.print("Введите сторону a = ");
        int a = input.nextInt();
        System.out.print("Введите сторону b = ");
        int b = input.nextInt();
        System.out.print("Введите сторону c = ");
        int c = input.nextInt();
        double semiPerim = (double) (a + b + c) / 2;     // полу-периметр
        System.out.printf("%.2f", Math.sqrt(semiPerim * (semiPerim - a) * (semiPerim - b) * (semiPerim - c)));
    }
    public static void rectangle(Scanner input) {
        System.out.print("Введите сторону a = ");
        int a = input.nextInt();
        System.out.print("Введите сторону b = ");
        int b = input.nextInt();
        System.out.print(a * b);
    }
    public static void circle(Scanner input) {
        System.out.print("Введите радиус окружности = ");
        int a3 = input.nextInt();
        System.out.printf("%.2f", Math.PI * Math.pow(a3, 2));
    }

}
