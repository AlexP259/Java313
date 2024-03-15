package lesson17.sample3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Роман",35,true,PetPreference.DOG, new ArrayList<>(Arrays.asList("изучение языков", "чтение")));
        Person p2 = new Person("Мария",26,false,PetPreference.SNAKE, new ArrayList<>(Arrays.asList("оригами", "чтение манги")));
        Person p3 = new Person("Александр",15,true,PetPreference.CAT, new ArrayList<>(Arrays.asList("туризм", "скалолазание")));
        Person p4 = new Person("Михаил",24,false,PetPreference.CAT, new ArrayList<>(Arrays.asList("геология", "путешествия")));
        Person p5 = new Person("Ольга",55,true,PetPreference.DOG, new ArrayList<>(Arrays.asList("плавание", "тренажерный зал")));


        ArrayList<Person> people = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));

        System.out.println(filter(people, p -> p.isExtravert()));
    }

    public static ArrayList<Person> filter(ArrayList<Person> people, Bias bias){
        ArrayList<Person> filteredPeople = new ArrayList<>();
        for (Person p : people) {
            if (bias.test(p)) {
                filteredPeople.add(p);
            }
        }
        return filteredPeople;
    }
}
