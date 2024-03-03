package practics.practics_18.exercise_1;

import practics.practics_18.exercise_2.IMath;
import practics.practics_18.exercise_3.ISort;

public class Array implements IShow, IMath, ISort{
    private int[] arr;

    public Array(int[] arr) {
        this.arr = arr;
    }

    /* Методы интерфейса IShow */

    @Override
    public void print() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Override
    public void print(String info) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(info);
    }

    /* Методы интерфейса IMath */

    @Override
    public int max() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }

    @Override
    public int min() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }
        return min;
    }

    @Override
    public float avg() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (float) sum / arr.length;
    }

    /* Методы интерфейса ISort*/

    @Override
    public void sortAsc() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
    }

    @Override
    public void sortDesc() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
