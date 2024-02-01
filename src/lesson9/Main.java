package lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String str1 = "Hello";
//        String str2 = "Work";
//        String message = str1 + " " + str2;
//        System.out.println(message);
//
//        char[] helloArray = {'П', 'р', 'и', 'в', 'е', 'т', '.'};
//        String helloString = new String(helloArray);
//        System.out.println(helloString);
//
//        String str = "2";
//        int a = 5;
//        String newStr = str + a;
//        System.out.println(newStr);
//
//        int b = 3;
//        String st = b + "";
//        System.out.println(st);

//        String str = "2";
//        int a = Integer.parseInt(str);
//        String str2 = "7.5";
//        double b = Double.valueOf(str2);
//        System.out.println(a);
//        System.out.println(b);

//        String name = "Hello";
//        int count = name.length();  // длина строки
//        System.out.println(count);

//        String name = "Nikita";
//        String name2 = name.toLowerCase();  // преобразование символов в нижний регистр
//        String name3 = name.toUpperCase();  // преобразование символов в верхний регистр
//        System.out.println(name2);
//        System.out.println(name3);
//        char res = name.charAt(2);      // возвращает символ по индексу
//        System.out.println(res);

//        String text = "Частотный словарь букв русского алфавита. Создадим массив нужной длины" +
//                ", и будем хранить в соответствующих позициях количество вхождений символов.";
//        System.out.println(text);
//        text = text.toLowerCase();
//        int[] result = new int['я' - 'а' + 1];
//        for (int i = 0; i < text.length(); i++) {
//            char ch = text.charAt(i);
//            if (ch >= 'а' && ch <= 'я'){
//                result[ch - 'а']++;
//            }
//        }
//        for (int i = 0; i < result.length; i++) {
//            System.out.println((char) (i + 'а') + " = " + result[i]);
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите адрес сайта: ");
//        String path = input.nextLine();
//
//        char[] chars = path.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == '/'){
//                chars[i] = '\\';
//            }
//        }
//        String res = new String(chars);
//        System.out.println(res);

//        String str = "  I learning Java   ";
//        System.out.println(str);
//        System.out.println(str.indexOf("Java"));  // вернет первое вхождение символа или подстроки. Вернет - 1, если не нашел
//        System.out.println(str.lastIndexOf("Java"));    // ищет с конца
//        System.out.println(str.trim());     // Удаляет пробельные символы с начала и конца строки

//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите ФИО: ");
//        String name = input.nextLine();
//        String[] res = name.split(" ");
//        System.out.println(res[0] + " " + res[1].charAt(0) + "." + res[2].charAt(0) + ".");

//        String res = String.join(":", "01", "23", "45", "67");
//        System.out.println(res);

//        String[] text = new String[]{"Hello", "world"};
//        String str = String.join(" ", text);
//        System.out.println(str);

//        String text = "Я изучаю C++. Мне нравится C++";
//        System.out.println(text);
//        String[] array = text.split("C\\+\\+");
//        String res = String.join("Java", array);
//        System.out.println(res);


//        String tx = text.replace("C++", "Java");
//        System.out.println(tx);


//        String s1 = "Hello";
//        String s2 = "Hello1";
//        String s3 = "HELLO";
//        System.out.println(s1.equals(s2));        // сравнение строк на равенство
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equalsIgnoreCase(s3));  // сравнение строк регистронезависимое


//        System.out.println("I learning Java".endsWith("Java"));    // заканчивается ли строка заданной подстрокой
//        System.out.println("I learning Java".startsWith("I"));    // начинается ли строка заданной подстрокой
//        System.out.println("I learning Java".contains("rni"));    // содержит ли строка заданной подстрокой


//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите название документа: ");
//        String path = input.nextLine();
//        if (path.endsWith(".jpg") || path.endsWith(".jpeg")){
//            System.out.println("Это изображение");
//        } else if (path.endsWith(".docx") || path.endsWith(".doc")){
//            System.out.println("Это документ Word");
//        } else {
//            System.out.println("Неизвестный формат");
//        }


//        String s = "I learning Java";
//        int n;
//        n = s.codePointAt(0);   // код символа по его индексу в строке
//        System.out.println(n);
//        n = s.codePointBefore(4);   // код символа перед указанным индексом
//        System.out.println(n);


//        String s;
////        double d = 3.8567;
////        int d = -3906;
////        char d = '+';
//        boolean d = true;
//        s = String.valueOf(d);
//        System.out.println(s);


//        String str = "A";
//        System.out.println("A > m : " + str.compareTo("m"));    // лексикографическое сравнение двух строк. Тут - кодов символов
//        str = "m";
//        System.out.println("m > 1 : " + str.compareTo("a"));
//        System.out.println("m == m : " + str.compareTo("m"));


        /*................................3 класса для работы со строками..........................................*/
        //  String          - неизменяемые строки

        //              Методы одинаковые, наследуются от 1 абстрактного класса:
        //  StringBuilder   -  быстрее работает с 1 потоком
        //  StringBuffer    -


//        StringBuilder sb = new StringBuilder();
////        sb.append('a');
////        sb.append(10);
////        sb.append(" " + 416478L);
////        sb.append(12.42);
//        sb.append("Hello")
//                .append("_")
//                .append("World");
//        System.out.println(sb);
//        sb.insert(5, "_!");
//        System.out.println(sb);
//        sb.replace(sb.indexOf("_"), sb.indexOf("W"), "222");
//        System.out.println(sb);
//        sb.delete(5, 8);
//        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);
//        System.out.println(sb.indexOf("l"));

//        StringBuilder sb1 = createStr(5, 3);
//        modifyStr(sb1, "=", "равно");
//        modifyStr(sb1, "+", "плюс");
//        modifyStr(sb1, "-", "минус");
//        modifyStr(sb1, "*", "умножить на");
//        System.out.println(sb1);

//        StringBuilder modStr = getStringBuilder();
//        System.out.println("Измененная строка - \"" + modStr + "\"");

//        String str = "Hello, World!";
//        int lowCase = 0, uppCase = 0;
//        for (int i = 0; i < str.length(); i++) {
//            lowCase += str.charAt(i) >= 97 && str.charAt(i) <= 122 ? 1 : 0;
//            uppCase += str.charAt(i) >= 65 && str.charAt(i) <= 90 ? 1 : 0;
//        }
//        System.out.println("lowCase: " + lowCase);
//        System.out.println("uppCase: " + uppCase);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            }
        }
        System.out.println("Количество заглавных букв: " + upperCaseCount);
        System.out.println("Количество строчных букв: " + lowerCaseCount);
    }


//    public static StringBuilder createStr(int a, int b){
//        StringBuilder sb1 = new StringBuilder();
//        sb1.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
//        sb1.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
//        sb1.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
//        return sb1;
//    }
//
//    public static StringBuilder modifyStr(StringBuilder stBuild, String oldStr, String newStr){
//        int pos;
//        while((pos = stBuild.indexOf(oldStr)) != -1){
//            stBuild.replace(pos, pos + 1, newStr);
//        }
//
//        return stBuild;
//    }

//    public static StringBuilder getStringBuilder(){
//        System.out.print("Исходная строка - \"");
//        String str = " Текст с  повторяющимися символами ";
//        System.out.println(str + "\"");
//        StringBuilder modify = new StringBuilder(str.replace(" ", ""));
//        for (int i = 0; i < modify.length(); i++) {
//            for (int j = modify.length() - 1; j > i; j--) {
//                if (modify.charAt(i) == modify.charAt(j)){
//                    modify.deleteCharAt(j);
//                }
//            }
//        }
//        return modify;
//        }


}
