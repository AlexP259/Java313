package lesson18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class HomeWork_30 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(rand.nextInt(0, 101));
        }
        System.out.println(array);
        System.out.println("Максимальный элемент: " + maxNum(array));
        System.out.println("Минимальный элемент: " + minNum(array));
        System.out.println("Среднее арифметическое: " + averageNum(array));

    }

    static int minNum(ArrayList<Integer> arr) {
        int min = Integer.MAX_VALUE;
        for (Integer i : arr) {
            min = Math.min(i, min);
        }
        return min;
    }

    static int maxNum(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        Iterator<Integer> iter = arr.iterator();
        while (iter.hasNext()) {
            int n = iter.next();
            max = Math.max(n, max);
        }
        return max;
    }

    static String averageNum(ArrayList<Integer> arr){
        double sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        String str = String.valueOf(sum / arr.size()).replace('.', ',');
        return str;
    }

}
