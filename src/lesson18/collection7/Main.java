package lesson18.collection7;

// TreeSet хранит по возрастанию элементы, но есть нюансы. Индексов нет, метода get, соответственно, тоже.

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("b");
        treeSet.add("c");
        treeSet.add("a");
        treeSet.add("2");

        System.out.println(treeSet);
//        treeSet.remove(35);
//        System.out.println(treeSet);
//        System.out.println(treeSet.contains(66));

    }
}
