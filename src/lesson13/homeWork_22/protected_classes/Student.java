package lesson13.homeWork_22.protected_classes;

public class Student {
    private String firstName, lastName, group;
    private int averageGrade;
    private double stipend;

    public Student(String firstName, String lastName, String group, int averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageGrade = averageGrade;
        calcStipend(this.averageGrade);
    }


    public void displayInfo() {
        System.out.printf("%1$s %2$s, группа %3$s, сумма стипендии: %4$.1f%n", firstName, lastName, group, stipend);
    }

    protected void calcStipend(int averageGrade) {
        if (averageGrade == 5) {
            setStipend(1000);
        } else {
            setStipend(800);
        }
    }


    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getGroup() {
        return group;
    }
    public int getAverageGrade() {
        return averageGrade;
    }
    public double getStipend() {
        return stipend;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public void setAverageGrade(int averageGrade) {
        this.averageGrade = averageGrade;
    }
    protected void setStipend(double stipend) {
        this.stipend = stipend;
    }
}
