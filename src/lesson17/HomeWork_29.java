package lesson17;

import java.util.function.Predicate;

public class HomeWork_29 {
    public static void main(String[] args) {
        Predicate<Integer> isPrimeNum = x -> {
            if (x < 2) return false;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        };

        int num = 271;
        boolean res = isPrimeNum.test(num);
        System.out.println(res);
    }
}

