package lesson21;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        /*.................................... Запишем поля нашего объекта в файл ...................................*/
        Person per = new Person("Сергей","Федоров",35,1.86, false);
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src\\lesson21\\resources_test3\\data.bin"))) {
            dos.writeUTF(per.name); // Записывает в поток строку в кодировке UTF-8
            dos.writeUTF(per.surName); // Записывает в поток строку в кодировке UTF-8
            dos.writeInt(per.age);  // Записывает в поток целочисленное значение
            dos.writeDouble(per.height); // Записывает в поток значение double
            dos.writeBoolean(per.married); // Записывает в поток булево значение
            System.out.println("Файл был записан!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        /*.................................... Считаем поля нашего объекта из файла ...................................*/
        try (DataInputStream dis = new DataInputStream(new FileInputStream("src\\lesson21\\resources_test3\\data.bin"))) {
            String name = dis.readUTF();
            String surName = dis.readUTF();
            int age = dis.readInt();
            double height = dis.readDouble();
            boolean married = dis.readBoolean();
            System.out.printf("Имя: %s, фамилия: %s, возраст: %d, рост: %.2f, женат: %b", name, surName, age, height, married);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}


class Person {
    public String name;
    public String surName;
    public int age;
    public double height;
    public boolean married;

    public Person(String name, String surName, int age, double height, boolean married) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.height = height;
        this.married = married;
    }
}











