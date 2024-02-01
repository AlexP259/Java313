package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /* System.out.print("Введите имя: ");
        String name = input.nextLine();
        System.out.print("Введите возраст: ");
        int age = input.nextInt();
        System.out.print("Введите рост: ");
        float height = input.nextFloat();

        System.out.printf("Вы ввели имя: %s, возраст: %d и рост: %.2f", name, age, height);
        input.close();*/

        /*Scanner input = new Scanner(System.in);
        System.out.print("Введите четыре числа\n1: ");
        int a = input.nextInt();
        System.out.print("\n2: ");
        int b = input.nextInt();
        System.out.print("\n3: ");
        int c = input.nextInt();
        System.out.print("\n4: ");
        int d = input.nextInt();
        System.out.print("\nРезультат: " + (double) (a + b) / (c + d));*/

       /* int a = 5;
        a += 10;
        System.out.println(a);
        a -= 7;
        System.out.println(a);*/

       /* Scanner input = new Scanner(System.in);
        int sum;
        System.out.println("Введите первое число: ");
        sum = input.nextInt();
        System.out.println("Введите второе число: ");
        sum += input.nextInt();
        System.out.println("Введите третье число: ");
        sum += input.nextInt();
        System.out.println("Сумма чисел: " + sum);*/

        /*int a = 8;
        int b = 3;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a <= b);
        System.out.println(a >= b);*/

 /*       boolean a1 = 5 < 6 && 4 < 6;    // true AND true
        boolean a2 = 5 > 6 && 4 < 6;    // false AND true
        boolean a3 = 5 < 6 && 4 > 6;    // true AND false
        boolean a4 = 5 > 6 && 4 > 6;    // false AND false
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);*/

//        boolean a1 = 5 < 6 || 4 < 6;    // true AND true
//        boolean a2 = 5 > 6 || 4 < 6;    // false AND true
//        boolean a3 = 5 < 6 || 4 > 6;    // true AND false
//        boolean a4 = 5 > 6 || 4 > 6;    // false AND false
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        System.out.println(a4);


//        System.out.println(!true);
//        System.out.println(!false);
//        System.out.println(!(3142535 < 2));


//        Scanner input = new Scanner(System.in);
//        int age;
//        System.out.print("Введите возраст: ");
//        age = input.nextInt();
//        if (age >= 18) System.out.println("Доступ разрешен");
//        else System.out.println("Доступ закрыт");


//        int num1 = 7;
//        int num2 = 15;
//        if (num1 > num2) {
//            System.out.println("Первое число больше второго");
//        } else if (num1 < num2) {
//            System.out.println("Второе число больше первого");
//        } else {
//            System.out.println("Числа равны");
//        }

//        int age = 52;
//        boolean isYoung = age >= 18;
//        boolean isOld = age <= 65;
//        if(isYoung && isOld){
//            System.out.println("Слыш, работать!");
//        } else {
//            System.out.println("Можешь не работать");
//        }

//        int a = 30, b = 20, c = 30;
//        if (a == b && b == c){
//            System.out.println("Треугольник равносторонний");
//        } else if (a == b || b == c || a == c) {
//            System.out.println("Треугольник равнобедренный");
//        } else {
//            System.out.println("Треугольник разносторонний");
//        }

//        Scanner sc = new Scanner(System.in);
//        int a;
//        System.out.print("Введите количество ворон (0-9): ");
//        a = sc.nextInt();
//        if (a >= 0 && a <= 9){
//            System.out.print("На ветке ");
//            if (a == 1) {
//                System.out.println(a + " ворона");
//            } else if (a >= 2 && a <= 4){
//                System.out.println(a + " вороны");
//            } else if (a == 0 || a >= 5 && a <= 9){
//                System.out.println(a + " ворон");
//            }
//        } else {
//            System.out.println("Ошибка ввода данных");
//        }

//        Scanner sc = new Scanner(System.in);
//        int numDay, timeHour;
//        System.out.print("Введите день недели цифрами: ");
//        numDay = sc.nextInt();
//        if (numDay >= 1 && numDay <= 5) {
//            System.out.print("Рабочий день. ");
//            System.out.print("Введите время в часах: ");
//            timeHour = sc.nextInt();
//            if (timeHour >= 8 && timeHour <= 17){
//                System.out.println("Рабочее время. Заведение открыто");
//            } else {
//                System.out.println("Нерабочее время. Заведение закрыто");
//            }
//        } else if (numDay == 6 || numDay == 7){
//            System.out.println("Выходной день");
//        } else {
//            System.out.println("Несуществующий день недели");
//        }

