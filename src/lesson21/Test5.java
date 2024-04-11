package lesson21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Test5 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("src\\lesson21\\resources_test5\\notes5.txt")) { // append есть как параметр writer
            String text = "Hello, ";
            writer.write(text);
            writer.append('\n');
            writer.append("Java");
            writer.flush();     // записывает в поток те данные, что хранятся в буфере
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileReader reader = new FileReader("src\\lesson21\\resources_test5\\notes5.txt")) {
            int c;
            String buffer = "";
            while ((c = reader.read()) != -1) {
                buffer += (char) c;
            }
            System.out.print(buffer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
