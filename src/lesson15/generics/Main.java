package lesson15.generics;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{2, 1, 5, 3, 4};
        Double[] doubleArray = new Double[]{3.3, 2.2, 1.1, 4.4};
        Character[] charArray = new Character[]{'G', 'e', 'n', 'e', 'r', 'i', 'c'};
        System.out.println("Массив intArray содержит: ");
        printArray(intArray);
        System.out.println("Массив doubleArray содержит: " + printArray(doubleArray));
        printArray(doubleArray);
        System.out.println("Массив charArray содержит: ");
        printArray(charArray);

    }

    public static <T> Integer printArray(T[] inputArray){
        for (T t : inputArray) {
            System.out.printf("%s ", t);
        }
        System.out.println();
        return 0;
    }
}
