package lesson18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {
        compareList();
    }

    public static void compareList(){
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1_000_000;
        final int M = 1_000;

        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
//        System.out.println(arrayList);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            arrayList.get((int)(Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
//        System.out.println(arrayList.get((int)(Math.random() * (N - 1))));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            linkedList.get((int)(Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);

    }
}
