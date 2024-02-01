package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 7;
//        int b = 3;
//        int c = 5;
//        double d = 7.2;
//        int res1 = sum(a, b);
//        int res2 = sum(a, b, c);
//        System.out.println(res1);
//        System.out.println(res2);
        double num1 = getNumber();
//        System.out.println("num1 " + num1);
        double num2 = getNumber();
//        System.out.println("num1 " + num2);
        char operation = getOperation();
//        System.out.println(operation);
        double result = calc(num1, num2, operation);
        System.out.println("Результат: " + result);

    }

    public static double getNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (input.hasNextDouble()) return input.nextDouble();
        else {
            System.out.println("Ошибка при вводе. Повторите ввод.");
            return getNumber();
        }
    }

    public static char getOperation(){
        Scanner input = new Scanner(System.in);
        System.out.print("1 - сумма\n" +
                "2 - разность\n" +
                "3 - произведение\n" +
                "4 - частное\n" +
                "Выберете номер операции: ");
        int operationNumber = 0;
        if (input.hasNextInt()) {
            operationNumber = input.nextInt();
            switch (operationNumber){
                case 1: return '+';
                case 2: return '-';
                case 3: return '*';
                case 4: return '/';
                default:
                    System.out.println("Неправильная операция. Повторите ввод.");
                    return getOperation();
            }
        }
        else {
            System.out.println("Вы ввели не число. Повторите ввод.");
            return getOperation();
        }
    }

    public static double calc(double num1, double num2, char operation){
        switch (operation){
            case '+': return add(num1, num2);
            case '-': return sub(num1, num2);
            case '*': return mul(num1, num2);
            case '/': return div(num1, num2);
            default: return Double.NaN;
        }

    }

    public static double add(double num1, double num2){
        return num1 + num2;
    }

    public static double sub(double num1, double num2){
        return num1 - num2;
    }

    public static double mul(double num1, double num2){
        return num1 * num2;
    }

    public static double div(double num1, double num2){
        if (num2 != 0.0){
            return num1 / num2;
        } else {
            System.out.println("На 0 делить нельзя!");
            return Double.NaN;
        }

        
    }

//    public static int sum(int n1, int n2){
//        int sum = n1 + n2;
//        return sum;
//    }

//    public static int sum(int n1, int n2, int n3){
//        int sum = n1 + n2 + n3;
//        return sum;
//    }



}
