package practics.my_practics.my_practics_6_JUnit;

import java.util.*;

public class User {
    private int id;
    private String name;
    private int age;
    private Sex sex;
    private static Map<Integer, User> allUsers;
    private static int countId = 0;

    public User(String name, int age, Sex sex) {
        if (allUsers == null) {
            allUsers = new HashMap<>();
        }
        this.name = name;
        this.age = age;
        this.sex = sex;
        if (!hasUser()) {
            countId++;
            this.id = countId;
            allUsers.put(this.id, this);
        }
    }

    private boolean hasUser() {
        for (User user : allUsers.values()) {
            if (user.equals(this) && user.hashCode() == this.hashCode()) {
                return true;
            }
        }
        return false;
    }

    public static List<User> getAllUsers() {
        return new ArrayList<>(allUsers.values());
    }

    public static List<User> getAllUsers(Sex sex) {
        List<User> listAllUsers = new ArrayList<>();
        for (User user : allUsers.values()) {
            if (user.sex == sex) {
                listAllUsers.add(user);
            }
        }
        return new ArrayList<>(allUsers.values());
    }

    public static int getHowManyUsers() {
        return allUsers.size();
    }

    public static int getHowManyUsers(Sex sex) {
        return getAllUsers(sex).size();
    }

    public static int getAllAgeUsers() {
        int countAge = 0;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        User user = (User) o;
        return this.age == user.age && Objects.equals(name, user.name) && this.sex == user.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + this.id +
                ", name=" + this.name +
                ", age=" + this.age +
                ", sex=" + this.sex +
                "}";
    }
}


enum Sex {MALE, FEMALE}
