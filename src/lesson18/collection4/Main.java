package lesson18.collection4;

public class Main {
    public static void main(String[] args) {
        System.out.println("main start");
        method3();
        System.out.println("main end");
    }

    static void method1(){
        System.out.println("Method_1 start");
        System.out.println("Method_1 end");
    }

    static void method2(){
        System.out.println("Method_2 start");
        method1();
        System.out.println("Method_2 end");
    }

    static void method3(){
        System.out.println("Method_3 start");
        method2();
        System.out.println("Method_3 end");
    }
}
