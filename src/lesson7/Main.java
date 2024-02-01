package lesson7;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


//        System.out.print("На каком этаже Вы находитесь: ");
//        int n1 = input.nextInt();
//        elevator(n1);

//        int[] mas = {1, 3, 5, 7, 9};
//        System.out.println(sumList(0, mas));

//        System.out.println(toStr(254, 16));

        int size;
        System.out.print("Введите размер массива: ");
        size = input.nextInt();
        int[] list = new int[size];

        int option;
        do {
            System.out.println("Меню:\n" +
                    "1. Ввод элементов массива\n" +
                    "2. Отображение массива\n" +
                    "3. Поиск элемента в массиве\n" +
                    "4. Сортировка массива\n" +
                    "5. Выход");
            System.out.print("Сделайте свой выбор: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    readArray(list);
                    break;
                case 2:
                    displayArray(list);
                    break;
                case 3:
                    System.out.print("Введите номер, который Вы хотите найти: ");
                    int item = input.nextInt();
                    int index = searchArray(list, item);
                    if (index == -1) {
                        System.out.println("Элемент не найден");
                    } else {
                        System.out.println("Элемент найден на позиции " + (index + 1));
                    }
                    break;
                case 4:
                    System.out.println("Отсортированный массив: ");
                    sortArray(list);
                    displayArray(list);
                    break;
                case 5:
                default:
            }
        } while (option != 5);

    }

//    public static void elevator(int n){     // базовый случай - условие выхода из рекурсии
//        if (n == 0){
//            System.out.println("Вы в подвале");
//            return;     // прерывает выполнение метода
//        }
//        System.out.println("=> " + n);
//        elevator(n - 1);
//        System.out.print(n + " ");
//    }

//    public static int sumList(int[] arr){
//        int sum = 0;
//        for (int i: arr) {
//            sum += i;
//        }
//        return sum;
//    }

//    public static int sumList(int i, int[] arr){
//        if (i == (arr.length - 1)) {
//            return arr[i];  // arr[i] = 9
//        }
//        return arr[i] + sumList(i + 1, arr);    // arr[i] = 1 + 3 + 5 + 7
//    }

//    public static String toStr(int n, int base){
//        String[] convert = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
//        if (n < base){
//            return convert[n];
//        } else {
//            return toStr(n / base, base) + convert[n % base];
//        }
//    }

    public static void readArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("-> ");
            array[i] = input.nextInt();
        }
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int searchArray(int[] array, int data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


}
