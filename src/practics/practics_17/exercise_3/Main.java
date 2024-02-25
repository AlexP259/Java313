package practics.practics_17.exercise_3;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new President();
        worker1.print();
        Worker worker2 = new Security();
        worker2.print();
        Worker worker3 = new Manager();
        worker3.print();
        Worker worker4 = new Engineer();
        worker4.print();
    }
}
