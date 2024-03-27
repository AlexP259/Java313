package lesson18.collection9;

import java.util.ArrayDeque;

public class Program {
    public static void main(String[] args) {
        /*............................................... ArrayDeque ...............................................*/
        // Двунаправленная очередь

        ArrayDeque<String> states = new ArrayDeque<>();
        states.add("red");
        states.addFirst("blue");
        states.push("white");   // push тоже добавит в начало списка
        states.addLast("green");
        states.add("black");    // add тоже добавит в конец
        System.out.println(states);

//        System.out.println(states.getFirst());
//        System.out.println(states.getLast());
//        System.out.println(states.size());

        while (states.peek() != null) {
            System.out.println(states.pop());   // удалит первый элемент
        }

        System.out.println(states);
    }
}
