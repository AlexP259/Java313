package lesson11.number;

public class Number {
    public static int max(int a, int b, int c, int d){
//        return Math.max(Math.max(a, b), Math.max(c, d));
        int mx = a;
        if (b > mx) mx = b;
        if (c > mx) mx = c;
        if (d > mx) mx = d;
        return mx;
    }

    public static int min(int... num){
        int mn = num[0];
        for (int i = 1; i < num.length; i++){
            if(num[i] < mn){
                mn = num[i];
            }
        }
        return mn;
    }

    public static double average(int a, int b, int c, int d){
        return (a + b + c + d) / (double) 4;
    }

    public static int factorial(int a){
        int res = 1;
        for (int i = 1; i <= a; i++) {
            res *= i;
        }
        return res;
    }

}
