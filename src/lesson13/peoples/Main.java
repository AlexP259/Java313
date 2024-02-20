package lesson13.peoples;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Даши","Батодалаев",16, "ГК",
                "Web_011", 5);
        Student student2 = new Student("Линар","Загидуллин",32, "РПО",
                "PD_011", 5);
        Human graduate1 = new Graduate("Сергей", "Шугани", 15, "РПО",
                "PD_011", 5, "Защита персональных данных");
        Teacher teacher1 = new Teacher("Андрей", "Даньшин", 38, "Астрофизика", 110);
        student1.info();
        student2.info();
        graduate1.info();
        teacher1.info();
    }
}
