package praktika;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Praktika_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*...........................................Задание 1......................................................*/
//        printParityCheck(input);
        /*...........................................Задание 2......................................................*/
//        printSumOrMultyply(input);
    }

    /*..........................................Методы к 1 заданию...................................................*/
//    public static void printParityCheck(Scanner input){
//        while(input.hasNextInt()){
//            boolean parity = parityCheck(input);
//            System.out.println(parity ? "Even number" : "Odd number");
//        }
//        input.close();
//    }
//    public static boolean parityCheck(Scanner input){
//        int num = 0;
//        System.out.print("Введите число чтобы определить чётность. Для выхода введите букву или символ: ");
//        num = input.nextInt();
//        return (num & 1) == 0;
//    }
    /*..........................................Методы к 2 заданию...................................................*/
//    public static void printSumOrMultyply(Scanner input) {
//        System.out.println("Результат: " + sumOrMultyplyInput(input));
//    }
//    public static int sumOrMultyplyInput(Scanner input) {
//        int aInput = 0, bInput = 0, cInput = 0, choose, result = 0;
//        boolean validInput = false;
//        while (!validInput) {
//            try {
//                System.out.print("Введите три числа.\na -> ");
//                aInput = input.nextInt();
//                System.out.print("b -> ");
//                bInput = input.nextInt();
//                System.out.print("c -> ");
//                cInput = input.nextInt();
//                validInput = true;
//            } catch (InputMismatchException e) {
//                System.out.println("Вы ввели не число. Попробуйте еще раз");
//                input.next();       // очистка буфера ввода
//            }
//        }
//        choose = sumOrMultyplyChoose(input);
//        if (choose == 1) {
//            result = sumNum(aInput, bInput, cInput);
//        } else if (choose == 2) {
//            result = sumMultyply(aInput, bInput, cInput);
//        }
//        return result;
//    }
//    public static int sumOrMultyplyChoose(Scanner input) {
//        int choose = 0;
//        boolean validInput = false;
//        System.out.println("Выберите, какое действие Вы хотите совершить над операндами:\n1) Сложить\n2) Перемножить");
//        while(!validInput){
//            try {
//                choose = input.nextInt();
//                if (choose != 1 && choose != 2) {
//                    throw new Exception ("Вы ввели не номер одного из вариантов. Попробуйте еще раз: \n1) " +
//                            "Сложить\n2) Перемножить");
//                }
//                validInput = true;
//            } catch (InputMismatchException e) {
//                System.out.println("Вы ввели не число. Попробуйте еще раз: \n1) Сложить\n2) Перемножить");
//                input.next();
//            }
//            catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        }
//        return choose;
//    }
//    public static int sumNum(int a, int b, int c) {
//        return a + b + c;
//    }
//    public static int sumMultyply(int a, int b, int c) {
//        return a * b * c;
//    }
}










