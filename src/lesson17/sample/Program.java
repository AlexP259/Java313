package lesson17.sample;

import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args) {
        String text = "Лямбда выражение";
        System.out.println("Исходная строка: " + text);
        // Переменная s - в интерфейсе это переменная tx. s - принимаемый в методе аргумент. " -> " - показывает,
        // что это лямбда-выражение. После стрелки не нужны фигурные скобки и ключевое слово "return", но только
        // при условии, что строка одна
        WordCounter wordCounter = s -> s.split("\\s+").length;
        int ctr = wordCounter.countWords(text);
        System.out.println("Кол-во слов в строке: " + ctr);


        text = "Программа, которая подсчитывает количество слов в предложении";
        wordCounter = s -> s.split("о").length - 1;
        System.out.println("Исходная строка: " + text);
        ctr = wordCounter.countWords(text);
        System.out.println("Кол-во букв \"о\" в строке: " + ctr);


    }
}


interface WordCounter{
    int countWords(String tx);      // один абстрактный метод, можем применять лямбды
}