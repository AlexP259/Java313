package lesson10;

import java.util.Scanner;
import java.util.InputMismatchException;

public class HomeWork_18_2 {
    public static void main(String[] args) {
        printX0();
    }
    public static void printX0(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        try{
            int n = input.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(((j + i) & 1) == 0 ? "X" + "  " : "0" + "  ");
                }
                System.out.println();
            }
        } catch(InputMismatchException e){
            System.out.println("Вы ввели не целое число. Попробуйте еще раз");
            printX0();
        } finally {
            input.close();
        }
    }
}
