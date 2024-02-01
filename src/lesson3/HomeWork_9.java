package lesson3;

import java.util.Arrays;

public class HomeWork_9 {
    public static void main(String[] args) {

        int[] arr = new int[10];    // массив на 10 элементов
        boolean repeat;             // переменная повтора. Истина - есть повтор, ложь - нет повтора

        for (int i = 0; i < arr.length; i++) {
            do {
                arr[i] = (int) (Math.random() * 10);
                repeat = false;                     // положим, значение уникально, ранее его не было
                for (int j = 0; j < i; j++) {       // цикл проверки на повтор
                    if (arr[j] == arr[i]) {
                        repeat = true;              // если элементы равны, присваиваем переменной repeat истину
                        break;                      // и прерываем вложенный цикл for
                    }
                }
            } while (repeat);
        }
        System.out.println(Arrays.toString(arr));
    }
}
