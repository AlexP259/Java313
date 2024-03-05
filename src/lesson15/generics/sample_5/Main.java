package lesson15.generics.sample_5;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("red", "green", "orange"));

        System.out.println("Исходный список чисел: " + numbers);
        System.out.println("Исходный список цветов: " + colors);

        ArrayList<Integer> reversedNumbers = reverseList(numbers);
        ArrayList<String> reversedColors = reverseList(colors);

        System.out.println("Развернутый список чисел: " + reversedNumbers);
        System.out.println("Развернутый список цветов: " + reversedColors);
    }


    static <T> ArrayList<T> reverseList(ArrayList<T> originalList){
        ArrayList<T> reversedList = new ArrayList<>();

        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        return reversedList;
    }

}
