package lesson13.peoples;

public class Graduate extends Student{
    private String topic;

    public Graduate(String firstName, String lastName, int age, String speciality, String group, int rating,
                    String topic) {
        super(firstName, lastName, age, speciality, group, rating);
        this.topic = topic;
    }

    @Override
    public void info() {
        super.info();
        System.out.print(this.topic);
    }
}
