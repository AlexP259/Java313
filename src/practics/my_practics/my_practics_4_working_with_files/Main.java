package practics.my_practics.my_practics_4_working_with_files;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {
        // В общем, есть потоки ввода/вывода (I/O Streams)
        // Байтовые:   InputStream, OutputStream       и       символьные:   Reader, Writer

//        String fileName = "test.txt";
//        String fullName = "";
//        // user.dir - это системное свойство в Java, которое предоставляет путь к текущему рабочему каталогу, в
//        // котором выполняется Java-программа. Когда программа запускается, user.dir содержит путь к каталогу, из
//        // которого была запущена программа.
//        // Таким образом, когда используется System.getProperty("user.dir"), Java возвращает строку, содержащую путь
//        // к текущему рабочему каталогу.
//        // Получение информации о версии Java:
//        // String javaVersion = System.getProperty("java.version");
//        // System.out.println("Java Version: " + javaVersion);
//        // Получение информации о операционной системе:
//        // String osName = System.getProperty("os.name");
//        // System.out.println("Operating System: " + osName);
//        // Получение информации о пользовательском домашнем каталоге:
//        // String userHome = System.getProperty("user.home");
//        // System.out.println("User Home Directory: " + userHome);
//        // Эти примеры позволяют получить различные системные свойства, такие как версия Java, операционная система и
//        // домашний каталог пользователя, с помощью метода System.getProperty.
//        String dirName = System.getProperty("user.dir");
//
//        // File.separator - это строковая константа в Java, которая представляет разделитель пути к файлу в
//        // зависимости от операционной системы. Например, в Windows разделитель пути к файлу - это обратный слеш \,
//        // а в Unix/Linux - это прямой слеш /.
//        fullName = dirName + File.separator + fileName;
//        System.out.println("File path: " + fullName);
//        File file = new File(fullName); // создан объект в программе, НО НЕ ФАЙЛ НА ДИСКЕ
//
//        if (! file.exists()) {
//            try {
//                if (file.createNewFile()) {
//                    System.out.println("Файл создан!");     // Вот теперь при первом запуске файл создан
//                } else {
//                    System.out.println("Что-то не так!");
//                }
//            } catch (IOException ex) {
////                Logger.getLogger(Filetest.class.getName().log(Level.SEVERE, null, ex));
//                System.out.println(ex.getMessage());
//            }
//        } else {
//            System.out.println("Файл уже существует!");
//        }

        // тут будет: E:\java_projects\TOP ACADEMY\Java313\lessons1/tmp/user/java/bin, что ошибочно, т.к. в
        // винде используется \ - обратный слэш. Но все равно отработает
//        dirName =  dirName + "/tmp/user/java/bin";
//        System.out.println(dirName);
//        File d = new File(dirName);
////        d.mkdirs();

//        File file = new File("F:\\download\\123\\234");
//        file.mkdirs();

//        InputStream in = null;
//        OutputStream out = null;
//        byte[] buffer = null;
//        try {
//            in = new FileInputStream(new File("img.jpg")); // Этот класс представляет собой входящий поток данных от указанного файла,
//            // конструктору потока мы передаем объект типа File
//            buffer = new byte[in.available()];  // Создаем массив размером с количество байтов во входном потоке, доступных для чтения
//            in.read(buffer);    // Читает байты из входного потока в наш "буффер" - массив
//            File file = new File("outputFile.tmp"); // Создаем объект "файл", в который будем сохранять байты. Файл
//            // изначально не существует и будет создан при запуске программы. Если файл с этим именем есть, он будет перезаписан
//            out = new FileOutputStream(file);   // Создаем выходной поток, указываем в какой файл будет идти этот поток
//            out.write(buffer);  // Записываем в этот выходной поток байты из "буффера"
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                in.close();
//                out.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }

//        byte[] buffer = null;
//        File file = new File("outputFile.jpg");
//        try (InputStream in = new FileInputStream(new File("img.jpg"));
//             OutputStream out = new FileOutputStream(file);) {
//            buffer = new byte[in.available()];
//            in.read(buffer);
//            out.write(buffer);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }

        InputStream in = null;
        OutputStream out = null;
        byte[] buffer = new byte[8 * 1024];
        try {
            in = new FileInputStream(new File("2.jpg"));
            out = new FileOutputStream(new File("outputFile2.tmp"));
            int bytesRead = 0;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }
}
















