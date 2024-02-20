package lesson13.peoples;

public class Human {
    private String firstName;
    private String lastName;
    private int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void info() {
        System.out.print("\n" + this.lastName + " " + this.firstName + " " + this.age + " ");
    }
}
