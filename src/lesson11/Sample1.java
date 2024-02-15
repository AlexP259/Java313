package lesson11;

public class Sample1 {
    public static void main(String[] args) {
        Sample1 outer = new Sample1();
        outer.print();
    }

    private int outer_x = 100;

    void print(){
        Inner inner = new Inner();
        inner.innerMethod();
    }


    class Inner{
        public void innerMethod(){
            System.out.println(outer_x);
        }

    }
}
