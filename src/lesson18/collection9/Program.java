package lesson18.collection9;

import java.util.ArrayDeque;

public class Program {
    public static void main(String[] args) {
        /*............................................... ArrayDeque ...............................................*/
        // Двунаправленная очередь

        ArrayDeque<String> states = new ArrayDeque<>();
        states.add("red"); // add добавит в конец списка
        states.addFirst("blue");// addFirst добавит в начало списка
        states.push("white");   // push тоже добавит в начало списка
        states.addLast("green"); // addLast добавит в конец
        states.add("black");    // add тоже добавит в конец
        System.out.println(states);

//        System.out.println(states.getFirst());
//        System.out.println(states.getLast());
//        System.out.println(states.size());
        System.out.println(states.pop());
        System.out.println(states.poll());
        System.out.println(states.peek());
        System.out.println(states.remove());

        System.out.println("==================");


        while (states.peek() != null) {
            System.out.println(states.pop());   // удалит первый элемент
        }

        System.out.println(states);
        System.out.println(states.peek());
        System.out.println(states.poll());
        System.out.println(states.pop());
        System.out.println(states.remove());
    }
}
