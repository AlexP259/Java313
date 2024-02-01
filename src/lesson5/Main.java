package lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String name = "Andrey";
//        hello(name);
//        hello("Igor");
//
//        getSum(2, 5);
//
//        int a = 1;
//        int b = 7;
//        getSum(a, b);
//
//        int n1 = 3, n2 = 7;
//        getSum(n1, n2);

//        symbolDraw(7, '%', '*');

//        int a = 30, b = 45;
//        System.out.println("До вызова метода: a = " + a + ", b = " + b);
//        swapFunction(a, b);
//        System.out.println("После вызова метода: a = " + a + ", b = " + b);

//        int a;
//        int b;
//        Scanner input = new Scanner(System.in);
//        System.out.print("a = ");
//        a = input.nextInt();
//        System.out.print("b = ");
//        b = input.nextInt();
//        System.out.println("Результат: " + difOrSum (a, b));


//        for (int i = 1; i < 11; i++) {
//            System.out.println("Куб числа " + i + " = " + cubeOfNum(i));
//        }

//        sum(1, 2, 3);
//        sum(1, 2, 3, 4, 5);
//        sum();

//        sum(20, "welcome", "World!");

//        max(2, 7, 0, 3, 1, 5, -13);
//        max(2, 7, 0, 3, 1, 5, -13, 13);
//        max(26);
//        max(99, 99, 100, 34, -93);
//        max(99, 39, 99, 100, 34);

//        System.out.println(bigrThanAvrg(1, 5, 6, 8, 0, -4, 6, 8, 9, 12));


        System.out.println(stringX("xabxxxcdx"));


    }

    public static String stringX(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result = result + str.substring(i, i+1);
            }
        }
        return result;
    }

//    public static String bigrThanAvrg(int... arr){
//        double avrg = 0;
//        int countArr2 = 0;
//        for (int i : arr) {
//            avrg += i;
//        }
//        avrg /= arr.length;
//        for (int i : arr) {
//            if (i < avrg) countArr2++;
//        }
//        System.out.println(countArr2);
//        int[] arr2 = new int[countArr2];
//        for (int i = 0, j = 0; i < arr.length; i++) {
//            if (arr[i] < avrg) {
//                arr2[j++] = arr[i];
//            }
//        }
//        System.out.println(avrg);
//        return Arrays.toString(arr2);
//    }

//    public static void max(int... massiv){
//        int max = 0;
//        for (int i : massiv) {
//            if (i > 0 && max < i && i % 13 == 0){
//                max = i;
//            }
//        }
//        System.out.println(max == 0 ? "Число не найдено" : max);
//    }

//    public static void sum(int nums, String ...message){ // три точки - нам не обязательно передавать заданное
//        // кол-во значений, они придут массивом. Три точки могут быть только 1 раз в конце передаваемых параметров
//        System.out.println(nums);
//        System.out.println(Arrays.toString(message));
//        for (String s : message) {
//            System.out.print(s + "\t");
//        }
//    }

//    public static void sum(String message, int ...nums){
//
//    }



//    public static int cubeOfNum(int a) {
//        return (int) Math.pow(a, 3);
//    }
//
//    public static int difOrSum(int a, int b) {
//        int res;
//        if (a > b) {
//            res = a - b;
//        } else if (a < b) {
//            res = a + b;
//        } else {
//            res = 0;
//        }
//        return res;
//    }
//
//    public static int min(int n1, int n2) {
//        return (n1 < n2 ? n1 : n2);
//    }
//
//    public static void hello(String name) {
//        System.out.println("Hello " + name + "!");
//    }
//
//    public static void getSum(int a, int b) {
//        System.out.println(a + b);
//    }
//
//    public static void symbolDraw(int numCol, char symb1, char symb2) {
//        while (numCol-- > 0) {
//            System.out.print(symb1 + "" + symb2);
//        }
//    }
//
//    public static void swapFunction(int n, int m) {
//        System.out.print("До перемены местами: n = " + n + ", ");
//        System.out.println("m = " + m);
//        n = n + m;
//        m = n - m;
//        n = n - m;
//        System.out.print("После перемены местами: n = " + n + ", ");
//        System.out.println("m = " + m);
//    }

}
