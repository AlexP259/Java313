package lesson17.sample3;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private boolean extravert;
    private PetPreference petPreference;
    private ArrayList<String> hobbies;

    public Person(String name, int age, boolean extravert, PetPreference petPreference, ArrayList<String> hobbies) {
        this.name = name;
        this.age = age;
        this.extravert = extravert;
        this.petPreference = petPreference;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public boolean isExtravert() {
        return extravert;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person(name='" + this.name + "', age='" + this.age + "', extravert='" + this.extravert
                +  "', petPreference='" + petPreference + "', hobbies='" + this.hobbies + "')\n";
    }
}
