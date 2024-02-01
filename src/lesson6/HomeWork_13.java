package lesson6;

import java.util.ArrayList;

public class HomeWork_13 {
    public static void main(String[] args) {
        int[] arr1 = {3, 8, 9, 4, 1, 2, 5};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(i == 0 ? "[" + arr1[i] + "," :
                    i == arr1.length - 1 ? arr1[i] + "]\n" : arr1[i] + ",");
        }

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(5);
        for (int i = 0; i < arr2.size(); i++) {
            System.out.print(i == 0 ? "[" + arr2.get(i) + "," :
                    i == arr2.size() - 1 ? arr2.get(i) + "]\n\n" : arr2.get(i) + ",");
        }

        maxNumber(arr1);
        maxNumber(arr2);
    }

    public static void maxNumber(int[] arr) {
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            maxNum = arr[i] > maxNum ? arr[i] : maxNum;
        }
        System.out.println(maxNum);
    }
    public static void maxNumber(ArrayList<Integer> arr) {
        int maxNum = 0;
        for (int i : arr) {
            maxNum = i > maxNum ? i : maxNum;
        }
        System.out.println(maxNum);
    }
}
