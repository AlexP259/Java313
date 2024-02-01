package searchTypes;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {

        int[] arr = {89, 57, 91, 47, 95, 3, 27, 22, 67, 99};
        arr = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        int index = binarySearch(arr,67);
        System.out.printf("Число %1$d имеет индекс %2$d в отсортированном массиве", 67, index);

    }


    /*.........................................Итеративный подход....................................................*/
    public static int binarySearch(int[] arr, int elementToSearch){
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        //  условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex){
            int middleIndex = (firstIndex + lastIndex) / 2;
            //  если средний элемент - целевой элемент, вернуть его индекс
            if (arr[middleIndex] == elementToSearch){
                return middleIndex;
            }

            //  если средний элемент меньше
            //  направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (arr[middleIndex] < elementToSearch){
                firstIndex = middleIndex + 1;
            }

            //  если средний элемент больше
            //  направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (arr[middleIndex] > elementToSearch){
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }



    /*.........................................Рекурсивный подход....................................................*/
//    public static int recursiveBinarySearch(int[] array, int firstElement, int lastElement){
//        //  условия прекращения
//    }






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

}
