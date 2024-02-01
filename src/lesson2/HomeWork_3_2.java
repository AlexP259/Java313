package lesson2;

import java.util.Scanner;

public class HomeWork_3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String city;
        int age;
        System.out.print("What is your name? ");
        name = input.nextLine();
        System.out.print("How old are you? ");
        age = input.nextInt();
//        input.nextLine();   // Очистка буфера
        System.out.print("Where are you live? ");
        city = input.nextLine();
        System.out.printf("%nThis is %s%nIt is %d%nHe lives in %s", name, age, city);
    }
}
