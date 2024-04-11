package practics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

public class Practics_10 {
    public static void main(String[] args) {
        /*.............................................. Задание 1 ..................................................*/
        int[] arr1 = new int[10];
        Random rand = new Random();
        arr1 = Arrays.stream(arr1)
                .map(x -> x = rand.nextInt(10, 21))
                .toArray();
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[10];
        arr2 = Arrays.stream(arr2)
                .map(x -> x = (int) (Math.random() * (21 - 10) + 10))
                .toArray();
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0, j = 1; i < arr1.length; i++, j+=2) {
            arr3[j-1] = arr1[i];
            arr3[j] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }


    /*............................................ Методы к заданию ...............................................*/
}
