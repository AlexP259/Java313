package lesson18.collection4;

import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Катя");
        stack.push("Виктор");
        stack.push("Игорь");
        stack.push("Михаил");
        stack.push("Света");
        System.out.println(stack);
//        System.out.println(stack.pop());  // pop - вернет последний элемент, потом он удаляется
//        System.out.println(stack);
//        while(!stack.isEmpty()){
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }

        stack.addFirst("Лиза");
        System.out.println(stack);
        System.out.println(stack.pop());
    }
}
