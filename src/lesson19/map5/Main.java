package lesson19.map5;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        TreeMap<String, String> fileExtentions = new TreeMap<>();
//        fileExtentions.put("Python", "*.py");
//        fileExtentions.put("C++", "*.cpp");     // Будет стоять первым
//        fileExtentions.put("JavaScript", "*.js");
//        fileExtentions.put("Goland", "*.go");
//        fileExtentions.put("Java", "*.java");
//        fileExtentions.put("java", "*.java");   // Будет стоять последним, т.к. с маленькой буквы
//
//        System.out.println(fileExtentions);
//        System.out.println(fileExtentions.get("Java"));
//        fileExtentions.remove("Goland");
//        System.out.println(fileExtentions);

//        NavigableMap<String, String> fileExtentions1 = new TreeMap<>();
//        fileExtentions1 =  fileExtentions.descendingMap();
//        System.out.println(fileExtentions.descendingMap()); // выведет карту с порядком ключей по-убыванию
//        System.out.println(fileExtentions.lastEntry());
//        System.out.println(fileExtentions.firstEntry());

//        TreeMap<String, String> fileExtentions = new TreeMap<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
        TreeMap<String, String> fileExtentions = new TreeMap<>((o1, o2) -> o2.compareTo(o1));
        fileExtentions.put("Python", "*.py");
        fileExtentions.put("C++", "*.cpp");     // Будет стоять первым
        fileExtentions.put("JavaScript", "*.js");
        fileExtentions.put("Goland", "*.go");
        fileExtentions.put("Java", "*.java");
        fileExtentions.put("java", "*.java");   // Будет стоять последним, т.к. с маленькой буквы


        System.out.println(fileExtentions);
        System.out.println(fileExtentions.get("Java"));
        fileExtentions.remove("Goland");
        System.out.println(fileExtentions);

    }
}
