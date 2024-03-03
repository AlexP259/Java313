package practics.practics_18.exercise_1;

public class Main {
    public static void main(String[] args) {
        Array myArr = new Array(new int[]{3,22,5,21,5,2,72,3,56,2,17,3,5,10});
        myArr.print();
        myArr.print("Hello");
        System.out.println(myArr.min());
        System.out.println(myArr.max());
        System.out.println(myArr.avg());
        myArr.sortAsc();
        myArr.print();
        myArr.sortDesc();
        myArr.print();
    }
}



