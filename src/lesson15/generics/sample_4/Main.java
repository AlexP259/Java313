package lesson15.generics.sample_4;

public class Main {
    public static void main(String[] args) {
        Short[] ar = {1, 2, 3, 4};
        Short val = 4;

        boolean flIn = Math.<Short>isIn(val, ar);
        System.out.println(flIn);
    }
}


class Math{
    public static <T> boolean isIn(T val, T[] arr) {
        for (T t : arr) {
            if (val.equals(t)) {
                return true;
            }
        }
        return false;
    }
}