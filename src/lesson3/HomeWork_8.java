package lesson3;

import java.util.Scanner;

public class HomeWork_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Введите элементы массива:\nn = ");
        n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("-> ");
            arr[i] = input.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]){
                System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + " ");
            }
        }
        input.close();
    }
}
