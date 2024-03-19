package lesson18.collection4;

import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Катя");
        stack.push("Виктор");
        stack.push("Игорь");
        stack.push("Михаил");
        System.out.println(stack);
//        System.out.println(stack.pop());  // pop - последний элемент удаляется
//        System.out.println(stack);
//        while(!stack.isEmpty()){
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }
        System.out.println(stack.get(1));
        stack.set(1, "Лиза");
        System.out.println(stack);
    }
}
