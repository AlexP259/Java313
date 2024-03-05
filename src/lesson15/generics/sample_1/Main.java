package lesson15.generics.sample_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PrintList<Integer> pl = new PrintList<>();
        for (int i = 0; i < 10; i++) {
            pl.add(i);
        }
        pl.printList(true);
        System.out.println();
        pl.printList(false);

        PrintList<String> pl2 = new PrintList<>();
        pl2.add("a");
        pl2.add("b");
        pl2.add("c");
        pl2.add("d");
        pl2.add("e");
        pl2.add("f");
        pl2.add("g");
        System.out.println();
        pl2.printList(false);

    }
}


class PrintList<T> {
    private ArrayList<T> list;

    public PrintList() {
        this.list = new ArrayList<T>();
    }

    public void add(T data) {
        list.add(data);
    }

    public void printList(boolean isOdd) {
        int size = this.list.size();
        if (isOdd) {
            for (int i = 1; i < size; i += 2) {
                System.out.print(list.get(i) + " ");
            }
        } else {
            for (int i = 0; i < size; i += 2) {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
