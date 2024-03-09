package lesson16;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try{
            a = getNumber("Введите первое число");
            b = getNumber("Введите второе число");
        } catch (NumberFormatException e){
            System.out.println("Одно или оба значения некорректны");
        }


        System.out.println("Результат: " + (a + b));
    }

    public static int getNumber(String message) throws NumberFormatException{
        Scanner input = new Scanner(System.in);
        System.out.print(message + ": ");
        String s = input.nextLine();

        return Integer.parseInt(s);
    }
}
