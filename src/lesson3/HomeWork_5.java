package lesson3;

import java.util.Scanner;

public class HomeWork_5 {
    public static void main(String[] args) {
        int hours;
        String result = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество часов (от 0 до 23): ");
        hours = input.nextInt();
        switch ((hours >= 0 && hours < 6) ? "ночь":
                (hours >= 6 && hours < 13) ? "утро" :
                        (hours >= 13 && hours < 17) ? "день" :
                                (hours >= 17 && hours < 24) ? "вечер" : "ошибка"){
            case "ночь" -> result = "Доброй ночи";
            case "утро" -> result = "Доброе утро";
            case "день" -> result = "Добрый день";
            case "вечер" -> result = "Добрый вечер";
            case "ошибка" -> result = "Вы ввели некорректное значение";
        }
        System.out.println(result);
    }
}
