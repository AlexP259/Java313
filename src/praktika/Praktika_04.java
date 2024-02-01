package praktika;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Praktika_04 {
    public static void main(String[] args) {
        /*...........................................Задание 1......................................................*/
//        printOneNum();
        /*...........................................Задание 2......................................................*/
//        printMultiplicationNums();
    }

    /*..........................................Методы к 1 заданию...................................................*/
//    public static void printOneNum(){
//        System.out.println("Результат: " + oneNum());
//    }
//    public static int oneNum() {
//        Scanner input = new Scanner(System.in);
//        int a, b, c;
//        System.out.print("Введите цифру №1 -> ");
//        a = input.nextInt();
//        System.out.print("Введите цифру №2 -> ");
//        b = input.nextInt();
//        System.out.print("Введите цифру №3 -> ");
//        c = input.nextInt();
//        input.close();
//        return a * 100 + b * 10 + c;
//    }
    /*..........................................Методы к 2 заданию...................................................*/
    public static void printMultiplicationNums() {
        System.out.println("Результат: " + multiplicationNums());
    }
    public static int multiplicationNums() {
        Scanner input = new Scanner(System.in);
        int[] array = new int[4];
        int num, res = 0;
        System.out.print("Введите целое четырёхзначное число -> ");
        try {
            num = input.nextInt();
            if (num < 1000 || num > 9999) {
                throw new Exception("Вы ввели не четырехзначное число. Попробуйте ещё раз");
            }
            array[0] = num / 1000;
            array[1] = (num - (array[0] * 1000)) / 100;
            array[2] = (num - (array[0] * 1000) - (array[1] * 100)) / 10;
            array[3] = num - (array[0] * 1000) - (array[1] * 100) - (array[2] * 10);
            res = array[0] * array[1] * array[2] * array[3];
        } catch (InputMismatchException  e) {
            System.out.println("Вы ввели не целое число. Попробуйте ещё раз");
            res = multiplicationNums();
        } catch (Exception e){
            System.out.println(e.getMessage());
            res = multiplicationNums();
        } finally {
            input.close();
        }
        return res;
    }
}
