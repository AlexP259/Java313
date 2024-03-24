package lesson18.collection6;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try{
            List<Integer> numbers = readNumbers();
            checkDuplicates(numbers);
            System.out.println("Нет дубликатов");
        } catch (Duplicate_Number_Exception e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static List<Integer> readNumbers(){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите кол-во чисел: ");
        int count = input.nextInt();
        System.out.println("Введите числа: ");
        for (int i = 0; i < count; i++) {
            System.out.print("-> ");
            numbers.add(input.nextInt());
        }
        return numbers;
    }

    public static void checkDuplicates(List<Integer> numbers) throws Duplicate_Number_Exception{
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : numbers) {
            if (uniqueNumbers.contains(num)) {  // Новый элемент уже и так не добавится, т.к. это Set, но мы проверяем
                throw new Duplicate_Number_Exception("Обнаружен повторяющийся номер: " + num);
            }
            uniqueNumbers.add(num);
        }

    }
}
