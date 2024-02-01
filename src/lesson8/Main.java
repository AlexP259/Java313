package lesson8;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int res = getFactorial(-5);
        System.out.println(res);


//        try {
//            int[] numbers = new int[3];
//            numbers[4] = 2;
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//            System.out.println("Введен некорректный индекс");
//        }


//        try {
//            System.out.print("Введите первое число: ");
//            int a = input.nextInt();
//            System.out.print("Введите второе число: ");
//            int b = input.nextInt();
//            System.out.println(a / b);
//        } catch (InputMismatchException | ArithmeticException e){
//            System.out.println("Вы ввели не целое число или делить на ноль нельзя!");
//        } finally {
//            System.out.println("Конец программы");
//        }

//        catch (InputMismatchException e) {
//            System.out.println("Вы ввели не целое число");
//        } catch (ArithmeticException e){
//            System.out.println("Делить на ноль нельзя!");
//        }

    }

    public static int getFactorial(int n){
        int res = 1;

        try {
            if (n < 1){
                throw new Exception("Число меньше 1 указывать нельзя");
            }
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            res = n;
        }
        return res;
    }
}
