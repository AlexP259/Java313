package practics;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Practics_09 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        /*.............................................Задание 1...................................................*/
//        System.out.println("Ну, введите строку, а мы её развернём. Зачем? Да просто потому, что можем!");
//        String str = input.nextLine();
//        str = revers(str);
//        System.out.println(str);

        /*.............................................Задание 2...................................................*/
//        System.out.println("Слово встречается в предложении " + howManyRepeat() + " раз");

        /*.............................................Задание 3...................................................*/
//        System.out.println(replaceWord());

        /*.............................................Задание 4...................................................*/
//        System.out.println(palindromeOrNot());

        /*.............................................Задание 5...................................................*/
        String text = "есть некоторый 13 текст. реализуйте следующую функциональность2. изменить текст таким" +
                " образом, чтобы каждое предложение начиналось с большой буквы. посчитайте сколько34 раз цифры  " +
                "встречаются4 в тексте... посчитайте сколько ра5з знаки препинания встреча6ются в тексте. " +
                "Посчитайте колич71ество предложений в тексте...";
        System.out.println(upperCaseFirstLetter(text));
        System.out.println("Чисел в тексте: " + counterNums(text));
        System.out.println("Знаков препинания в тексте: " + punctuationMarks(text));
        System.out.println("Предложений в тексте: " + numOfSentence(text));



    }


    /*...........................................Метод к заданию 1..................................................*/
//    public static String revers(String str){
//        return new StringBuilder(str).reverse().toString();
//    }

    /*...........................................Методы к заданию 2..................................................*/
//    public static String[] lineAndSearchWord(){
//        String[] arr = new String[2];
//        System.out.print("Введите строку: ");
//        arr[0] = input.nextLine();
//        System.out.print("Введите искомое слово: ");
//        arr[1] = input.nextLine();
//        return arr;
//    }
//
//    public static int howManyRepeat(){
//        String[] arr = lineAndSearchWord();
//        String line = arr[0];
//        String word = arr[1];
//
//        String[] lineArr = line.split(" ");
//        int counter = 0;
//        for (int i = 0; i < lineArr.length; i++) {
//            if (lineArr[i].equals(word)) counter++;  // а если метод contains, то посчитает если слово будет подстрокой
//        }
//        return counter;
//    }

    /*...........................................Методы к заданию 3..................................................*/
//    public static String replaceWord() {
//        System.out.print("Введите строку: ");
//        String str  = input.nextLine();
//        System.out.print("Введите искомое слово: ");
//        String replacedWord = input.nextLine();
//        System.out.print("Введите слово для замены: ");
//        String wordForReplace = input.nextLine();
//        return replaceWord(str, replacedWord, wordForReplace);
//    }
//    public static String replaceWord(String str, String replacedWord, String wordForReplace ){
//        return  str.replace(replacedWord, wordForReplace);
//    }

    /*...........................................Методы к заданию 4..................................................*/
//    public static boolean palindromeOrNot() {
//        String str = enterTheValues();
//        String withoutSpace = "";
//        String revers = "";
//        String[] words = str.split(" ");
//        for (int i = 0; i < words.length; i++) {
//            withoutSpace += words[i];
//        }
//        for (int i = withoutSpace.length() - 1; i >= 0; i--) {
//            revers += withoutSpace.substring(i, i+1);
//        }
//        System.out.println(withoutSpace);
//        System.out.println(revers);
//        return withoutSpace.equalsIgnoreCase(revers);
//    }
//
//    public static String enterTheValues() {
//        System.out.print("Введите слово или предложение -> ");
//        return input.nextLine();
//    }

    /*...........................................Методы к заданию 5..................................................*/
    public static String upperCaseFirstLetter(String text){
        String[] arr = text.split("\\. ");
        System.out.println(Arrays.toString(arr).replaceAll("[\\[\\]]", ""));
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += i == arr.length - 1 ? String.valueOf(arr[i].charAt(0)).toUpperCase() +
                    arr[i].substring(1) : String.valueOf(arr[i].charAt(0)).toUpperCase() +
                    arr[i].substring(1) + ". ";
        }
        return result;
    }

    public static int counterNums(String text){
        int counter = 0;
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex); // метод компилирует заданное регулярное выражение в шаблон (паттерн)
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            counter++;
        }
        return counter;
    }

    public static int punctuationMarks(String text){
        int counter = 0;
        String regex = "(\\.{3}|[.,](?![.,]))";
        Pattern pattern = Pattern.compile(regex); // метод компилирует заданное регулярное выражение в шаблон (паттерн)
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            counter++;
        }
        return counter;
    }

    public static int numOfSentence(String text){
        String[] split = text.split("\\.");
        int counter = 0;
        for (String s : split) {
            counter++;
        }
        return counter;
    }

}









