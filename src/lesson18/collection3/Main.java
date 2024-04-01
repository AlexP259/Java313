package lesson18.collection3;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Сергей");
        vector.add("Михаил");
        vector.add("Николай");
        vector.add("Виктор");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.get(1));
        System.out.println(vector);
    }
}
