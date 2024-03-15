package lesson17.sample4;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        Predicate<Integer> isPositive = x -> x > 0;
//        System.out.println(isPositive.test(5));
//        System.out.println(isPositive.test(-5));

        Predicate<String> isPalindrome = str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        };
        String word1 = "мадам";
        boolean res = isPalindrome.test(word1);
        System.out.println(res);
    }
}

