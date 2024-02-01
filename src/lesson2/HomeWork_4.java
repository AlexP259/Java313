package lesson2;

import java.util.Scanner;

public class HomeWork_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kopValue;
        System.out.print("Введите число от 1 до 99: ");
        kopValue = input.nextInt();
        input.close();
        if (kopValue >= 1 && kopValue <= 99) {
            if (kopValue >= 11 && kopValue <= 14 || kopValue % 10 == 0 || kopValue % 10 >= 5 && kopValue % 10 <= 9) {
                System.out.print(kopValue + " копеек");
            } else if (kopValue % 10 == 1) {
                System.out.print(kopValue + " копейка");
            } else if (kopValue % 10 >= 2 && kopValue % 10 <= 4) {
                System.out.print(kopValue + " копейки");
            }
        } else {
            System.out.println("Вы ввели значение меньше 1 или больше 99");
        }
    }
}
