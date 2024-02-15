package practics;

import java.util.Scanner;

public class Practics_07 {
    public static void main(String[] args) {
        /*...........................................Задание 5......................................................*/
        printSymbLine();

    }

    /*..........................................Методы к 5 заданию...................................................*/
    public static void printSymbLine(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int countOfSymb = input.nextInt();
        for (int i = 0; i < countOfSymb; i++) {
            System.out.print("*");
        }

    }


}
