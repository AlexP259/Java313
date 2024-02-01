package lesson4;

import java.util.Scanner;

public class HomeWork_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.print("Вычисление площади фигур\n\nВыбор фигуры:\n1 - треугольник\n2 - прямоугольник\n3 - круг\n: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:     // площадь треугольника
                System.out.print("Введите сторону a = ");
                int a1 = input.nextInt();
                System.out.print("Введите сторону b = ");
                int b1= input.nextInt();
                System.out.print("Введите сторону c = ");
                int c1 = input.nextInt();
                double semiPerim = (double)(a1 + b1 + c1) / 2;     // полу-периметр
                double area1 = Math.sqrt(semiPerim * (semiPerim - a1) * (semiPerim - b1) * (semiPerim - c1));   // площадь
                System.out.printf("%.2f", area1);
                break;
            case 2:     // площадь прямоугольника
                System.out.print("Введите сторону a = ");
                int a2 = input.nextInt();
                System.out.print("Введите сторону b = ");
                int b2 = input.nextInt();
                int area2 = a2 * b2;
                System.out.print(area2);
                break;
            case 3:     // площадь окружности
                System.out.print("Введите радиус окружности = ");
                int a3 = input.nextInt();
                double area3 = Math.PI * Math.pow(a3, 2);
                System.out.printf("%.2f", area3);
                break;
            default:
                System.out.print("Введено неверное значение");
        }
        input.close();
    }
}
