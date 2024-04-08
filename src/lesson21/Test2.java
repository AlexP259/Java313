package lesson21;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        /*..................................... Буферизированные потоки .............................................*/
        // ByteArrayInputStream - входной поток массива байтов, позволяет читать данные из массива байтов
//        String text = "Hellooooo, wooorld!";
//        byte[] buffer = text.getBytes();
//        ByteArrayInputStream in = new ByteArrayInputStream(buffer);
//        try (BufferedInputStream bis = new BufferedInputStream(in)) {   // ну типа с ним быстрее, ну хз
//            int c;
//            while ((c = bis.read()) != -1) {
//                System.out.print((char) c);
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println();

        String text = "Hello, Java!";
        try (FileOutputStream fos = new FileOutputStream("src\\lesson21\\resources_test2\\notes2.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            byte[] buffer = text.getBytes();
            bos.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }
}
