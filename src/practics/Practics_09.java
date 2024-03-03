package practics;

import java.util.Scanner;
import java.lang.StringBuilder;

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
    }


    /*...........................................Метод к заданию 1..................................................*/
//    public static String revers(String str){
//        return new StringBuilder(str).reverse().toString();
//    }

    /*...........................................Метод к заданию 2..................................................*/
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

    /*...........................................Метод к заданию 3..................................................*/
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

    /*...........................................Метод к заданию 4..................................................*/
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
}









