package lesson13.homeWork_22.protected_classes;

public class Aspirant extends Student{
    private String workTheme;


    public Aspirant(String firstName, String lastName, String group, int averageGrade, String workTheme){
        super(firstName, lastName, group, averageGrade);
        this.workTheme = workTheme;
    }


    public String getWorkTheme() {
        return workTheme;
    }
    public void setWorkTheme(String workTheme) {
        this.workTheme = workTheme;
    }


    @Override
    public void displayInfo() {
        System.out.printf("%1$s %2$s, группа %3$s, тема работы: \'%5$s\', сумма стипендии: %4$.1f%n", getFirstName(),
                getLastName(), getGroup(), getStipend(), getWorkTheme());
    }

    @Override
    protected void calcStipend(int averageGrade) {
        if (averageGrade == 5) {
            setStipend(2000);
        } else {
            setStipend(1800);
        }
    }
}
