package sortingTypes;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {89, 57, 91, 47, 95, 3, 27, 22, 67, 99};
        arr = bubbleSort2(arr);
        System.out.println(Arrays.toString(arr));
    }




    /*.....................................Два метода сортировки пузырьком..........................................*/

    public static int[] bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }


    public static int[] bubbleSort2(int[] array){
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }
}
