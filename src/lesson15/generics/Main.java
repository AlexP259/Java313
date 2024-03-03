package lesson15.generics;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {2, 1, 5, 3, 4};       // обобщения не работают с примитивными типами данных
        Double[] doubleArray = {3.3, 2.2, 1.1, 4.4};
        Character[] charArray = {'G', 'e', 'n', 'e', 'r', 'i', 'c'};
        System.out.println("Массив intArray содержит: ");
        printArray(intArray);
        System.out.println("Массив doubleArray содержит: ");
        printArray(doubleArray);
        System.out.println("Массив charArray содержит: ");
        printArray(charArray);

    }

    public static <T> void printArray(T[] inputArray){
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
