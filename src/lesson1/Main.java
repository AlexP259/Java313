package lesson1;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Привет Мир");
        System.out.print("");*/
        /*for (byte i = 12; i < 129; i++) {
            System.out.println(i);
        }*/

       /* int a = 1, b = 2;
        System.out.println("a = " + a + ", " + "b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + ", " + "b = " + b);*/

        /*float a = 8.5F;
        System.out.println(a);
        double b = 8D;
        System.out.println(b);*/

     /*   System.out.println(((Object)512).getClass().getSimpleName());   // Смотрим какой тип данных у литерала "512"
        short a = 1234;
        System.out.println((Object)(a).getClass().getSimpleName());*/

        /*int num2 = 0b10010;
        System.out.println(num2);
        int num8 = 022;
        System.out.println(num8);
        int num16 = 0x12;
        System.out.println(num16);  // Сам JDK возвращает всегда в 10-й системе счисления*/

      /*  int x = 123_456__789;
        System.out.println(x);
        double y = 243_456.536_352;
        System.out.println(y);*/

       /* System.out.println("2 + 2 = ");
        System.out.print(2 + 2);*/

        /*int a = 5, b = 6;
        System.out.printf("a = %d, b = %d", a, b);  // %d используется для подстановки целочисленных значений*/

        /*String name = "Ирина";
        int age = 25;
        float height = 1.7f;
        System.out.printf("Меня зовут %s. Мне %d лет. Мой рост %.2f", name, age, height);
        // %s - Для строк. %f - для вещественных чисел. %c - для отдельного символа (тип char)*/

       // System.out.printf("%8d%n");

        /*System.out.println(5 + 2);
        System.out.println(5 - 2);
        System.out.println(5 * 2);
        System.out.println(5 / 2);*/

       /* int num = 4321;
        int a, b, c, d, res;
        System.out.printf("Исходное число: %d %n", num);
        a = num % 10;
        System.out.println(a);
        b = num / 10 % 10;
        System.out.println(b);
        c = num / 100 % 10;
        System.out.println(c);
        d = num / 1000 % 10;
        System.out.println(d);
        res = a * 1000 + b * 100 + c * 10 + d;
        System.out.printf("Обратное число: %d", res);*/

        //  ++a, a++ - инкремент
        //  --a, a-- - декремент
       /* int a = 1, b = 2;
        System.out.println(a);
        System.out.println(b);*/

//        System.out.printf("%8d%n", 123);
//        System.out.printf("%4d%5d%n", 123, 456);
//        System.out.printf("%4d%n", 123456789);
//        System.out.printf("%16.2f%n", 123.456789);
//        System.out.printf("%-6s%5d%n", "num =", 456);



//        System.out.printf("--------------------------------%n");
//        System.out.printf("       JAVA PRIMITIVE TYPES    %n");
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %4s |%n", "CATEGORY", "NAME", "BITS");
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "double", 64);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "float", 32);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "long", 64);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "int", 32);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "short", 16);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "byte", 8);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "char", 16);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "boolean", "boolean", 1);
//        System.out.printf("--------------------------------%n");

        // Преобразование базовых типов данных

/*        int x = 5;
        byte y = (byte)x;
        System.out.println(y);*/

        /*byte x = 5;
        int y = x;
        System.out.println(y);*/

        /*int x = 975953373;
        float y = x;
        System.out.println(y);*/

       /* int x = 258;
        byte y = (byte) x;
        System.out.println(y);*/

        /*double x = 18.9848;
        int y = (int) x;
        System.out.println(y);*/

  /*      int a = 5, b = 3, c = 7;
        int sum = a + b + c;
        int mltply = a * b * c;
        float avrg = (float)(a + b + c) / 3;
        System.out.println(sum);
        System.out.println(mltply);
        System.out.printf("%.2f", avrg);*/

//        long a = 5;
//        float b = 4.7f;
//        float c = a + b;
//        System.out.println(c);
//        byte x = 'q';
//        System.out.println(x);

        String str = "Hello";
        System.out.println(endUp(str));




    }



    public static String endUp(String str) {
        if (str.length() > 3){
            return str.toUpperCase();
        } else {
            return str.toUpperCase();
        }
    }
}
















