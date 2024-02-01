package lesson4;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Main {
    public static void main(String[] args) {
//        float num = 5.75f;
//        System.out.println(Math.PI);
//        System.out.println(Math.round(num));    // округление в сторону куда ближе
//        System.out.println(Math.ceil(num));     // округление вверх
//        System.out.println(Math.floor(num));    // округление вниз
//        System.out.println(Math.sqrt(16));       // находит квадратный корень
//        System.out.println(Math.pow(4, 2));     // возведение 4 в степень 2

        Scanner input = new Scanner(System.in);

//        System.out.print("Введите радиус окружности: ");
//        int radius = input.nextInt();
//        System.out.printf("Длина окружности: %.2f", 2 * Math.PI * radius);

//        int kat1, kat2;
//        System.out.print("Катет 1: ");
//        kat1 = input.nextInt();
//        System.out.print("Катет 2: ");
//        kat2 = input.nextInt();
////        System.out.print("Гипотенуза: " + Math.hypot(kat1, kat2));    // вариант попроще, следующие строки не нужны
//        double hypo = Math.sqrt(kat1 * kat1 + kat2 * kat2);
//        System.out.print("Гипотенуза: " + hypo);


//        Date current = new Date();   //123, 2, 21, 12, 15, 0
//        System.out.println(current);
////        System.out.println(current.getYear());
////        System.out.println(current.getMonth());
////        current.setMonth(5);
////        System.out.println(current);
//        System.out.println(current.getTime());
//        System.out.printf("%1$s %2$td %2$tB %2$tY %n", "Дата:", current);     // %1$s - $ тут номер параметра
//        System.out.printf("%s %te %<tB %<tY", "Дата: %n", current);
//        current.setTime(Date.parse("Jul 06 12:15:00 2021"));
//        System.out.println(current);
//
//        Calendar calendar = new GregorianCalendar();    //2022, 03,12
////        System.out.println(calendar);
//        System.out.println(calendar.get(Calendar.ERA));
//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.MONTH));
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//
//
//        GregorianCalendar calendar1 = new GregorianCalendar(2024, 03, 12);
//        int year = calendar1.get(Calendar.YEAR);
//        System.out.println(calendar1.isLeapYear(year));     // високосный или нет
//        System.out.println(calendar1.get(Calendar.MONTH));
//        System.out.println(calendar1.get(Calendar.DAY_OF_MONTH));


//        String[] mounths = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
//        GregorianCalendar calendar2 = new GregorianCalendar();
//        calendar2.set(Calendar.YEAR, 2024);
//        calendar2.set(Calendar.MONTH, 0);
//        calendar2.set(Calendar.DAY_OF_MONTH, 2);
//        System.out.print("Дата: " + mounths[calendar2.get(Calendar.MONTH)] + " ");
//        System.out.print(calendar2.get(Calendar.DATE) + " ");
//        System.out.println(calendar2.get(Calendar.YEAR) + " ");
//        System.out.print("Время: " + calendar2.get(Calendar.HOUR) + ":");
//        System.out.print(calendar2.get(Calendar.MINUTE) + ":");
//        System.out.println(calendar2.get(Calendar.SECOND));
//        int year = calendar2.get(Calendar.YEAR);
//        System.out.print(year + " - ");
//        System.out.print(calendar2.isLeapYear(year) ? "високосный" : "не високосный");


//        Calendar date1 = new GregorianCalendar();
//        Calendar date2 = new GregorianCalendar();
//        date1.set(Calendar.YEAR, 2000);


//        Calendar calendar = new GregorianCalendar(2024, Calendar.FEBRUARY, 28);
//        calendar.add(Calendar.DAY_OF_MONTH, 2);
//        calendar.roll(Calendar.MONTH, -4);
//        System.out.println(calendar.getTime());


//        Calendar calendar = new GregorianCalendar(2024, Calendar.FEBRUARY, 28);
//        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM y");
//        System.out.println(dateFormat.format(calendar.getTime()));


        long start = System.currentTimeMillis();
        System.out.println(start);

        for (int i = 0; i < 100; i++) {
            System.out.println("Случайное число: №" + i + ": \t" + (int)(Math.random() * 10));
        }

        long timeWorkProgram = System.currentTimeMillis() - start;
        System.out.println("Скорость выполнения программы: " + timeWorkProgram + " миллисекунд");

    }
}
