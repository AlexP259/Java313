package practics;

import java.util.Arrays;

public class Practics_19 {
    public static void main(String[] args) {
        /*................................................ Задание 1 ................................................*/
//        System.out.println(maxOfThreeNum(3.7, 5.5, 7.5));

        /*................................................ Задание 2 ................................................*/
//        System.out.println("Результат: " + minNum(2, 5, 6, 2.3, 7.3, 1.2, 9, 0.7, 4.5, 5, 2));

        /*................................................ Задание 6 ................................................*/
//        Integer[] arr = {4,2,16,38,9,23,15,97,31,43};
//        Double[] arr2 = {2.3,5.6,2.6,2.5,7.8,4.6};
//        System.out.println(Arrays.toString(bubbleSort(arr2)));

        /*................................................ Задание 7 ................................................*/
//        Number[] arr = {2,4.5,9,15.6,16,23,31,38.3,43,97.2};
//        System.out.println(binarySearch(arr, 0, arr.length - 1, 31));

    }

    /*.............................................. Метод к заданию 1 ..............................................*/
    static <T extends Number> T maxOfThreeNum (T a, T b, T c){
        Double max = a.doubleValue();
        if (b.doubleValue() > max) max = b.doubleValue();
        if (c.doubleValue() > max) max = c.doubleValue();
        return (T) max;
    }
    /*.............................................. Метод к заданию 2 ..............................................*/
    @SafeVarargs
    static <T extends Number> double minNum(T... nums){
        if (nums.length == 0 || nums.length == 1) throw new IllegalArgumentException("Недопустимое " +
                "количество аргументов");
        double min = Double.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i].doubleValue(), min);
        }
        return min;
    }
    /*.............................................. Метод к заданию 6 ..............................................*/
    static <T extends Comparable<T>> T[] bubbleSort(T[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    /*.............................................. Метод к заданию 7 ..............................................*/
    static <T extends Number> int binarySearch(T[] array, double bottomBorder, double topBorder, T searchNum){
        if (topBorder >= bottomBorder){
            int middleBorder = (int) (bottomBorder + (topBorder - bottomBorder) / 2);
            if (array[middleBorder].doubleValue() == searchNum.doubleValue()) {
                return middleBorder;
            }
            if (array[middleBorder].doubleValue() > searchNum.doubleValue()) {
                return binarySearch(array, bottomBorder, middleBorder - 1, searchNum);
            }
                return binarySearch(array,middleBorder + 1, topBorder, searchNum);
        }
        return - 1;
    }
}




















