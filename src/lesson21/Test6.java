package lesson21;

import java.io.*;
import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<Person2> people = new ArrayList<>();
        people.add(new Person2("Александр",37,187,true));
        people.add(new Person2("Михаил",30,175,false));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\lesson21\\resources_test6\\person.txt"))) { // Формат не читабелен
            // в любом случае, но считать мы из него можем
            oos.writeObject(people);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ArrayList<Person2> newPeople = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\lesson21\\resources_test6\\person.txt"))) {
            newPeople = (ArrayList<Person2>) ois.readObject();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (Person2 p : newPeople) {
            System.out.printf("Name: %s\t\tage: %d%nheight: %.2f\t\tmarried: %b%n", p.getName(), p.getAge(), p.getHeight(), p.isMarried());
        }

    }
}


class Person2 implements Serializable {
    private String name;
    private int age;
    private double height;
    private boolean married;

    public Person2(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarried() {
        return married;
    }
}