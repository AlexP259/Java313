package lesson15.generics.sample_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PrintList<Integer> pl = new PrintList<>();      // создаем экземпляр нашего класса PrintList
        for (int i = 0; i < 10; i++) {
            pl.add(i);
        }
        pl.printList(false);
        System.out.println();
        pl.printList(true);
        System.out.println();

        PrintList<String> pl2 = new PrintList<>();
        for (char i = 32; i < 127; i++) {
            pl2.add(Character.toString(i));
        }
        pl2.printList();
    }
}


class PrintList<T> {
    private ArrayList<T> list;

    public PrintList() {
        // при отработке конструктора PrintList, полю list, которое является ссылочным типом данных ArrayList<T>
        // присваивается новый объект ArrayList<T>
        this.list = new ArrayList<T>();
    }

    public void add(T data) {
        this.list.add(data);
    }

    public void printList(boolean isOdd) {
        int size = this.list.size();
        if (isOdd) {
            for (int i = 1; i < size; i += 2) {
                System.out.print(this.list.get(i) + " ");
            }
        } else {
            for (int i = 0; i < size; i += 2) {
                System.out.print(this.list.get(i) + " ");
            }
        }
    }

    public void printList() {
        int size = this.list.size();
        for (T t : this.list) {
            System.out.print(t + " ");
        }
    }
}