package lesson10;

import java.util.Scanner;

public class HomeWork_16 {
    public static void main(String[] args) {

//        System.out.println(inserSymbInString());  // 1

        System.out.println(inserSymbInStrBild());   // 2


    }

    /*...............................................1 вариант..................................................*/
    public static String inserSymbInString() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String str = input.nextLine().replace("a", "a!");
        input.close();
        return str;
    }


    /*...............................................2 вариант..................................................*/


    public static StringBuilder inserSymbInStrBild() {
        System.out.print("Введите текст: ");
        StringBuilder sb = new StringBuilder(new Scanner(System.in).nextLine());
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a') {
                sb.insert(i + 1, '!');
            }
        }
        return sb;
    }


}