//        Scanner sc = new Scanner(System.in);
//        int numDay;
//        System.out.print("Введите день недели цифрами: ");
//        numDay = sc.nextInt();
//        if (numDay >= 1 && numDay <= 5) {
//            System.out.print("Рабочий день. ");
//            if (numDay == 1) System.out.print("Понедельник");
//            if (numDay == 2) System.out.print("Вторник");
//            if (numDay == 3) System.out.print("Среда");
//            if (numDay == 4) System.out.print("Четверг");
//            if (numDay == 5) System.out.print("Пятница");
//        } else if (numDay == 6 || numDay == 7){
//            System.out.print("Выходной день. ");
//            if (numDay == 6) System.out.print("Суббота");
//            if (numDay == 7) System.out.print("Воскресенье");
//        } else {
//            System.out.println("Несуществующий день недели");
//        }

//        int number, res;
//        number = -10;
//        res = number >= 0 ? number : -number;
//        System.out.println(res);

//        int age;
//        System.out.print("Введите свой возраст: ");
//        age = input.nextInt();
//        System.out.println(age > 18 ? "Приятного просмотра" : "Вым рано смотреть этот фильм");

//        int a = 20, b = 10;
//        System.out.println(a == b ? "a == b" : (a > b ? "a > b" : "b > a"));

//        int a = 6, b = 0;
//        System.out.println(b != 0 ? a / b : "Делить на 0 нельзя");

//        int n;
//        System.out.print("\tВыберите цвет светофора:\n1 - красный, 2 - жёлтый, 3 - зелёный: ");
//        n = input.nextInt();
//        switch (n) {
//            default:
//                System.out.println("Такого цвета нет");
//                break;
//            case 1:
//            case 11:
//                System.out.println("Стоим");
//                break;
//            case 2:
//            case 22:
//                System.out.println("Приготовились");
//                break;
//            case 3:
//            case 33:
//                System.out.println("Идём");
//        }


        /*   Количество дней в месяце   */
//        int year, month;        // Проверяем год только если ввели февраль (2)
//        int numDays = 0;
//        System.out.print("Введите номер месяца: ");
//        month = input.nextInt();
//        switch (month) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                numDays = 31;
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                numDays = 30;
//                break;
//            case 2:
//                System.out.print("Введите год: ");
//                year = input.nextInt();
//                if (year % 4 == 0){
//                    numDays = 29;
//                } else {
//                    numDays = 28;
//                }
//                break;
//            default:
//                System.out.print("Такого месяца не существует");
//        }
//        System.out.println("Количество дней: " + numDays);

//        int month;
//        System.out.print("Введите номер месяца: ");
//        month = input.nextInt();
//        switch (month) {
//            case 1, 2, 12 -> System.out.println("Зима");
//            case 3, 4, 5 -> System.out.println("Весна");
//            case 6, 7, 8 -> System.out.println("Лето");
//            case 9, 10, 11 -> System.out.println("Осень");
//            default -> System.out.println("Такого месяца не существует");
//        }
//        input.close();

//        int month;
//        System.out.print("Введите номер месяца: ");
//        month = input.nextInt();
//        String s = switch (month) {
//            case 1, 2, 12 -> "Зима";
//            case 3, 4, 5 -> "Весна";
//            case 6, 7, 8 -> "Лето";
//            case 9, 10, 11 -> "Осень";
//            default -> "Такого месяца не существует";
//        };
//        System.out.println(s);
//        input.close();

        int value;
        System.out.print("Введите оценку по 12-бальной системе: ");
        value = input.nextInt();
        System.out.print("Ваш балл по 5-бальной системе");
        switch ((value >= 1 && value <= 3) ? 2 :
                (value >= 4 && value <= 6) ? 3 :
                        (value >= 7 && value <= 9) ? 4 :
                                (value >= 10 && value <= 12) ? 5 : 0) {
            case 2 -> System.out.println(2);
            case 3 -> System.out.println(3);
            case 4 -> System.out.println(4);
            case 5 -> System.out.println(5);
            case 0 -> System.out.println("Нет такой оценки");
        }


    }
}






















