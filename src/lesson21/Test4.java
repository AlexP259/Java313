package lesson21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test4 {
    public static void main(String[] args) {
//        String text = "Привет мир!";
//        try (FileOutputStream fos = new FileOutputStream("src\\lesson21\\resources_test4\\notes3.txt");
//             PrintStream printStream = new PrintStream(fos)) {
//            printStream.println(text);  // тут println сохранил данные непосредственно в файл
//            System.out.println("Запись в файл была произведена");   // тут println выводит данные в консоль
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        /*.......................................... Другая вариация ...............................................*/
        try (PrintStream printStream = new PrintStream("src\\lesson21\\resources_test4\\notes4.txt")) {
            printStream.print("Hello World!");
            printStream.println("Welcome to Java!");
            printStream.printf("Name: %s, age: %d%n", "Сергей", 25);

            String message = "PrintStream";
            byte[] messageToByte = message.getBytes();
            printStream.write(messageToByte);   // допишем данные в наш файл

            System.out.println("Файл был записан!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
