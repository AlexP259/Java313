package lesson18.collection9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        /*.................................................. Queue ..................................................*/
        // У самого малого числа - высший приоритет, он выведется первым. У наибольшего числа - самый маленький приоритет
        // нет гарантии как элементы сохранятся, но есть как удалятся - по алфавиту с "А", и с минимального числа к большему
        // Это не FIFO, не LIFO, а по ПРИОРИТЕТУ



       PriorityQueue<Integer> tasks = new PriorityQueue<>();
        tasks.add(5);
        tasks.add(1);
        tasks.add(9);
        tasks.add(9);
        tasks.add(9);
        tasks.add(2);
        tasks.add(3);
        tasks.add(3);

        System.out.println(tasks.remove());

        while (!tasks.isEmpty()){
            System.out.println(tasks.poll());   // poll удаляет по-приоритету, т.е. первый элемент с головы, а при обращении к пустому элементу выведет null
        }
        System.out.println(tasks.remove()); // remove выбросит исключение NoSuchElementException, если обратится к пустой очереди. Удаляет с головы
//        System.out.println(tasks);

        System.out.println(tasks.peek());   // обращение к элементу с высшим приоритетом - 1, если очередь пуста - вернет null
        System.out.println(tasks.element());   // обращение к элементу с высшим приоритетом - 1, если очередь пуста - выбросит NoSuchElementException


//        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(String::length)); // нет гарантии как элементы сохранятся, но есть как удалятся - по алфавиту с "А"
//        priorityQueue.add("Александр");
//        priorityQueue.add("Игорь");
//        priorityQueue.add("Андрей");
//        System.out.println(priorityQueue);
//
//        while (!priorityQueue.isEmpty()){
//            System.out.println(priorityQueue.remove());
//        }


        int[] nums = {3,1,4,1,5,9,2,6};
        int k = 1;
        int largest = findLargest(nums, k);
        System.out.println(k + " самый большой элемент: " + largest);
        k = 2;
        int largest2 = findLargest(nums, k);
        System.out.println(k + " самый большой элемент: " + largest2);

    }

    public static int findLargest(int[] nums, int n){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int m : nums) {
            minHeap.add(m);
            if (minHeap.size() > n) {
                minHeap.poll();     // удаляет меньший элемент, т.е. элемент с бОльшим приоритетом
            }
        }
        return minHeap.peek();
    }

}





















