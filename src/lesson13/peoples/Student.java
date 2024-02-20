package lesson13.peoples;

public class Student extends Human{
    private String speciality, group;
    private int rating;

    public Student(String firstName, String lastName, int age, String speciality, String group, int rating) {
        super(firstName, lastName, age);
        this.speciality = speciality;
        this.group = group;
        this.rating = rating;
    }

    @Override
    public void info() {
        super.info();
        System.out.print(this.speciality + " " + this.group + " " + this.rating + " ");
    }
}
