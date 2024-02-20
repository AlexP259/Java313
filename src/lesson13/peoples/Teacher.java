package lesson13.peoples;

public class Teacher extends Human{
    private String speciality;
    private int skill;

    public Teacher(String firstName, String lastName, int age, String speciality, int skill) {
        super(firstName, lastName, age);
        this.speciality = speciality;
        this.skill = skill;
    }

    @Override
    public void info() {
        super.info();
        System.out.print(this.speciality + " " + this.skill);
    }
}
