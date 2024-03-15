package lesson15.generics.sample_5;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] massivInt = {1, 2, 3, 4, 5, 6};
        String[] massivStr = {"red", "green", "orange"};

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(massivInt));
        ArrayList<String> colors = new ArrayList<>(Arrays.asList(massivStr));

        System.out.println("Исходный список чисел: " + numbers.toString().replaceAll("[\\[\\],]", ""));
        System.out.println("Исходный список цветов: " + colors.toString().replaceAll("[\\[\\],]", "") + "\n");

        ArrayList<Integer> revNums = reverseList(numbers);
        ArrayList<String> revColors = reverseList(colors);

        System.out.println("Перевернутый список чисел: " + revNums.toString().replaceAll("[\\[\\],]", ""));
        System.out.println("Перевернутый список цветов: " + revColors.toString().replaceAll("[\\[\\],]", ""));
    }

    public static <T> ArrayList<T> reverseList(ArrayList<T> originalList) {
        ArrayList<T> reversedList = new ArrayList<>();

        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        return reversedList;
    }
}
