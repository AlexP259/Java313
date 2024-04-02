package lesson20.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Optional;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<>();
        Collections.addAll(phones, "iPhone X", "Nokia 9", "Huawei Nexus 6P", "Samsung Galaxy S8",
                "LG G6", "Xiaomi MI6", "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6", "Pixel 2");
        System.out.println(phones);

        boolean any = phones.stream().anyMatch(s -> s.length() > 10);  // anyMatch проверяет, что хотя бы 1 значение имеет заданную длину
        System.out.println(any);

        boolean all = phones.stream().allMatch(s -> s.length() > 10);  // allMatch проверяет, соответствуют ли ВСЕ элементы заданному условию
        System.out.println(all);

        boolean non = phones.stream().noneMatch(s -> s.length() > 10);  // noneMatch вернет true, если ни одно значение НЕ СООТВЕТСТВУЕТ заданному условию
        System.out.println(non);


//        Optional<String> first = phones.stream().findFirst();
//        System.out.println(first.get());
//
//        Optional<String> any = phones.stream().findAny();
//        System.out.println(any.get());


//        Scanner input = new Scanner(System.in);
//        List<String> phones = new ArrayList<>();
//        phones.addAll(Arrays.asList("iPhone X", "Nokia 9", "Huawei Nexus 6P", "Samsung Galaxy S8",
//                "LG G6", "Xiaomi MI6", "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6", "Pixel 2"));
//        System.out.println(phones);
//        int pageSize = 3;
//        while(true){
//            System.out.print("Введите номер страницы -> ");
//            int page = input.nextInt();
//            if (page < 1) {
//                break;
//            }
//            phones.stream().skip((page - 1) * pageSize)
//                    .limit(pageSize)
//                    .forEach(s -> System.out.println(s));
//        }


        Stream<String> phoneStream = Stream.of("iPhone X", "Nokia 9", "Huawei Nexus 6P", "Samsung Galaxy S8", "LG G6");
        phoneStream.skip(1).limit(2).forEach(s -> System.out.println(s));  // limit ставит лимит на то, сколько элементов выведется в принципе
//        phoneStream.skip(1).forEach(s -> System.out.println(s));    // пропустит первый элемент из потока


//        List<String> phones = new ArrayList<>();
//        Collections.addAll(phones, "iPhone X", "Nokia 9", "Huawei Nexus 6P", "Samsung Galaxy S8",
//                "LG G6", "Xiaomi MI6", "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6", "Pixel 2");
//        System.out.println(phones);
//        phones.stream().filter(p -> p.length() < 12).sorted().forEach(s -> System.out.println(s));
    }

}











