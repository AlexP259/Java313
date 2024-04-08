package lesson21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test1 {
    public static void main(String[] args) {
        /*..................................... Запись в файл через буфер ..........................................*/
//        String text = "Hello world!";
//        try (FileOutputStream fos = new FileOutputStream("src\\lesson21\\resources_test1\\notes.txt")) {    // append: true - дозапись в файл
//            // FileOutputStream работает с байтовыми данными, поэтому нам надо передавать массив именно байт
//            byte[] buffer = text.getBytes();    // из строки берем набор байт
//            fos.write(buffer, 0, buffer.length);    // от 0 до длины массива (не включительно)
//        } catch (IOException e) {   // ошибка ввода-вывода
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Файл был записан!");
        /*.................... Считывание из файла без буфера, в цикле по 1 байту за итерацию .......................*/
//        try (InputStream fis = new FileInputStream("src\\lesson21\\resources_test1\\notes.txt")) {
//            System.out.printf("Размер файла: %d байт%n", fis.available());  // вернет количество байт в потоке, доступных для чтения
//            int i, counter = 0;
//            while((i = fis.read()) != -1) { // Метод чтения возвращает int, считывая 1 байт входного потока за раз
//                // (значение байта от 0 до 255. -1, если конец потока достигнут)
//                System.out.print((char) i); // пока получаем байты из потока, преобразуем их в char
//                counter++;
//            }
//            System.out.println("\n" + counter);
//        } catch (IOException ex) {
//            System.out.println("Ошибка: " + ex.getMessage());
//        }
        /*............... Считывание из файла в буфер, а потом запись с этого буфера в другой файл ..................*/
//        try (FileInputStream fis = new FileInputStream("src\\lesson21\\resources_test1\\notes.txt");
//            FileOutputStream fos = new FileOutputStream("src\\lesson21\\resources_test1\\notes_new.txt")) {
//            byte[] buffer = new byte[fis.available()];
//            fis.read(buffer, 0, buffer.length);   // считать данные в массив "buffer", заполнить массив начиная с
//            // индекса "0". "buffer.length" - это количество байтов, которое нужно считать из файла и записать в массив buffer
//            fos.write(buffer, 0, buffer.length);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }







    }
}




















