package lesson11.groups;

public class Student {
    private String name;
    private String initials;
    private int group;
    private int[] marks;

    public Student(String name, String initials, int group){
        this.name = name;
        this.initials = initials;
        this.group = group;
        this.marks = new int[5];
    }

    public void print(){
        System.out.printf("%-16s%-8s", this.name, this.initials);
        System.out.printf("Группа: %-4d Оценки: ", this.group);
        for (int i = 0; i < this.marks.length; i++) {
            System.out.print(this.marks[i] + " ");
            
        }
        System.out.println();
    }
}
