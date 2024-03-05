package lesson15.homeWork_27;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        twoArrays();
    }

    public static void twoArrays (){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов числового массива: ");
        int length = input.nextInt();
        Integer[] numArray = new Integer[length];
        for (int i = 0; i < numArray.length; i++){
            System.out.print("-> ");
            numArray[i] = input.nextInt();
        }
        System.out.print("Введите количество элементов массива строк: ");
        length = input.nextInt();
        input.nextLine();
        String[] strArray = new String[length];
        for (int i = 0; i < strArray.length; i++){
            System.out.print("-> ");
            strArray[i] = input.nextLine();
        }
        input.close();
        printArray(numArray);
        printArray(strArray);
    }

    public static <T> void printArray(T[] array){
        System.out.println("Массив: " + Arrays.toString(array).replaceAll("[\\[\\],]", " "));
    }
}


