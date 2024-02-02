package lesson10;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {
    public static void main(String[] args) {
//        String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта. 53074 Ели[-ели]";
//        String pattern = "[205]";       //  [...] - один символ из перечисленных в квадр.скобках
//        String pattern = "[5-9]";       //  [0-9] - диапазон цифр
//        String pattern = "[12][0-9][0-9][0-9]";       //  где не наберется подряд 4 цифры - не выведется
//        String pattern = "[А-яЁё].";       //  строчные буквы, буквы ё идет отдельно. Точка без скобок
//                                               - спецсимвол(один любой символ). Выведет 2 символа (От "а" до "я" + "любой символ")
//        String pattern = "[А-яЁё]\\.";       //  выведет только символы после которых точка
//        String pattern = "[А-яЁё\\[\\]]";       //  заэкранированные спецсимволы
//        String pattern = "[А-я-Ёё\\]-\\[]";       //  ошибка. Диапазон (-) задан от кода символа больше до кода символа меньше
//        String pattern = "[^А-яЁё]";       // циркумфлекс выведет всё, кроме того что стоит далее. У нас - не выведет букв
//        String pattern = "[а-я&&[к-н]]";       // вернет к л м н
//        String pattern = "[а-дк-н]";       // вернет а б в г д к л м н

//        try {
//            String str2 = "Час в 24-часовом формате от 00 до 23. 2021-06-15Т21:45. Минуты, в диапазоне от 00 до 59. 2021-06-15Т01:09";
//            String pattern = "[0-2][0-9]:[0-5][0-9]";
//            Pattern regex = Pattern.compile(pattern);       // regular expression - регулярное выражение
//            Matcher matcher = regex.matcher(str2);
//
//            while (matcher.find()){
//            System.out.println("Шаблон совпадения найден с " + matcher.start() + " до " + matcher.end());
//            System.out.println(str2.substring(matcher.start(), matcher.end()));
//            System.out.println(matcher.group());
//            }
//        } catch (PatternSyntaxException pse) {
//            System.err.println("Неправильное регулярное выражение: " + pse.getMessage());
//            System.err.println("Описание: " + pse.getDescription());
//            System.err.println("Позиция: " + pse.getIndex());
//            System.err.println("Неправильный шаблон: " + pse.getPattern());
//        }


//        String str = "абяё";
//        for (int i = 0; i < str.length(); i++) {
//            System.out.print("\n" + str.charAt(i) + ": " + str.codePointAt(i));
//        }

//        System.out.print("\n" + (char) 0x0430); // можем обратиться к букве по 16-ричному коду юникода, а можем по html-коду 1072

//        String str = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта. 53074 Ели[-ели]. Hello world";
//        String str = "Цифры: 7, +17, -42, 0013, 0.3";
//        String pattern = "[+-]?[\\d.]+";
        // + - от 1 повторения до бесконечности
        // * - от 0 повторений до бесконечности
        // ? - от 0 повторений до 1
        // \\A - поиск шаблона от начала строки (\\AЯ ищу)
        // \\Z - поиск шаблона в конце строки (world\\Z)
        // \\W == [^A-Za-z0-9_] - любой символ кроме буквы, цифры или знака подчеркивания
        // \\w == [A-Za-z0-9_] - один символ из перечисленных, русский не затрагивает. Только английские символы
        // \\S == [^ ] - поиск всего, кроме символа пробела
        // \\s == [ ] - поиск одного символа пробела
        // \\D == [^0-9] - ищем всё, кроме цифр
        // \\d == [0-9] - ищем одну любую цифру

//        String str = "author=Пушкин А.С.; title = Евгений Онегин; price =200; year= 1831";
//        String pattern = "\\w+\\s*=\\s*[^;]+";      // \\w+\\s*=\\s*[А-я0-9\\s.]+
//
//        Pattern regex = Pattern.compile(pattern);       // regular expression - регулярное выражение
//        Matcher matcher = regex.matcher(str);
//
//        while (matcher.find()) {
//            System.out.print(matcher.group() + "\t\t");
//            }

//        String str = "+7 499 456-45-78, +74994564578, 7 (499) 456 45 78, 74994564578, 784994534478";
//        String pattern = "\\+?7[\\d \\-)(]{10,16}";      //  ищем заданное количество повторений
//        // {4} - 4 повторения
//        // {2,} - от 2 повторений до бесконечности
//        // {2,4} - от 2 повторений до 4 включительно
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(str);
//
//        while (matcher.find()) {
//            System.out.print(matcher.group() + "\t\t");
//        }

//        String str = "!!!Java_master";
//        // String pattern = "^\\w+\\s\\w+";
//        String pattern = "^[\\w-]{3,16}$";     // буквы, цифры, _, -, от 3 до 16
//        // ^ - строка должна начинаться с заданного шаблона
//        // $ - строка должна заканчиваться на заданный шаблон
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(str);
//        System.out.print(matcher.find());

//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);   // флаг игнорирует регистр текущего элемента. Работает только с английскими символами


//        String str = "s32ryrty6-_!42@ya.ru RegExr was created by gskinner.com.\t8-705-456-78-98   \n" +
//                "\nEdit the Expression & \t+7-705-456-78-98\tText to see matches. Roll over matches or th|e " +
//                "expression for details. PCRE & JavaScript flavors al-ex@mail.ru of RegEx are supported. Validate your expression " +
//                "with Tests mode.\n\n\tThe side bar includes &al-ex@mail.rua Cheatsheet, full Reference,| and Help. You can also" +
//                " Save & Share with the +7-705-456-78-98Community and view patterns you create al32642@yandex.ruor favorite in My Patterns.\n" +
//                "\nExplore results with the 353Fsg@gmail.com Tools b|elow. Replace & List s32ryrty.6-_!42@ya.ru output custom results. Details lists " +
//                "capture groups. Explain describes your expression in plain English.";
////        String pattern = "(\\+7|8)[\\d-]+";     // ищем номер телефона, найдёт
//        String pattern = "[A-Za-z][\\w-.!~*'()]+@[A-Za-z]+\\.(ru|com)";    // ищем e-mail
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(str);
//        while (matcher.find()) {
//            System.out.print(matcher.group() + "\t\t");
//        }

//        String s = "one\ntwo";
////        String pattern = "(?s)one.\\w+";
//        String pattern = "one$";
//        Pattern regex = Pattern.compile(pattern, Pattern.MULTILINE);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.print(matcher.group() + "\t\t");
//        }

//        String s = "Goods - $500";
//        String pattern = "$500";
//        Pattern regex = Pattern.compile(pattern, Pattern.LITERAL);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.print(matcher.group() + "\t\t");
//        }

//        String s = "Java,\njava,\nJAVA";
//        String pattern = "(?im)^java";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.print(matcher.group() + "\t\t");
//        }

//        String s = "123456@i.ru, 123_456@ru.name.ru, login@i.ru, логин-1@i.ru, login.3@i.ru";
//        String pattern = "[А-яЁё\\w.-]+@[\\w.]+.ru";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.print(matcher.group() + "\t\t");
//        }


//        String s = "<body>Пример жадного соответствия регулярных выражений</body>";
//        String pattern = "<.*?>";       // ? означает брать по минимуму

//        String s = "Егорова Алиса Алексанровна";
//        String pattern = "А.+?а";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group() + "\t\t");
//        }

//        String s = "Word2016, PS6, AI5";
//        String pattern = "([a-z]+)(\\d*)";
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//            System.out.println(matcher.group(1));
//            System.out.println(matcher.group(2));
//        }

//        String s = "abc";
//        String pattern = "(.(.(.)))";
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = regex.matcher(s);
//        matcher.find();
//        System.out.println(matcher.groupCount());
//        for (int i = 0; i <= matcher.groupCount(); i++) {
//            System.out.println(i + ": " + matcher.group(i));
//        }

//        String s = "Ольга и Виталий отлично учатся!";
//        String pattern = "Петр|Ольга|Виталий";
//        String s = "int = 4, float = 4.0f, double = 8.0";
//        String pattern = "\\w+\\s*=\\s*\\d[.\\w]*";
//        String pattern = "int\\s*=\\s*\\d[.\\w]*|float\\s*=\\s*\\d[.\\w]*";
//        String pattern = "(int|float)\\s*=\\s*\\d[.\\w]*";
//        String pattern = "(int|float)\\s*=\\s*(\\d[.\\w]*)";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//            System.out.println(matcher.group(1));
//            System.out.println(matcher.group(2));
//        }

//        String s = "127.0.0.1";
////        String pattern = "\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}";
//        String pattern = "(\\d{1,3}.){3}\\d{1,3}";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }

//        String s = "18-10-2024";
//        String pattern = "(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(19[0-9][0-9]|20[0-9][0-9])";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }

//        String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта.";
//        String[] arr = s.split("[.2]");
//        for (String temp : arr) {
//            System.out.println(temp);
//        }

//        Pattern p = Pattern.compile(",\\s");
//        String[] arr = p.split("Суворова Виктория, Россия, г. Сочи, +7 999 555-77-33");
//        for (String temp : arr) {
//            System.out.println(temp);
//        }

//        String s1 = "05.03.1987 // Дата рождения";
////        String s2 = s1.replaceAll("\\s*//..*", "");
////        System.out.println("Дата рождения: " + s2);     // Дата рождения: 05-03-1987
//        String s2 = s1.replaceAll("\\s*//..*", "").replaceAll("-", ".");
//        System.out.println("Дата рождения: " + s2);     // Дата рождения: 05.03.1987



        /*......................................Побитовые операторы.................................................*/

        // Побитовое И
//        System.out.println(0b111 & 0b000);  // 7 & 0 => 0
//        System.out.println(0b111 & 0b001);  // 7 & 1 => 1
//        System.out.println(0b111 & 0b010);  // 7 & 1 => 2

        // Побитовое ИЛИ
//        System.out.println(0b101 | 0b010);  // 5 | 2   (0b111)   => 7
//        System.out.println(0b011 | 0b100);  // 3 | 4   (0b111)   => 7
//        System.out.println(0b010 | 0b100);  // 2 | 4   (0b110)   => 6

        // Исключающее побитовое ИЛИ
//        System.out.println(0b110 ^ 0b101);  // 6 ^ 5   (0b011)   => 3
//        System.out.println(0b101 ^ 0b010);  // 5 ^ 2   (0b111)   => 7
//        System.out.println(0b100 ^ 0b111);  // 4 ^ 7   (0b011)   => 3

        // Побитовое НЕ
//        System.out.println(~0b0);
//        System.out.println(~0b1);
//        System.out.println(~0b10);
//        System.out.println(~0b100);
//        System.out.println(~0b101);
//        System.out.println(~0b110);
//        System.out.println(~0b111);
//        System.out.println(~0);
//        System.out.println(0b11111111111111111111111111111111);
//        System.out.println(~1);
//        System.out.println(0b11111111111111111111111111111110);


//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int number = input.nextInt();
//        if((number & 1) == 0){       // number % 2 == 0
//            System.out.println(number + " - четное число");
//        }
//        if((number & 1) == 1){       // number % 2 != 0      number % 2 == 1
//            System.out.println(number + " - нечетное число");
//        }


//        int x = 1;
//        double y = 3.1515d;
//        x = (int)(x + y);
//        x = x + (int)y;
//        x += y;
//        System.out.println(x);


//        int x = 5, y = 7;
//        System.out.println("x = " + x + ", y = " + y);
////        x = x ^ y;      // x == 2   101 ^ 111 == 010 (2)
////        y = x ^ y;      // y == 5   010 ^ 111 == 101 (5)
////        x = x ^ y;      // x == 7   010 ^ 101 == 111 (7)
//        x ^= (y ^= x);
//        y ^= x;
//        System.out.println("x = " + x + ", y = " + y);


//        System.out.println(0b101 >> 1);
//        System.out.println("Hi. Я вношу изменения в файл");

        System.out.println("Проверка изменений на GitHub");



    }
}
















