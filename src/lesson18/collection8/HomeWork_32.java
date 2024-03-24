package lesson18.collection8;

import java.util.Scanner;
import java.util.TreeSet;

public class HomeWork_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println("Введите 5 целых чисел");
        for (int i = 0; i < 5; i++) {
            System.out.print("-> ");
            treeSet.add(input.nextInt());
        }
        System.out.println("Наименьший элемент в TreeSet: " + treeSet.first());
    }
}
